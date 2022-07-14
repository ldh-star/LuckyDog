/**
 * @author ldh
 * 时间: 2022/7/1 10:46
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    println(minimumAbsDifference(arrayOf(4,2,1,3).toIntArray()))
    println(minimumAbsDifference(arrayOf(1,3,6,10,15).toIntArray()))
    println(minimumAbsDifference(arrayOf(13,8,-10,23,19,-4,-14,27).toIntArray()))

}

fun minimumAbsDifference(arr: IntArray): List<List<Int>> {
    val list = arr.sorted()
    var minCha = Int.MAX_VALUE
    for (i in 0 until (list.size - 1)) {
        val cha = list[i + 1] - list[i]
        if (cha < minCha) minCha = cha
    }
    val result = mutableListOf<List<Int>>()
    for (i in 0 until (list.size - 1)) {
        if (list[i + 1] - list[i] == minCha) result.add(listOf(list[i], list[i + 1]))
    }
    return result
}