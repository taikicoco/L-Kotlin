# l-kotlin

1. [基本構文](#anchor1)
- 1. [Null非許容](#anchor2)
  2. [変数](#anchor3)
  3. [関数](#anchor4)
  4. [分岐](#anchor5)
  5. [繰り返し](#anchor6)
  6. [クラス](#anchor7)
  7. [継承](#anchor8)
  8. [インターフェース](#anchor9)
  9. [コレクション](#anchor10)

# 1. 基本構文　<a id="anchor1"></a>
## 1. Null非許容　<a id="anchor2"></a>
```kt
val str1:String = null  // Null 非許容、コンパイルエラーになる
val str2:String? = null // Null許容
```
- 変数を宣言する際に型に何も付けずに宣言するとNull非許容になり、Nullを入れるとコンパイルエラーになる
```kt
fun printM(message: String?) {
    message ?: return
   println(message)
}
```
- ?:をエルビス演算子という
### 引数のNull許容
同じString型でも、?が付いていないNull非許容のStringはString?のサブタイプとして扱われる。
そのため、String型をString?型の引数に渡すことはできるが、String?型をString型の引数に渡すことはできない。

## 2. 変数　<a id="anchor3"></a>
```kt
val id = 100
id = 200 // コンパイルエラー
var name = "Kotlin"

// 型定義
val id: Int = 100
var name: String = "kt"
```
- valは変化不可（イミュータブル）
- varは変化可（ミュータブル）

## 3. 関数　<a id="anchor4"></a>
```kt
fun countLength(str: String): Int {
    return str.length
}
```

`fun 関数名（引数）: 戻り値の型`で書く

```kt
fun displayMessage(message: String) {
    println(message)
}

fun displayMessage(message: String): Unit {
  println(message)
}
```
- Unitという何もないこと表す型があり、明示的に戻り値の型として書く事ができる

## 4. 分岐　<a id="anchor5"></a>

### if文
```kt
if (num < 100) {
    println("Less than 100")
} else if (num == 100) {
    println("Equal to 100")
} else {
    println("Greater than 100")
}
```

### when文
```kt
when(num) {
    100 -> {
        println("Equal to 100")
    }
    else -> {
        println("Undefined value")
    }
}

when(num) {
  num == 100 -> {
    println("Equal to 100")
  }
}
```

## 5. 繰り返し　<a id="anchor6"></a>
```kt
var i: Int = 1
while (i < 10) {
    println("i is $i")
    i++
}

for (j in 1..10) {
    println("j is $j")
}

for (k in 1..<10 step 2) {
    println("k is $k")
}

val list = listOf(1, 2, 5, 10)
for (s in list) {
    println("s is $s")
}
```

## 6. クラス　<a id="anchor7"></a>
```kt
class Human {
    fun showName(name: String) {
        println(name)
    }
}

val human = Human()
human.showName("kotlin")
```
## 7. 継承　<a id="anchor8"></a>
```kt
open  class Animal (val name: String) {
    fun showName() = println("name is $name")
    open fun cries() = println("--")
}

class Dog(name: String) : Animal(name) {
    override fun cries() = println("bowwow")
}
```

- 継承させたいクラスに`open`の修飾子を付ける
- 関数にも同様にオーバーライドさせたいものに`open`を付ける
- 継承はクラス名の後ろに`:クラス名`の形で親クラスを記述する

```kt
sealed  class Animal (val name: String) {
    fun showName() = println("name is $name")
}
```

- `sealed`を付けると他ファイルのクラスから継承できない

## 8. インターフェース　<a id="anchor9"></a>
```kt
interface Greeter {
    fun hello()
}

class GreeterImpl: Greeter {
    override fun hello() {
        println("hello")
    }
}
```
- 継承と同様にクラス名の後ろに`:インターン名`の形で親クラスを記述する
## 9. コレクション　<a id="anchor10"></a>

### List
```kt
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
```


### Map
```kt
val map: Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three")
println(map)
println(map[1])

println(map.containsKey(3)) // true

val mutableMap: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
mutableMap[4] = "four"
println(mutableMap)
```

