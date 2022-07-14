/**
 * @author ldh
 * 时间: 2022/6/6 21:10
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    println(mySqrt(2147395599))
}

fun mySqrt(x: Int): Int {
    if (x == 1) return 1
    var i = x / 2
    while (i >= 0) {
        if (i*i <= x) return i
        i--
    }
    return 0
}
