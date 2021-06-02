interface Movable {
    var maxSpeed: Int
        get() = (1..500).shuffled().last()
        set(value) {}
    var wheels: Int

    fun move(movable: Movable): String
}


class Car(_name: String, override var wheels: Int = 4) : Movable {

    override var maxSpeed: Int
        get() = super.maxSpeed
        set(value) {}

    override fun move(movable: Movable): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
