import java.io.File

fun main() {
    var fileContents:List<String>
    val file = File("E://i have a dream_copy.txt")
        .also {
            println(it.name)
        }.also {
            fileContents = it.readLines()
        }

    println(fileContents)
}