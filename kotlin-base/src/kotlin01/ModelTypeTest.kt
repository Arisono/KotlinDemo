package kotlin01;

/**
 * 【学习技术最好的方式，就是勤快点，自己手动敲代码，对语法有深入的印象和理解，千万不要停留在纸上谈兵的层面】
 * 本代码片段主要学习
 * 1：kotlin的实体类创建以及get set方法使用。
 * 2：kotlin如何声明匿名函数和匿名函数的调用。
 * 3：kotlin类的创建的类的简单使用。
 * Model type test
 * 自定义get set方法:
 * Kotlin会默认创建set get方法，我们也可以自定义get set方法: kotlin预留了一个在set和get中访问的变量field关键字:
 * @constructor Create empty Model type test
 */
class ModelTypeTest() {
    //声明一个带参数的匿名函数
    val anonFunOne: () -> String = {
        "this is anon fun1()"
    }

    //简写 匿名函数（类型推断）
    //这时定义匿名函数时的“: () -> String”都可以省略。
    val anonFunTwo = {
        "this is anon fun2()"
    }

    //带参数的简写  匿名函数 （类型推断）
    val anoFunThree = { name:Any,age:Int,sex:String->
        "this is anno fun3() $name $age $sex"
    }

    class Person constructor() {

        //每个类字段的定义，其实可以不用自己写get和set方法。
        //自己再次写了get  set方法主要是为了修改你的类字段。
        var name: String = ""
            get() {
                println("get:name:$field")
                return field;
            }
            set(value) {
                println("set:name:$value")
                field = "$value"
                //注意事项：改变了field的值，就改变了Person实例中name字段的值。
                field = "this is my website:https://nav.vpssw.com  There are a lot of technical materials and technical tools that we have. Welcome to visit and collect them!"
            }

        var age: Int = 0
            get() = field
            set(value) {
                println("set:age:$value$")
                field = value
                field = 68  //覆盖age的值。你在外层赋值age无用。
            }
        //匿名函数  没有用到类型推断
        var anonFunOne: () -> String = {
            "this is () -> kotlin.String"
        }
            get() = { "this is my website:https://nav.vpssw.com  There are a lot of technical materials and technical tools that we have. Welcome to visit and collect them!" }
            set(value) {
                println("set anonFunOne:" + value())
                field = value;
            }
        //匿名函数  有用到类型推断
        var anonFunTwo = { "this is () -> kotlin.String" }
            get() {
                println("get anonFunTwo:$field")
                return field
            }
            set(value) {
                println("set anonFunTwo:$value")
                field = value
            }
        //匿名函数  有用到类型推断   多参数
        var anonFunThree = { name:Any,age:Int,sex:String->
            "this is  anonFunThree: $name $age $sex "
        }
            get()  {
                println("get anonFunThree:$field")
                return field
            }
            set(value) {
                println("set anonFunThree:$value")
                field = value
            }
    }
}

fun main() {
    val person = ModelTypeTest.Person();
    println("--------------------------")

    println("person age:" + person.age)   //会执行该字段的get函数，不会调用该字段的set函数
    println("person name:" + person.name)  //会执行该字段的get函数，不会调用该字段的set函数
    println("person anonFunOne:" + person.anonFunOne)  //会执行该字段的get函数，不会调用该字段的set函数
    println("person anonFunTwo:" + person.anonFunTwo)  //会执行该字段的get函数，不会调用该字段的set函数
    println("person anonFunThree:" + person.anonFunThree)  //会执行该字段的get函数，不会调用该字段的set函数
    println("--------------------------")

    person.age = 20;        //会执行该字段的set函数，不会调用该字段的get函数
    person.name = "https://nav.vpssw.com (程序员技术资料导航网)"    //会执行该字段的set函数，不会调用该字段的get函数
    person.anonFunOne = ModelTypeTest().anonFunOne    //会执行该字段的set函数，不会调用该字段的get函数
    person.anonFunTwo = ModelTypeTest().anonFunTwo    //会执行该字段的set函数，不会调用该字段的get函数
    person.anonFunThree = ModelTypeTest().anoFunThree   //会执行该字段的set函数，不会调用该字段的get函数

    println("--------------------------")

    println("person age:" + person.age)   //会执行该字段的get函数，不会调用该字段的set函数
    println("person name:" + person.name)  //会执行该字段的get函数，不会调用该字段的set函数
    println("person anonFunOne:" + person.anonFunOne)  //会执行该字段的get函数，不会调用该字段的set函数
    println("person anonFunTwo:" + person.anonFunTwo)  //会执行该字段的get函数，不会调用该字段的set函数
    println("person anonFunThree:" + person.anonFunThree)  //会执行该字段的get函数，不会调用该字段的set函数

    println("person anonFunOne:" + person.anonFunOne())  //会执行该字段的get函数，不会调用该字段的set函数    执行匿名函数
    println("person anonFunTwo:" + person.anonFunTwo())  //会执行该字段的get函数，不会调用该字段的set函数    执行匿名函数
    println("person anonFunThree:" + person.anonFunThree("https://www.yundashi168.com",99,"程序员如何搭建一个属于自己的博客网站?"))  //会执行该字段的get函数，不会调用该字段的set函数    执行匿名函数

    println("--------------------------")
}

























