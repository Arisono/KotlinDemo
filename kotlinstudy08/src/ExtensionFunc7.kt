import java.io.File

//扩展函数
fun String.addExt() = "!".repeat(count())

//泛型的扩展函数
fun <T> T.easyPrint(): Unit = println(this)

//为什么要传入扩展函数（泛型），而不是一个普通的匿名函数？
//T.() -> Unit
//扩展函数里自带了接收者对象的this隐式调用
//为什么是泛型的扩展函数？

//匿名函数，也可以是扩展函数
//普通的匿名函数
//() -> Unit
//匿名函数内部this指向一个File对象，隐式调用
//File.() -> Unit

/*public inline fun <T> T.apply(block: T.() -> Unit): T {
    block()
    return this
}*/

public inline fun File.apply(block: File.() -> Unit): File {
    block()
    return this
}

fun main() {
    val file = File("xx").apply {
        setReadable(true)
    }

    //这里分解一下
    //1.定义扩展函数
    fun File.ext(): Unit {
        setReadable(true)
    }
    //2.给block变量赋值
    val block = File::ext
    //3.传入apply函数
    File("xx").apply { block }

}
