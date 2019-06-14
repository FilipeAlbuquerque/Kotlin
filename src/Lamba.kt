import javax.annotation.processing.Completion

fun main() {

    val printMessage = {message: String -> println(message)}
    printMessage("Hello World")

    val sumA = {x: Int, y: Int -> x + y}
    println(sumA(5,3))

    val sumB : (Int, Int) -> Int = {x,y -> x + y}
    println(sumB(5,4))

    //working with web request examples
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

    fun downloadCarData(url: String, completion: (Car) -> Unit){
        //sent a request
        //we got back a car data
        //we made the car with their parameters
        //then we call completion to return to the user
        val car = Car("Tesla", "ModelX", "Blue")
        completion(car)

    }

    downloadCarData("fakeUrl.com") {car ->
        println(car.color)
        println(car.make)
        println(car.model)
    }

    //the same
    //lambda with only one argument can be placed with "it"
    downloadCarData("fakeUrl.com"){
        println(it.color)
        println(it.make)
        println(it.model)
    }

    fun downloadTruckData (url: String, completion : (Truck?, Boolean) -> Unit) {
        //we make the web request
        //we get the results back
        val webRequestSuccess = true
        if(webRequestSuccess){
          val truck = Truck("Ford", "F-150", 10000)
          completion(truck, true)
        } else{
            completion(null, false)
        }
    }

    downloadTruckData("fakeUrl.com"){ truck, success ->
        if (success){
            truck?.accelerate()
        } else{
            println("Something went wrong!!")
        }
    }


}