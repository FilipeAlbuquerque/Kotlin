fun main() {
    fun forceChocke(){
        println("You have failed me for the last time Admiral...")
    }
    forceChocke()

    //function passing parameter
    fun makeAnEntrance(line: String){
        println(line)
    }
    makeAnEntrance("I find your lack of faith disturbing.")

    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int): Int{
        val goodGuys = rebels + ewoks
        return goodGuys
    }
    val rebels = calculateNumberGoodGuys(5, 7)
    println("Darth Vader faced off against $rebels rebel scum.")
    //the same
    println("Darth Vader faced off against ${calculateNumberGoodGuys(5,7)} rebel scum.")

    //function with default value
    fun vaderIsFeeling(mood: String = "angry"){
        println(mood)
    }
    vaderIsFeeling()
    //can override the default value
    vaderIsFeeling("happy")
}