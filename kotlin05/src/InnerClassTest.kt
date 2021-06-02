class Player2 {

    class Equipment(var name: String) {
        fun show() = println("equipment:$name")
    }

    fun battle(){

    }

}

fun main() {
    Player2.Equipment("sharp knife").show()
}