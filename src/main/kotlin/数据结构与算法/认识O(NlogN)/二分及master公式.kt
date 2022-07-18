package 数据结构与算法.`认识O(NlogN)`

import 自用拓展库.lib.testIntArray
import kotlin.math.max


/**
 * @author ldh
 * 时间: 2022/7/18 10:51
 * 邮箱: 2637614077@qq.com
 *
 * master公式的使用:
 * T(N) = a * T(N / b) + O(N^d)
 *
 *  -a 调用次数
 *
 *  -b 每一次子问题调用规模，比如二分的时候是N/2
 *
 *  -d 除了子问题调用之外，有没有其他额外操作会消耗的时间复杂度。
 *  比如除了递归调用啥都不干那就是0，如果都要打印一遍就是1。
 *
 */
fun main() {
    testIntArray {
        println("最大值:${getMaxTwoThird(it)}")
    }
}


/**
 * 用二分法求最大值
 * T(N) = 2 * T(N / 2) + O(1)
 */
fun getMaxBinary(nums: IntArray, l: Int = 0, r: Int = nums.size - 1): Int {
    if (l == r) return nums[l]
    //求中点如果直接用 (l + r) / 2 可能会发生溢出的情况，而这种写法可以避免溢出
    val mid = l + ((r - l) shr 1)
    val lMax = getMaxBinary(nums, l, mid)
    val rMax = getMaxBinary(nums, mid + 1, r)
    return max(lMax, rMax)
}

/**
 * 也是二分，只不过是从左边选2/3处拿来比，从右边2/3处拿来比
 * T(N) = 2 * T(N / (2 / 3)) + O(1)
 */
fun getMaxTwoThird(nums: IntArray, l: Int = 0, r: Int = nums.size - 1): Int {
    if (l == r) return nums[l]
    if (l == r - 1) return max(nums[l], nums[r])
    val unit = (r - l) / 3
    val lMax = getMaxTwoThird(nums, l, l + 2 * unit)
    val rMax = getMaxTwoThird(nums, l + unit, r)
    return max(lMax, rMax)
}