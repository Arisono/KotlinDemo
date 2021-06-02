fun main() {
    //val set = setOf("Jason", "Jack", "Jacky", "Jack")
    //println(set.elementAt(2))

    val mutableSet= mutableSetOf("Jason", "Jack", "Jacky", "Jack")
    mutableSet += "Jimmy"

    val list = listOf("Jason", "Jack", "Jacky", "Jack")
        .toSet()
        .toList()
    println(list)

    println(listOf("Jason", "Jack", "Jacky", "Jack").distinct())
}