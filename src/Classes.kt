/*class Car constructor (val make: String, val model: String, var color: String) {

    fun accelerate(){
        println("vrom vrom vrommm")
    }

    fun details(){
        println("This is a $color $make $model")
    }

}*/

/*class Truck(val make:String, val model: String, var towCapacity: Int){

    fun tow(){
        println("Lets go blow the road, baby!!")
    }

    fun details(){
        println("The $make $model has a capacity of $towCapacity lbs")
    }


}*/

open class Vehicle (val make: String, val model: String){

    open fun accelerate() {
        println("vroom vroomm vroomm")
    }

    fun park(){
        println("the car is parking")
    }

    fun brake(){
        println("STOP!!")
    }
}

class Car(make: String, model: String, var color: String): Vehicle(make, model){
    override fun accelerate() {
        println("We are going ludicrous mode!!")
    }
}


class Truck(make: String, model: String, var towingCapacity: Int) : Vehicle(make, model){

    override fun accelerate() {
        println("headed out to the montains!")
        //its possible to do the same thing of the super class at the same time
        super.accelerate()
    }
}



fun main () {

    val tesla = Car("Tesla", "Model S", "Blue")
    tesla.accelerate()
    tesla.park()
    tesla.brake()

    val truck = Truck("Ford", "F-150",10000)
    truck.accelerate()



   /* val carDemo = Car("Golf", "Wolksvagen", "Red")
    println(carDemo.make)
    println(carDemo.model)
    carDemo.accelerate()
    carDemo.details()

    val truck = Truck("Amarok", "Wolksvagen", 150000)
    truck.tow()
    truck.details()*/
}