fun main() {
    val result = listOf(listOf(1,2,3), listOf(4,5,6)).flatMap { it }
    println(result)

    val result1= listOf(listOf(2,4,6,1,9), listOf(0,11)).flatMap { it }

    println(result1)
}