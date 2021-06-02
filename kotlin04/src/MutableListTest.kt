fun main() {
    val mutableList = mutableListOf("Jason", "Jack", "Jacky")
    //mutableList.add("Jimmy")
    //mutableList.remove("Jack")


    listOf("Jason", "Jack", "Jacky").toMutableList()
    mutableListOf("Jason", "Jack", "Jacky").toList()

    mutableList += "Jimmy"
    mutableList -= "Jason"

    mutableList.removeIf { it.contains("Jack") }
    println(mutableList)
}