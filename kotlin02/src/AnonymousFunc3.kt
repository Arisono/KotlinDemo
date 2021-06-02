fun main() {
    showOnBoard("卫生纸"){goodsName:String, hour:Int ->
        val currentYear = 2027
        "${currentYear}年，双11${goodsName}促销倒计时：$hour 小时"
    }
}

//具名函数
private fun showOnBoard(goodsName:String, getDiscountWords: (String,Int) -> String){
    val hour = (1..24).shuffled().last()
    println(getDiscountWords(goodsName,hour))
}