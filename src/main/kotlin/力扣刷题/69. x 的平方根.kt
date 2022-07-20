package 力扣刷题


/**
 * @author ldh
 * 时间: 2022/7/20 15:35
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    println(mySqrt(2147395599))
}


fun mySqrt(x: Int): Int {
    if (x == 0) return 0
    if (x < 4) return 1
    if (x < 9) return 2
    var left = 0
    var right = x shr 1
    if (right > 46340) right = 46340
    while (left < right) {
        val mid = (left + right) / 2
        val pingfang = mid * mid
        if (pingfang < x) {
            left = mid + 1
        } else if (pingfang > x) {
            right = mid - 1
        } else {
            return mid
        }
    }
    if (left * left > x) return left - 1
    return left
}

