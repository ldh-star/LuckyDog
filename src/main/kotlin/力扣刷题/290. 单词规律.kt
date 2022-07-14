import kotlin.random.Random

/**
 * @author ldh
 * 时间: 2022/6/2 16:20
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    if (Random.nextBoolean()) {
        println("是")
    } else {
        println("否")
    }
    println(wordPattern("abba", "dog cat cat dog"))
    println(wordPattern("abba", "dog cat cat fish"))
    println(wordPattern("aaaa", "dog cat cat dog"))
    println(wordPattern("abba", "dog dog dog dog"))
}

fun wordPattern(pattern: String, s: String): Boolean {
    val chars = pattern.toCharArray()
    val words = s.split(' ')
    if (chars.size != words.size) return false
    val map = mutableMapOf<Char, String>()
    words.forEachIndexed { index, word ->
        val char = chars[index]
        map[char]?.let {
            if (it != word) return false
        }
        map[char] = word
    }

    return true
}

