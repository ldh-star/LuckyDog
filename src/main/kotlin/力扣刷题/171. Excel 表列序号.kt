import kotlin.math.pow

/**
 * @author ldh
 * 时间: 2022/6/24 10:23
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    val test = "AB"
   println(titleToNumber(test))

}

fun titleToNumber(columnTitle: String): Int {
    var i = columnTitle.length - 1
    var sum = 0.0
    columnTitle.toCharArray().forEach {
        sum += pow(i--) * it.num
    }

    return sum.toInt()
}

fun pow(n: Int): Int {
    var sum = 1
    for (i in 0 until n) {
        sum *= 26
    }
    return sum
}


val Char.num: Int
    get() = toInt() - 64

