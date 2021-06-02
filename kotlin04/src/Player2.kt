class Player2(
    _name: String,
    var age: Int,
    var isNormal: Boolean
) {

    var name = _name
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }

    constructor(name: String) : this(name, age = 10, isNormal = false)

    constructor(name: String, age: Int) : this(name, age = 10, isNormal = false){
        this.name = name.toUpperCase()
    }

}

fun main() {
    val p = Player2("Jack", 20, true)
    //p.name = "rose"

    val p2 = Player2("Rose")

    val p3 = Player2("Jacky",20)
    println(p3.name)
}