import kotlin.math.absoluteValue

class Player(
    _name: String,
    _age: Int,
    _isNormal: Boolean
) {

    var name = _name
        get() = field.capitalize()
        set(value){
            field = value.trim()
        }

    var age = _age
    var isNormal = _isNormal

}

fun main() {
    val p = Player("Jack", 20, true)
    //p.name = "rose"
}