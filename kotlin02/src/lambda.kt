/**
 *  Lambda表达式的本质其实是匿名函数，
 *  因为在其底层实现中还是通过匿名函数来实现的。
 *  但是我们在用的时候不必关心起底层实现。
 *  不过Lambda的出现确实是减少了代码量的编写，同时也是代码变得更加简洁明了。
 *  Lambda作为函数式编程的基础，其语法也是相当简单的。
 *
 */

fun main(){

    /**
     * 功能用法1：作为独立的功能模块使用
     */
    sumTest();


    /**
     * 功能用法2： lambda表达式作为函数中的参数的时候
     */
    lambdaTest01(3,{"gitbaike.com"})
    lambdaTest01(3){"gitbaike.com"}
    lambdaTest02(3){arg1, arg2->"arg1=${arg1} + arg2=${arg2.toString()}"}
    lambdaTest03({arg1, arg2->"arg1=${arg1} + arg2=${arg2.toString()}"},3)



    /**
     * 写法1：无参数情况
     *  val/var 变量名 = { 操作的代码 }
     */
    var lamb1={};
    var lamb1_1={ println("无参数的")};
    println("lamb1()=${lamb1()} lamb1_1=${lamb1_1()}")

    /**
     *  写法2：有参数的情况
     *  val/var 变量名 : (参数的类型，参数类型，...) -> 返回值类型 = {参数1，参数2，... -> 操作参数的代码 }
     *
     *  此种写法：即表达式的返回值类型会根据操作的代码自推导出来。
     *  val/var 变量名 = { 参数1 ： 类型，参数2 : 类型, ... -> 操作参数的代码 }
     */

    var lamb2={a:Int,b:String,c:Char->"a=${a},b=${b},c=${c}"}
        //lamb2={a:Int,b:String,c:Char->{"a=${a},b=${b},c=${c}"}} //报错
        lamb2={a:Int,b:String,c:Char->"a=${a.toString()}+b=${b}+c=${c.toString()}"}

    var lamb2_1={a:Int,b:String,c:Char->"a=${a.toString()}+b=${b}+c=${c.toString()}"}

    println("lamb2=${lamb2} lamb21=${lamb2_1}")
    println("lamb2 函数调用=${lamb2(100,"gitbaike.com",'a')} lamb21=${lamb2_1(100,"gitbaike.com",'a')}")


    var lamb3:(a:Int,b:String,c:Char)->String = {a:Int,b:String,c:Char->"a=${a},b=${b},c=${c}"}

    // var lamb4: (a:Int,b:String,c:Char)->String = {a:Int,b:String,c:Char->{"a=${a},b=${b},c=${c}"}}  //报错

    println("lamb3=${lamb3}")

    /**
     * 写法3： lambda表达式作为函数中的参数的时候，这里举一个例子：
     * fun test(a : Int, 参数名 : (参数1 ： 类型，参数2 : 类型, ... ) -> 表达式返回类型){
     * ...
     * }
     */

    // 有参数的情况   代码演示
    fun testSum(a : Int , b : Int) : Int{
        return a + b
    }

    var testSum1={a:Int,b:Int->a+b}
    var testSum2:(a:Int,b:Int)->Int={a:Int, b:Int->a+b }
    var testSum3:(a:Int,b:Int)->Int={a, b->a+b}
    var testSum4:(Int,Int)->Int={a, b->a+b}

    println("testSum函数调用：${testSum(100,200)}")
    println("testSum1函数调用：${testSum1(100,200)}")
    println("testSum2函数调用：${testSum2(100,200)}")
    println("testSum3函数调用：${testSum3(100,200)}")
    println("testSum4函数调用：${testSum4(100,200)}")


    //lambda表达式作为函数中的参数的时候
    fun testLambda(a:Int,b:Int): Int {
        return a+b
    }
    fun lambdaFun(num1:Int,num2:Int): Int {
        return num1+num2
    }
    println("testLambda="+testLambda(1,lambdaFun(2,5)))
    
    /**
     * Test lambda1
     * lambda表达式作为函数参数
     * @param a  int
     * @param b  匿名函数
     * @receiver
     * @return int
     */
    fun testLambda1(a:Int,b:(num1:Int,num2:Int)->Int): Int {
        return a+b.invoke(100,200)
    }
    /**
     * 调用参数为lambda表达式的函数
     */
    println("testLambda1="+testLambda1(500,{num1: Int, num2: Int -> num1*num2 }))  //编译器会警告提示  中括号提取到括号外面去
    println("testLambda1="+testLambda1(500){num1: Int, num2: Int -> num1*num2 })
    println("testLambda1="+testLambda1(500){a: Int, b: Int ->a*b })

    var lbda={num1: Int, num2: Int -> num1*num2 };//匿名函数作为参数传入

    println("testLambda1="+testLambda1(500,lbda))


    /**
     * it并不是Kotlin中的一个关键字(保留字)。
     * it是在当一个高阶函数中Lambda表达式的参数只有一个的时候可以使用it来使用此参数。it可表示为单个参数的隐式名称，是Kotlin语言约定的。
     */

    /**
     * 单个参数的隐式名称
     */
    // 这里举例一个语言自带的一个高阶函数filter,此函数的作用是过滤掉不满足条件的值。
    val arr = arrayOf(1,3,5,7,9)
    // 过滤掉数组中元素小于2的元素，取其第一个打印。这里的it就表示每一个元素。
    println(arr.filter { it < 5 }.component1())


    fun testIt(num1 : Int, bool : (Int) -> Boolean) : Int{
        return if (bool(num1)){ num1 } else 0
    }
//    println(testIt(10,{it > 5}))
//    println(testIt(4,{it > 5}))
    println(testIt(10){it > 5})
    println(testIt(4){it > 5})


}

/**
 * Lambda test01
 *
 * @param a
 * @param b
 * @receiver
 */
fun lambdaTest01(a:Int,b:(String)->String){
   println("$a+ ${b(a.toString())}")
}

/**
 * Lambda test02
 *
 * @param a
 * @param b
 * @receiver
 */
fun lambdaTest02(a: Int,b:(String,Int)->String){
    println("$a+ ${b(a.toString(),1000)}")
}

/**
 * Lambda test03
 *
 * @param b
 * @param a
 * @receiver
 */
fun lambdaTest03(b:(String,Int)->String,a: Int):Unit{
    println("$a+ ${b(a.toString(),1000)}")
}


/**
 * lambda的主要用途总结
 *
 */

/**
 * 1 作为单独的功能块单独使用
 */
fun sumTest(): Unit {
    val sum = {a:Int,b:Int -> a+b}

    println(sum.toString())
    println(sum(2,9))

    val total={};
    println(total.toString())
}


/**
 * 2 作为函数参数的代码块
 * 例如lambdaTest1,LambdaTest2等，可以定义函数的参数是一个lambda形式，这样我们在传递的实参的是否传入lambda即可
 */


/**
 * 3 集合中使用lambda
 * kotlin中集合中的很多操作都支持lambda,例如maxBy,map,fliter等
 */



