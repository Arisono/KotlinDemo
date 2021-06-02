class PlayerScore(val experience: Int, val level: Int) {
    operator fun component1() = experience
    operator fun component2() = level
}

fun main() {
    val (x, y) = PlayerScore(10, 4)
    println(x)
    println(y)

}