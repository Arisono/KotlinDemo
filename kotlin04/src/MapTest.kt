fun main() {

    val map = mapOf("Jack" to 20, "Jason" to 18, "Jack" to 30)

    //mapOf(Pair("Jimmy",20),Pair("Jacky",20))

    println(map["Jack"])
    println(map.getValue("Jack"))
    println(map.getOrElse("Rose") { "Unknown" })
    println(map.getOrDefault("Rose", 0))

    map.forEach {
        println("${it.key}, ${it.value}")
    }

    map.forEach { (key: String, value: Int) ->
        println("$key , $value")
    }
}