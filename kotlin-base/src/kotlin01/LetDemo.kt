package kotlin01


/**
 * Desc: let常用于if判断
 * Created by Chiclaim on 2018/9/18.
 */
fun main(args: Array<String>) {

    val email = getEmail()
    email?.let { it ->
        System.out.println("it:"+it)
    }

}

fun getEmail(): String? {
    return null
}