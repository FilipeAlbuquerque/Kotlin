fun main() {

    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")

    val rebelsVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "LandSpeeder", "Boba Fett" to "Rocket Pack")

    for (rebel in rebels){
        println("Name: $rebel")
    }

    for ((key, value) in rebelsVehicles){
        println("$key gets around in their $value")
    }

    var x = 0
    while (x <= 10){
        println(x)
        x++
    }

    println()
    println()
    var y = 10
    while (y >= 0){
        println(y)
        y--
    }
}
