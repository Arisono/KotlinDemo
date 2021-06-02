data class Coordinate(var x: Int, var y: Int) {
    val isInBounds = x > 0 && y > 0
}

fun main() {
    println(Coordinate(10,30))

    println(Coordinate(10,30) == Coordinate(10,30))

    val (x,y) = Coordinate(10, 30)
    println(x)
    println(y)
}