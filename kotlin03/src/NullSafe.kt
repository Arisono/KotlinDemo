fun main() {
    var str:String? = "butterfly"
    //str = ""
    //println(str?.capitalize())
    /*str = str?.let {
        //非空白的字符串
        if(it.isNotBlank()){
            it.capitalize()
        }else{
            "butterfly"
        }
    }*/

    //str = null
    //println(str!!.capitalize())

    if(str != null){
        str = str.capitalize()
    }else{
        println("为null.")
    }

    str = str?.capitalize()?.plus(" is great.")

    str = "rose"
    //println(str ?: "jack")

    str = null
    str = str?.let{ it.capitalize() } ?: "butterfly"
    println(str)
}