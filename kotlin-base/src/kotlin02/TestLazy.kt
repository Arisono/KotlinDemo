package kotlin02

/**
 * 现在切到Kotlin中的委托 他分为两种 一种是属性委托 一种是类委托
 * Base
 *
 * @constructor Create empty Base
 */
interface  Base{
    fun print()
    fun print1()
}


class BaseImpl (val x:Int):Base{
    override fun print() {
      //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("------------------x=$x")
    }

    override fun print1() {
        println("------------------y=$x")
    }

}

/**
 * Derived
 * 子类覆盖了接口方法print1    则不会执行代理类BaseImpl中的print1
 *
 * @constructor
 * @param b
 */
class  Derived(b:Base) :Base by b {
    override fun print1() {
        println("------------------derived= abc")
    }
}



//fun main(){
//    val b=BaseImpl(10)
//    Derived(b).print()
//    Derived(b).print1()
//}


/**
 * 属性委托
 *
 */

class Bean{
    val str by lazy {
        println(" init val str")
        "hello gitbaike.com"
    }
}


fun main(){
    val bean=Bean()
    println("init bean")
    println(bean.str)
    println(bean.str)

}