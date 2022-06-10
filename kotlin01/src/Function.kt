fun main() {
    println(fix(age=10,name="Rose"))
    //TODO("nothing")
    println("after nothing.")


    println(getSum(12,19))
    println(getSum(numLast = 30))
}

private fun doSomething(age:Int = 2, flag:Boolean):String{
    return "result"
}

fun fix(name:String, age:Int = 2){
    println(name + age)
}


private fun getSum(num:Int =3, numLast:Int):Int{
    return  num+numLast
}