package main.ktolin

fun main () {
    s1()
    s2()
    s3()
    s4()
    s5()
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

