package main.ktolin

fun printOddOrEvenNumberText(num: Int) {
    var text = ""
    if (num % 2 == 1) {
        text = "奇数"
    } else {
        text = "偶数"
    }
    println(text)
}

// if文を式として扱う
fun printOddOrEvenNumberText2(num: Int) {
    val text = if (num % 2 == 1) {
        "奇数"
    } else {
        "偶数"
    }
    println(text)
}

fun s10() {
    printOddOrEvenNumberText(10)
    printOddOrEvenNumberText2(11)
}

class User {
    val id: Int = 1
    val name = "kotlin"
}

fun s11() {
    val userA = User()
    val userB = User()

    println(userA.toString())
    println(userB.toString())

    println(userA.hashCode())
    println(userB.hashCode())

    println(userA == userB)

    val set = hashSetOf(userA)
    println(set.contains(userB))
}


data class User2(val id:Int, var name:String)

fun s12() {
    val userA = User2(1, "kotlin")
    val userB = User2(1, "kotlin")

    println(userA.toString())
    println(userB.toString())

    println(userA.hashCode())
    println(userB.hashCode())

    println(userA == userB)

    val set = hashSetOf(userA)
    println(set.contains(userB))


    val user1 = User2(2, "test")
    println(user1.component1())
    println(user1.component2())

    val user2 = User2(3, "huge")
    val updated = user2.copy(id = 4, name ="hedgehog")
    println(updated)
}

fun main() {
    s10()
    s11()
    s12()
}