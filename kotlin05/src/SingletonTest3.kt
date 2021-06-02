import java.io.File

open class ConfigMap{

    companion object{
        private const val PATH= "xxxx"

        fun load() = File(PATH).readBytes()
    }

}

fun main() {
    //static
    ConfigMap.load()
}