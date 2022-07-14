import java.math.BigInteger

/**
 * @author ldh
 * 时间: 2022/5/31 10:10
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    println(addStrings("11", "123"))
}

fun addStrings(num1: String, num2: String): String {
    val a = BigInteger(num1)
    val b = BigInteger(num2)
    return a.add(b).toString()
}
