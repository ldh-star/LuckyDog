package 数据结构与算法.排序

import 自用拓展库.lib.swap
import 自用拓展库.lib.testIntArray


/**
 * @author ldh
 * 时间: 2022/7/15 9:56
 * 邮箱: 2637614077@qq.com
 *
 * 从头开始，每往后面移一位就会插入到前面已经拍好的序列中
 *
 * O(N²)
 */
fun main() {
    testIntArray { insertSort(it) }
}

fun insertSort(nums: IntArray) {
    for (i in 1 until nums.size) {
        insertSort(nums, i)
    }
}

private fun insertSort(nums: IntArray, index: Int) {
    if (index == 0) return
    if (nums[index] < nums[index - 1]) {
        nums.swap(index, index - 1)
        insertSort(nums, index - 1)
    }
}
