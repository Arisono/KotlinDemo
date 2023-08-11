package kotlin01


fun main() {
    //test001()
    test002()

    //test003()
}

//?:
//如果 ?: 左侧表达式非空，elvis操作符就返回其左侧表达式，否则返回右侧表达式。请注意，当且仅当左侧为空时，才会对右侧表达式求值。
private fun test003() {
    var name: String? = null;
    name ?: name.also {
        println("it:"+it)
        name = it
    }
}

//?.let
//空就不执行let
private fun test002() {
    val listWithNulls: List<String?> = listOf("Kotlin", null,"this is my website: https://nav.vpssw.com")
    for (item in listWithNulls) {
        item?.let { println(it) } // prints A and ignores null
    }
}


//?
private fun test001() {
    var a: String = "abc"
// a = null // compile error
    val aLength = a.length

    //
    var b: String? = "abc"
    b = null // ok
    // 如果b不为null, 返回长度, 如果b为null, 返回null
    val bLength = b?.length // 不能直接使用, compile error
    println("bLength:" + bLength)
}