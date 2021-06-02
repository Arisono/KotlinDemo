infix fun String?.printWithDefault(default: String) = print(this ?: default)

fun main() {
    val nullableString: String? = null
    nullableString printWithDefault "abc"
    //"jack".to(18)
    //mapOf("jack" to 18)
}
