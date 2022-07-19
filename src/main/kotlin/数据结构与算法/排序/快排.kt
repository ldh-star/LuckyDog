package 数据结构与算法.排序

import 自用拓展库.lib.swap
import 自用拓展库.lib.testIntArray


/**
 * @author ldh
 * 时间: 2022/7/19 10:47
 * 邮箱: 2637614077@qq.com
 *
 * 快速排序
 *
 *
 * 取定数组中一个数作为参考，把小于这个数的都放在数组左边，把大于这个数的都放在数组右边，最后再分别对这左边一堆和右边一堆的进行这个排序操作
 *
 * 快排的时间复杂度: O(NlogN) ~ O(N²)
 */
fun main() {
    testIntArray {
        quickSort1(it)
    }
}

/**
 * 快排1.0版本
 *
 * 把最后一个数作为参考，把前面的数进行三分操作，最后排完了再用最后一个数跟右边界第一个数进行交换。
 * 这种方式的最坏的情况：选了个最小的数或者最大的数，时间复杂度最坏为O(N²)
 *
 * 另外，快排的3.0版本是随机挑一个数出来作为比较对象，这样不论是给什么例子，数学期望都是T(NlogN)
 */
fun quickSort1(nums: IntArray, l: Int = 0, r: Int = nums.size - 1) {
    if (l == r) return
    val target = nums[r]
    var left = l - 1
    var right = r
    var i = l
    while (i < right) {
        val num = nums[i]
        if (num < target) {
            nums.swap(++left, i++)
        } else if (num == target) {
            i++
        } else {
            nums.swap(i, --right)
        }
    }
    nums.swap(i, r)
    if (left > 0) {
        quickSort1(nums, l, left)
    }
    quickSort1(nums, right, r)
}
