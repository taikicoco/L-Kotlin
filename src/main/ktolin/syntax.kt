package main.ktolin

fun main () {
    s1()
    s2()
    s3()
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