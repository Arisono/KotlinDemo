import java.io.File

fun main() {
    /*val result = File("D://i have a dream_copy.txt")
        .takeIf { it.exists() && it.canRead() }
        ?.readText()

    println(result)*/

    val result = File("E://i have a dream_copy.txt")
        .takeUnless { it.isHidden }
        ?.readText()

    println(result)
}