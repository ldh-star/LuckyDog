/**
 * @author ldh
 * 时间: 2022/7/7 9:29
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    test(listOf(1, 4, 3, 2))
    test(listOf(6, 2, 6, 5, 1, 2))

}

fun test(list: List<Int>) = println(arrayPairSum(list.toIntArray()))


fun arrayPairSum(nums: IntArray): Int {
    nums.sort()
    var sum = 0
    var i = 0
    val n = nums.size
    while (i < n) {
        sum += nums[i]
        i += 2
    }
    return sum
}
