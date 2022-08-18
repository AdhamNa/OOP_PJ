import java.util.Scanner

fun main() {
    val scn = Scanner(System.`in`)
    println("Enter BMW's model,colour,speed")
    val firstCar = Bmw(scn.nextLine(), scn.nextLine(), scn.nextInt())
    println("Enter tesla's model,colour,speed")
    scn.nextLine()
    val secoundVehicle = Tesla(scn.nextLine(),scn.nextLine(),scn.nextInt())
    println("BMW's model is ${firstCar.model} and its colour ${firstCar.colour} with a speed " +
            "${firstCar.Speed} and a fuel type ${firstCar.fuelType()}")
    println("tesla's model is ${secoundVehicle.model} and its colour ${secoundVehicle.colour} with a speed" +
            " ${secoundVehicle.Speed} and a fuel type ${secoundVehicle.fuelType()}")

}

abstract class Car (val model:String,val colour:String,val Speed:Int){
    abstract fun fuelType():String
}
class Bmw(model: String,colour: String,Speed: Int): Car(model, colour, Speed){
    override fun fuelType(): String {
        return "Gasoline 95"
    }
}
class Tesla(model: String,colour: String,Speed: Int):Car(model, colour, Speed){
    override fun fuelType(): String {
        return "Electric car"
    }
}