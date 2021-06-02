class Player0{

    var name:String = "jack"
        get() = field.capitalize()
        set(value){
            field = value.trim()
        }

}

fun main() {
    var p = Player0()
    println(p.name)
    p.name = " rose "
    println(p.name)
}
