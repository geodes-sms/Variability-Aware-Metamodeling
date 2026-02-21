package featureModelAnalyzer

data class Metrics(
    var abstractCount: Int = 0,
    var concreteCount: Int = 0,
    var mandatoryCount: Int = 0,
    var optionalCount: Int = 0,
    var orGroups: Int = 0,
    var altGroups: Int = 0,
    var height: Int = 0,
    var width: Int = 0
)