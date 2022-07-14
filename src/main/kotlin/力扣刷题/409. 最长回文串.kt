/**
 * @author ldh
 * 时间: 2022/6/1 15:33
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    println(longestPalindrome("abccccdd"))
    println(longestPalindrome2("abccccdd"))
}

fun longestPalindrome(s: String): Int {
    val map = mutableMapOf<Char, Int>()
    var sum = 0
    s.toList().forEach {
        map[it] = (map[it] ?: 0) + 1
        if (map[it] == 2) {
            map[it] = 0
            sum += 2
        }
    }
    var single = false
    map.forEach {
        if (it.value == 1) {
            single = true
            return@forEach
        }
    }
    if (single) {
        sum++
    }
    return sum
}

/**
 * 不用HashMap，直接用char的数组来表示
 */
fun longestPalindrome2(s: String): Int {
    val chars = IntArray(128)
    s.toCharArray().forEach {
        chars[it.toInt()]++
    }
    var sum = 0
    chars.forEach {
        sum += it / 2 * 2
        if (sum % 2 == 0 && it % 2 == 1) {
            sum++
        }
    }
    return sum
}
