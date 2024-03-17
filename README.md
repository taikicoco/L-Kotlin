# l-kotlin

1. [基本構文](#anchor1)
   2. [Null非許容](#anchor1)

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