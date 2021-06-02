class Player2 {
    class Equipment(var name: String) {
        fun show() = println("Equipment:$name")
    }

    fun battle() {
        Equipment("sharp knife").show()
    }
}

fun main() {
    Player2.Equipment("AK47").show()
}