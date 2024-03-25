package main.ktolin


val calc: (Int, Int) -> Int = { num1: Int, num2: Int -> num1 + num2 }


val squared: (Int) -> Int = {it * it}


fun printCalcResult(num1: Int, num2: Int, calc: (Int, Int) -> Int) {
 val result = calc(num1, num2)
 println(result)
}

typealias Calc = (Int, Int) -> Int

fun printCalcResult2(num1: Int, num2: Int, calc: Calc) {
 val result =  calc(num1, num2)
 println(result)
}

fun s20 () {
 println(calc(2,3))
 println(squared(2))
 printCalcResult(2,4, {num1, num2, -> num1 + num2})

 val calc: Calc = {num1, num2 -> num1 * num2}
 printCalcResult2(2,4, calc)
}



fun Int.square(): Int = this * this

fun s21() {
 println(2.square())
}

fun  main(){
 s20()
 s21()
}