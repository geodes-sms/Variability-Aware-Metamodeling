# Utility tools used for the evaluation
* Run ```Gradle clean assemble```

## config2xmi - A parser to generate a .xmi configured FM based on a given FM .ecore

### How to run

* inside ```parser/config2xmi/projects``` add the two .xml files representing the FM and a valid config
* Run ```config2xmi/Main.kt```
* .xmi files are saved in ```parser/config2xmi/output```
* Use those .xmi as input for the ALT transformation 

## xmi2ecore - A parser to generate a .ecore from a given .xmi (metamodel-like)

### How to run

* inside ```parser/xmi2ecore/input``` add the .xmi files generated from the ALT transformation
* Run ```xmi2ecore/Main.kt```
* .ecore files are saved in ```parser/xmi2ecore/output```
* Use those .ecore as input for a Ecore modeling project in Eclipse

## MetamodelAnalyzer - A simple tool do analyze .ecore files and extract information

### How to run


* Paste the .ecore files inside the folder ```metamodels```
* Run ```metamodelAnalyzer/Main.kt``` 
* Results are saved as a CSV inside the folder ```results```

