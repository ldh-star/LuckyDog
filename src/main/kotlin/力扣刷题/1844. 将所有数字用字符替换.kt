/**
 * @author ldh
 * 时间: 2022/7/8 15:32
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    println(replaceDigits("a1c1e1"))
    println(replaceDigits("a1b2c3d4e"))
}


fun replaceDigits(s: String): String {
    val chars = s.toCharArray()
    var i = 0
    while (i < s.length - 1) {
        chars[i + 1] = shift(chars[i], chars[i + 1].toInt() - '0'.toInt())
        i += 2
    }
    return String(chars)
}

private fun shift(c: Char, n: Int) = (c.toInt() + n).toChar()
