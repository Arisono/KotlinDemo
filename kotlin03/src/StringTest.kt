const val NAME = "Jimmy's friend"
const val NAMES = "jack,jacky,jason"
fun main() {

    val index = NAME.indexOf('\'')
    //val str = NAME.substring(0, index)
    var str = NAME.substring(0 until index)
    println(str)

    val data = NAMES.split(",")
    //data[0]

    val (origin,dest,proxy) = NAMES.split(",")
    println("$origin $dest $proxy")

    val str1 = "The people's Republic of China."
    val str2 = str1.replace(Regex("[aeiou]")){
        when(it.value){
            "a" -> "8"
            "e" -> "6"
            "i" -> "9"
            "o" -> "1"
            "u" -> "3"
            else -> it.value
        }
    }

    println(str1)
    println(str2)

    

}