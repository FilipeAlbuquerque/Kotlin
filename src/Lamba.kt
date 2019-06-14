import javax.annotation.processing.Completion

fun main() {

    val printMessage = {message: String -> println(message)}
    printMessage("Hello World")

    val sumA = {x: Int, y: Int -> x + y}
    println(sumA(5,3))

    val sumB : (Int, Int) -> Int = {x,y -> x + y}
    println(sumB(5,4))


    fun downloadData(url: String, completion: ()-> Unit){
        //sent a download request
        //we got back data
        //there were no network errors
        //then
        completion()
    }

    downloadData("fakeURL.com") {
        println("The code in this block, will only run" +
                " after the completion()")
    }

    
}