/**
 * @author ldh
 * 时间: 2022/7/1 18:27
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    println(busyStudent(arrayOf(1, 2, 3).toIntArray(), arrayOf(3, 2, 7).toIntArray(), 4))
}

fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
    var sum = 0
    for (i in startTime.indices) {
        if (queryTime in startTime[i]..endTime[i]) {
            sum++
        }
    }
    return sum
}
