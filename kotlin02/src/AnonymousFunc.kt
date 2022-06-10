

fun gitbaike():Unit{
    //只读变量
    val length="gitbaike".count();
    //可变变量
    var s="gitbaike".count { it == 'i' }

        //意思是圆括号里面的lambda可以移出来。
        s="gitbaike".count({ tem ->
            tem=='e'
        })

        s="gitbaike".count({ tem:Char ->
            tem=='e'
        })

       //意思是当函数参数只有一个在圆括号外面的lambda表达式的话，可以删除圆括号。
        s="gitbaike".count(){ tem:Char ->
            tem=='e'
        };

        //最终版
        s="gitbaike".count{ tem:Char ->
            tem=='e'
        };

        //简版
        s="gitbaike".count { it == 'i' }

       println("gitbaike total len= ${length}  i= ${s}")



      val people= listOf("user1","user2","user3","user4","user5");

      var maxUser= people.maxBy { item->item }
          maxUser= people.maxBy ({item:String->item})
          maxUser= people.maxBy (){item:String->item}
          maxUser= people.maxBy {item:String->item}
          maxUser= people.maxBy {it->(it+"new")}

          println("${maxUser}")

}






fun main() {
    val total = "Mississippi".count()

    val totalS = "Mississippi".count{it == 's'}

    println(gitbaike())

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