package kotlin01


import kotlin.math.sin
import kotlin.text.StringBuilder

/**
 * Kotlin 中的 if 语句基本和 Java 一致，不同点是 kotlin 中的 if 是可以带返回值的，返回值为 if 代码块中的最后一行，
 * */
fun maxNum1(a: Int, b: Int) = if (a > b) {
    println("a 大于 b")
    a
} else {
    println("a 小于 b")
    b
}

fun maxNum2(a: Int, b: Int) = if (a > b) a else b


// 每次执行其中一个分支，相比于 switch 可以不用写 break
// 基本用法
fun testWhen() {
    val a = 3
    when (a) {
        3 -> {
            println("3")
        }
        9 -> {
            println("9")
        }
        else -> {
            println("else")
        }
    }
}
// 更多用法
//val a = "39"
//fun switchType(a: Any) { // Any 可以当作 Java 中的 Object 类
//    when (a) {
//        a is Int -> {	// is 是类型匹配关键字，可以当作 Java 中的 instanceof
//            // ...
//        }
//        a is String -> {
//            // ...
//        }
//        else -> { }
//    }
//}
// 还可以把参数不放在 when() 中以实现更多功能
//val a = "39"
//when {
//    a.startsWith("3") -> { }
//    else -> { }
//}

/** for循环*/
fun testFor(): Unit {
    // for ( i in 0 .. 10 ) println(i)
    for (i in 0 until 10 step 2) println(i) // step 2 可以理解为 i=i+2
}


/** 面向对象*/
open class Person(val name: String) {
    // var name="arison"
    fun job() {
        println("my job is 。。。")
    }
}

/** 有主构造函数，次构造函数的情况*/
class Student(val sex: String, val age: Int, name: String) : Person(name) {

    constructor(name: String) : this("男", 12, name) {
    }

    constructor() : this("student1") {
    }

    fun getInfo(): String {
        return "name=$name sex=$sex age=$age";
    }
}

/** 无主构造函数，有次构造函数的情况*/
class Student1 : Person {
    constructor(name: String) : super(name) {
    }
}


interface Debut {
    fun sing() {
        println("Tell your world") // 如果有默认实现，类中可以选择不重写该方法
    }

    fun next()
    fun info()
    fun sum() {
        println("this is sum fun")
    }
}

class Student2(name: String) : Person(name), Debut {

    override fun next() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun info() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("this is fun info")
    }
}


/** 空指针检查*/

// 借用上面的 Idol 类
fun sing(s: Student2?) {
    s?.info()
}


/** kotlin标准函数*/

fun testKotlinFun() {
    /** run关键字 */
    val sb = StringBuilder().run {
        append("test ")
        append("kotlin ")
        append("fun")

    }

    println("sb=$sb")

    /** apply 和 run 也是极其类似，唯一区别就是 apply 没有返回值，上面的例子改成 apply 的写法就是：*/

    val sb2 = StringBuilder().apply {
        append("test ")
        append("kotlin ")
        append("fun")
    }

    println("sb2=${sb2.toString()}")
}


/** 高级函数的应用   参数为函数*/
fun operation(num1: Int, num2: Int, opt: (Int, Int) -> Int): Int {

    return opt(num1, num2)
}

fun operation1(num1: Int, num2: Int, opt: (Int, Int) -> Int): Int {
    return opt(num1, num2)
}

fun plus(num1: Int, num2: Int) = num1 + num2
fun minus(num1: Int, num2: Int) = num1 - num2

/** 扩展函数*/
fun StringBuilder.build(block: StringBuilder.() -> Unit): StringBuilder {
    block()
    return this
}

/** 委托 */

// 定义
interface Worker {
    fun dowork()
}

class CorporateSlave(val name: String) : Worker {
    override fun dowork() {
        println("${name}:其实活是我干的...")
    }
}

class Boss(val employee: Worker) : Worker {
    override fun dowork() = employee.dowork()
}
// 使用
class Boss1(val employee: Worker):Worker by employee{
     fun domywork(){
         println("我是老板，我需要做我自己的工作！")
     }
}


fun main() {
    /** 委托*/
    Boss(CorporateSlave("小王")).dowork() // 小王:其实活是我干的...
    Boss1(CorporateSlave("小王")).dowork() // 小王:其实活是我干的...

    Boss1(CorporateSlave("小天")).domywork()// 小王:其实活是我干的...

//    val s=StringBuilder().build {
//        append("1");
//        append("2")
//        append("3")
//        toString()
//    }
//
//    println("s=${s.toString()}")

//    val result= operation(19,9, ::plus)
//    val result1= operation(19,9,::minus)
//    println("result=$result")
//    println("result1=$result1")
//
//    println("operation="+operation(19,9){n1,n2 ->n1+n2})


//    testKotlinFun();


//    println(maxNum1(9,6))
//    println(maxNum2(9,6))

    // println(testWhen())
    // println(testFor())

//    var p:Person= Person("arison");
//    println(p.name)
//    println(p.job())

//    val s1 =Student();
//    val s2= Student("jek")
//    val s3= Student("女",19,"asi")
//
//    println(s1.getInfo())
//    println(s2.getInfo())
//    println(s3.getInfo())


    // val s=Student2("xin")
//    s.sum()
//    s.sing()
//    s.info()

    //  sing(s)
}