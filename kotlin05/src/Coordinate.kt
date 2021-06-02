data class Coordinate(var x: Int, var y: Int) {
    val isInBounds = x > 0 && y > 0
}

fun main() {
    println(Coordinate(10, 20))
    // == 比较的是内容，equals，Any 默认实现===，比较引用
    // === 比较的是引用
    println(Coordinate(10, 20) == Coordinate(10, 20))

    val (x, y) = Coordinate(10, 20)
    println("$x, $y")
}