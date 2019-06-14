fun main() {

    //var name : String = "Filipe Augusto"
    //name = null

    var nullableName : String? = "Filipe Augusto"
    nullableName = null

    //if else for beginners
    var length = 0
    if (nullableName != null){
        length = nullableName.length
    } else {
        length = -1
    }
    println(length) // -1

    //the same
    //nullableName = "Filipe Augusto"
    //if else for advanced programmers
    val l = if (nullableName != null) nullableName.length else -1
    println(l)

    //Second method - Safe call operator
    println(nullableName?.length)  //null

    //Third method - Elvis operator
    //Provides a default value if the variable is null (to avoid NullPointException)
    val len = nullableName?.length ?: -1
    //nullableName está nulo
    val noName = nullableName ?: "No one knows me..." //se for nulo, use a string
    println(noName)

    //Forth method -  !!
    //nullableName = null
    //println(nullableName!!.length) //throws NullPointException

    nullableName = "I exist"
    println(nullableName!!.length)
}