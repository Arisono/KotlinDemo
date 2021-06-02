fun main() {
    val total = "Mississippi".count()

    val totalS = "Mississippi".count{it == 's'}

    println(total)
    println(totalS)

    //变量的类型是一个匿名函数
    /*val blessingFunction:()->String = {
        val holiday = "New Year."
        "Happy $holiday"
    }*/

    /*val blessingFunction:(String) -> String = { name ->
        val holiday = "New Year."
        "$name, Happy $holiday"
    }*/

    /*val blessingFunction:(String) -> String = {
        val holiday = "New Year."
        "$it, Happy $holiday"
    }*/

    /*val blessingFunction = {
        val holiday = "New Year."
        "Happy $holiday"
    }*/

    /*val blessingFunction:(String,Int) -> String = {name, year ->
        val holiday = "New Year."
        "$name, Happy $holiday $year"
    }*/


    val blessingFunction = {name:String, year:Int ->
        val holiday = "New Year."
        "$name, Happy $holiday $year"
    }

    println(blessingFunction("Jack",2027))

}