fun main() {
    var cap = Car("Merceidez","E200","black",6)
    cap.carry(4)
    cap.carry(10)
    cap.identity()
    var parkingFees = cap.calculateParkingFee(8)
    println("P.F: $parkingFees")
    var capBus = Bus("Suzuki", "Mazda", "Red",5)
    var maxFare = capBus.maxTripFare(30.0)
    println("$maxFare")
    var parkingfees = capBus.calculateParkingFee(2)
    println("$parkingfees")


}
open class Car(var make:String, var model:String, var color:String, var capacity:Int){
    fun carry(people:Int){
        if (people <= capacity){
           println("Carrying $people passengers")
        }
        else{
            var overCapacity = people - capacity
            println("Over capacity by $overCapacity people")
        }
    }

    fun identity(){
        println("I am a $color $make $model")
    }

   open fun calculateParkingFee(hours:Int):Int{
        return hours * 20

    }

}
class Bus(make: String, model: String, color: String, capacity: Int): Car("Merceidez","E200","black",6){
    override fun calculateParkingFee(hours: Int):Int{
        return hours * capacity
    }
    fun maxTripFare(fare:Double):Double{
        return capacity * fare
    }

}


