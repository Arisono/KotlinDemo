import java.io.File

fun main() {
    val file1 = File("E://i have a dream_copy.txt")
    file1.setReadable(true)
    file1.setWritable(true)
    file1.setExecutable(false)

    val file2 = File("E://i have a dream_copy.txt").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(false)
    }
}