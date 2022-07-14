/**
 * @author ldh
 * 时间: 2022/7/1 14:45
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    println(sortSentence("Myself2 Me1 I4 and3"))
}

fun sortSentence(s: String): String {
    val list = s.split(' ')
    val stringArr = Array(list.size) { "" }
    list.forEach {
        stringArr[it.last().code - '0'.code - 1] = it.substring(0, it.length - 1)
    }
    return stringArr.joinToString(" ")
}

