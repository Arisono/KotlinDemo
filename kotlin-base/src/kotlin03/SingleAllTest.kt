package kotlin03

/**
 * 【学习技术最好的方式，就是勤快点，自己手动敲代码，对语法有深入的印象和理解，千万不要停留在纸上谈兵的层面】
 * 本代码片段主要学习
 * 1：Java的几种单例与Kotlin的几种单例分析
 * 2：kotlin also操作符
 * 3：
 *
 */
class SingleAllTest {


}

//Kotlin单例实现1: Object声明
object SingletonOneWithMethod {
    private const val age = 20
    fun foo() {
        println(this.hashCode().toString() + " with age $age")
    }
}

class SingletonTwo private constructor(
    private var name: String,
    private var age: Int
) {
    companion object {
        private var instance: SingletonTwo? = null

        fun getInstance(name: String, age: Int) =
            instance ?: SingletonTwo(name, age).also { instance = it }
    }

    override fun toString(): String {
        return "SingletonTwoWithArguments${hashCode()}(name='$name', age=$age)"
    }
}

//Kotlin单例实现3: 为了线程安全, 加同步
class SingletonThree private constructor() {
    companion object {
        private var instance: SingletonThree? = null

        @Synchronized
        fun getInstance() =
            instance ?: SingletonThree().also { instance = it }
    }
}

//Kotlin单例实现4: 双重检查加锁
class SingletonFour private constructor() {
    companion object {
        @Volatile
        private var instance: SingletonFour? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: SingletonFour().also { instance = it }
            }
    }
}

fun main() {
    //SingletonOneWithMethod.foo()
    println(
        "SingletonTwo:" + SingletonTwo.getInstance(
            "this is my website:https://nav.vpssw.com  There are a lot of technical materials and technical tools that we have. Welcome to visit and collect them!",
            11
        )
    )
    println(
        "SingletonTwo:" + SingletonTwo.getInstance(
            "this is my website:https://nav.vpssw.com  There are a lot of technical materials and technical tools that we have. Welcome to visit and collect them!",
            19
        )
    )
}