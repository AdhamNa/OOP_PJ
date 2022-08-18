import java.util.Scanner

fun main() {
    val scn = Scanner(System.`in`)
    println("Enter BMW's model,colour and it's maxSpeed")

    val bmwO = BMW(scn.nextLine(), scn.nextLine(), scn.nextInt())
    println("Enter tesla's model,colour and it's maxSpeed")
    scn.nextLine()
    val teslaR = Tesla(scn.nextLine(), scn.nextLine(), scn.nextInt())

    bmwO.getFuelType()
    bmwO.wheelsSize()
    teslaR.getFuelType()
    teslaR.wheelsSize()

    println("Tesla's model ${teslaR.model} and BMW's model ${bmwO.model}")
    println("Tesla's colour is ${teslaR.colour} and BMW colour is ${bmwO.colour}")
    println("Tesla's max speed is ${teslaR.maxSpeed} and BMW max speed is ${bmwO.maxSpeed}")

}
interface TransportType {
    fun getFuelType()
    fun wheelsSize()
}
abstract class Car(val model :String, val colour :String, val maxSpeed:Int) : TransportType {
    abstract override fun getFuelType()
    abstract override fun wheelsSize()
}
class BMW(model:String,colour:String,maxSpeed:Int) :Car(model, colour, maxSpeed){
    override fun getFuelType() {
        println ("BMW use gasoline 95")
    }

    override fun wheelsSize() {
        println ("19-inch")
    }
}
class Tesla(model:String,colour:String,maxSpeed:Int) : Car(model, colour, maxSpeed) {
    override fun getFuelType() {
        println(" Tesla is an electric")
    }

    override fun wheelsSize() {
        println ("18-inch")
    }
}

