class Player5(_name:String) {
    var name = _name

    //val config by lazy {loadConfig()}

    val config = loadConfig()
    private fun loadConfig():String{
        println("loading...")
        return "xxx"
    }
}

fun main() {
    val p = Player5("Jack")
    Thread.sleep(3000)
    println(p.config)
}