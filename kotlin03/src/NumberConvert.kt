import kotlin.math.roundToInt

fun main() {

    //val number1: Int = "8.98".toInt()
    val number1: Int? = "8.98".toIntOrNull()
    println(number1)

    println(8.956756.toInt())
    println(8.956756.roundToInt())

    val s = "%.2f".format(8.956756)
    println(s)
}