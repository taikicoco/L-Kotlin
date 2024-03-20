package main.ktolin

fun main () {
    s1()
    s2()
    s3()
    s4()
    s5()
    s6()
    s7()
    s8()
}

fun s1() {
    val id: Int = 100
    val name:String = "kt"

    println(id)
    println(name)
}

fun s2(): Unit {
    val name:String = "hello world"
    val count: Int = countLength(name)
    println(count)
}
fun countLength(str: String): Int {
    return str.length
}

fun s3() {
    val num: Int = 200
    ifExam(num)
    whenExam(num)
}

fun ifExam (num: Int) {
    if (num < 100) {
        println("Less than 100")
    } else if (num == 100) {
        println("Equal to 100")
    } else {
        println("Greater than 100")
    }
}

fun whenExam(num: Int) {
    when(num) {
        100 -> {
            println("Equal to 100")
        }
        else -> {
            println("Undefined value")
        }
    }
}

fun s4() {
    var i: Int = 1
    while (i < 10) {
        println("i is $i")
        i++
    }

    for (j in 1..10) {
        println("j is $j")
    }

//    for (k in 1 until 10 step 2) {
    for (k in 1..<10 step 2) {
        println("k is $k")
    }

    val list = listOf(1, 2, 5, 10)
    for (s in list) {
        println("s is $s")
    }
}

fun s5() {
    class Human {
        fun showName(name: String) {
            println(name)
        }
    }

    val human = Human()
    human.showName("kotlin")
}


open  class Animal (val name: String) {
    fun showName() = println("name is $name")
    open fun cries() = println("--")
}

class Dog(name: String) : Animal(name) {
    override fun cries() = println("bowwow")
}

fun s6() {
    val animal = Animal("cat")
    animal.showName()
    animal.cries()

    val dog = Dog("dog")
    dog.showName()
    dog.cries()
}

interface Greeter {
    fun hello()
}

class GreeterImpl: Greeter {
    override fun hello() {
        println("hello")
    }
}

fun s7() {
    val g = GreeterImpl()
    g.hello()
}

fun s8() {
    val intList: List<Int> = listOf<Int>(1,2,3)
    println(intList)
    println(intList[1])

    val stringList: List<String> = listOf<String>("one", "two", "three")
    println(stringList)
    println(stringList[2])

    val immutableList: List<Int> = listOf(1, 2, 3)
//    immutableList.add(4) // コンパイルエラー
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3)
    mutableList.add(4)
    println(mutableList)

    val map: Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(map)
    println(map[1])

    println(map.containsKey(3))

    val mutableMap: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    mutableMap[4] = "four"
    println(mutableMap)
}
