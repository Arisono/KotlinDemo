open class Player{
    open fun load() = "loading nothing.."
}

fun main() {
    val p = object : Player(){
        override fun load() = "anonymous nothing.."
    }

    println(p.load())
}