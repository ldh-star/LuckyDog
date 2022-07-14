/**
 * @author ldh
 * 时间: 2022/7/12 16:02
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    2.test(1, 0, 0, 0, 1, 0, 0, 1)
    2.test(1, 0, 0, 1, 0, 1)
    0.test(1, 1, 1, 1, 1)
    1.test(0, 1, 0, 1)
}

private fun Int.test(vararg nums: Int) {
    println(kLengthApart(nums.toList().toIntArray(), this))
}

fun kLengthApart(nums: IntArray, k: Int): Boolean {
    var count = nums.size
    nums.forEach {
        if (it == 0) {
            count++
        } else {
            if (count < k) return false
            count = 0
        }
    }
    return true
}
