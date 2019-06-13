fun main() {

    val imperials = listOf("Emperor", "Dark Vader", "Boba Fett", "Tarkin")
    println(imperials)
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.last())
    println(imperials.contains("Luke")) // false
    println(imperials.contains("Emperor")) // true

    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0, "Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))

    //Map
    val rebelsVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "LandSpeeder")
    println(rebelsVehiclesMap["Solo"])
    println(rebelsVehiclesMap.getOrDefault("Leiah", "This ship doesnt exist"))
    println(rebelsVehiclesMap.values)

    //HashMap
    val rebelsVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "LandSpeeder", "Boba Fett" to "Some ship")
    rebelsVehicles ["Luke"] = "XWing"
    rebelsVehicles.put("Leiah", "Tantive IV")
    println(rebelsVehicles)
    rebelsVehicles.remove("Boba Fett")
    println(rebelsVehicles)
    rebelsVehicles.isEmpty()

}