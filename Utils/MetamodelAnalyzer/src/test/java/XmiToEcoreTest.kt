import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import parser.transformXmiToEcore
import java.io.File

class XmiToEcoreTest {

    @Test
    fun xmi2ecore() {
        // Arrange
        val input = File("parser/xmi2ecore/input/input.xmi")
        val output = File("parser/xmi2ecore/output/output.ecore")

        output.parentFile.mkdirs()

        // Act
        transformXmiToEcore(input, output)

        // Assert
        assertTrue(output.exists(), "Output Ecore file should exist")

        val content = output.readText()

        assertTrue(
            content.contains("<ecore:EPackage"),
            "Ecore package root element should exist"
        )

        assertTrue(
            content.contains("name=\"ReLiS\""),
            "Package name should be ReLiS"
        )

        assertTrue(
            content.contains("eClassifiers"),
            "EClassifiers should be generated"
        )

        assertTrue(
            content.contains("xsi:type=\"ecore:EClass\""),
            "EClassifiers should have correct type"
        )

        assertTrue(
            content.contains("eSuperTypes"),
            "Inheritance relationships should be present"
        )
    }
}
