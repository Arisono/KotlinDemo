package kotlin02

fun main(args: Array<String>){
/** -------------------------------------------------------------------------- */
    test02()
/** -------------------------------------------------------------------------- */
}



fun test01(){
    val arrayList = ArrayList<String>()//Creating an empty arraylist
    arrayList.add("Java")//Adding object in arraylist
    arrayList.add("Charp")
    arrayList.add("Python")
    arrayList.add("PHP")
    arrayList.add("SQL")
    println(".......打印 ArrayList 结果如下 .......")
    for (i in arrayList) {
        println(i)
    }
}


fun test02(){
    val arrayList1 = ArrayList<String>(5)
    arrayList1.add("C++")//Adding object in arraylist
    arrayList1.add("Object-C")
    arrayList1.add("Python")
    arrayList1.add("Java")
    arrayList1.add("SQL")
    println(".......print ArrayList1......")
    for (i in arrayList1) {
        println(i)
    }
    println("size of arrayList1 = "+arrayList1.size)
    val arrayList2 = ArrayList<Int>(5)
    arrayList2.add(14)
    arrayList2.add(20)
    arrayList2.add(80)
    println("......print ArrayList2......")
    for (i in arrayList2) {
        println(i)
    }
    println("size of arrayList2 = "+arrayList2.size)
}

//原文出自【易百教程】，商业转载请联系作者获得授权，非商业请保留原文链接：https://www.yiibai.com/kotlin/kotlin-arraylist.html

