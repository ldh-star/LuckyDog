/**
 * @author ldh
 * 时间: 2022/7/13 10:22
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    13.test(-1, 0, 3, 4, 6, 10, 13, 14)
    3.test()
    2.test(-1, 0, 3, 4, 6, 10, 13, 14)
}

private fun Int.test(vararg nums: Int) {
    println(search(nums.toList().toIntArray(), this))
}

fun search(nums: IntArray, target: Int): Int {
    var a = 0
    var b = nums.size - 1
    var i = b / 2
    while (a <= b) {
        if (target > nums[i]) {
            a = i + 1
        } else if (target < nums[i]) {
            b = i - 1
        } else {
            return i
        }
        i = (a + b) / 2
    }
    return -1
}

