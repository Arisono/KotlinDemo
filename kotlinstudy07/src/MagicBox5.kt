/*
class MagicBox<T : Human>(vararg item: T) {
    var available = false
    private var subject: Array<out T> = item

    fun fetch(index: Int): T? {
        return subject[index].takeIf { available }
    }

    //业务，把元素进行修改
    //魔盒里面放的是男孩，取出来的时候，我给他改成了一个男人
    //return -> R
    fun <R> fetch(index: Int, subjectModFunction: (T) -> R): R? {
        return subjectModFunction(subject[index]).takeIf { available }
    }
}

open class Human(val age: Int)

class Boy(val name: String, age: Int) : Human(age)

class Man(val name: String, age: Int) : Human(age)

class Dog(val weight: Int)

fun main() {
    val box1: MagicBox<Boy> = MagicBox(
        Boy("Jack", 15),
        Boy("Jacky", 16),
        Boy("John", 26)
    )
    box1.available = true

    box1.fetch(1)?.run {
        println("you find $name")
    }

    val man = box1.fetch(2) {
        Man(it.name, it.age.plus(15))
    }
}
*/
