class Player8(_name:String){

    val name:String = _name
    val playerName:String = initPlayerName()
    private fun initPlayerName() = name
}

fun main() {
    println(Player8("Jack").playerName)
}