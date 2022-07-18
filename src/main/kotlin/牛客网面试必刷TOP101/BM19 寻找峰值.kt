import 自用拓展库.lib.mid
import 自用拓展库.lib.testIntArray

/**
 * @author ldh
 * 时间: 2022/7/13 11:51
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    testIntArray {
        println("结果:${findPeakElement2(it)}")
    }
}

/**
 * 第一种，笨方法，暴力遍历
 */
fun findPeakElement1(nums: IntArray): Int {
    var pre = Int.MIN_VALUE
    var posble = true
    nums.forEachIndexed { index, i ->
        if (i > pre) {
            posble = true
        } else {
            if (i < pre && posble) return index - 1
            posble = false
        }
        pre = i
    }
    return nums.size - 1
}

/**
 * 二分查找法
 */
fun findPeakElement2(nums: IntArray): Int {
    var left = 0
    var right = nums.size - 1
    var mid: Int
    while (left < right) {
        mid = mid(left, right)
        if (nums[mid] >= nums[mid+1]) {
            right = mid
        } else {
            left = mid + 1
        }
    }
    return left
}