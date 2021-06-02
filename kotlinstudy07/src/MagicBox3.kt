/*
class MagicBox<T>(item: T) {
    var available = false
    private var subject: T = item

    fun fetch(): T? {
        return subject.takeIf { available }
    }

    //业务，把元素进行修改
    //魔盒里面放的是男孩，取出来的时候，我给他改成了一个男人
    //return -> R
    fun <R> fetch(subjectModFunction: (T) -> R): R? {
        return subjectModFunction(subject).takeIf { available }
    }

}

class Boy(val name: String, val age: Int)

class Man(val name: String, val age: Int)

class Dog(val weight: Int)

fun main() {
    val box1: MagicBox<Boy> = MagicBox(Boy("Jack", 15))
    val box2: MagicBox<Dog> = MagicBox(Dog(20))
    box1.available = true

    box1.fetch()?.run {
        println("you find $name")
    }

    val man = box1.fetch {
        Man(it.name, it.age.plus(15))
    }
}

*/
