/**
 * @author ldh
 * 时间: 2022/7/13 14:21
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    test(1, 2, 3, 4, 5, 6, 7, 0)
    test(1, 2, 3)
}

private fun test(vararg nums: Int) {
    println(InversePairs(nums.toList().toIntArray()))
}

fun InversePairs(data: IntArray): Int {
    var sum = 0
    for (i in 0..data.size - 2) {
        if (data[i] > data[i + 1]) {
            sum++
        }
    }
    return sum % 1000000007
}

