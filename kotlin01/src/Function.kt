fun main() {
    println(fix(age=10,name="Rose"))
    TODO("nothing")
    println("after nothing.")
}

private fun doSomething(age:Int = 2, flag:Boolean):String{
    return "result"
}

fun fix(name:String, age:Int = 2){
    println(name + age)
}
