fun main() {

    val str = "May the force be with you."
    println(str)
    println()
    val rawCrawl = """|A long time ago
        |in a galaxy
        |far, far, far away
        |BUMM BUMMM BUMMMM BUMMMM""".trimMargin()
    println(rawCrawl)

    val reverseString = str.reversed()
    println(reverseString)

    val toUppercase = str.toUpperCase()
    println(toUppercase)

    val lower = str.toLowerCase()
    println (lower)

    val subsequence = str.subSequence(4, 13)
    println(subsequence)

    val contains = str.contains("force", true)
    println(contains)

    val contains2 = str.contains("Force", false)
    println(contains2)

    val contentEquals = str.contentEquals("May the force be with you.")
    println(contentEquals)

    val luke = "Luke Skywalker"
    val lightSaber = "green"
    val vehicle = "landscape"
    val age = 27
    println("$luke has a $lightSaber lightsaber and drives a $vehicle and is $age years old")
    println("Lukes full name: '$luke' has ${luke.length} characters.")
}