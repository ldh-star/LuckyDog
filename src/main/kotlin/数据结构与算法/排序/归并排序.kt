package 数据结构与算法.排序

import 自用拓展库.lib.testIntArray


/**
 * @author ldh
 * 时间: 2022/7/18 11:21
 * 邮箱: 2637614077@qq.com
 *
 * 归并排序，也是二分递归的思想，把一组数组分成两组，然后分别对这两组进行排序，排好序后，将两个数组合并
 *
 * 关键点：将两个数组合并到同一个数组中。用双指针法，小的数先填进去，指针跟着移动
 *
 *
 * -为什么归并排序的时间复杂度相对于选择冒泡的O(N²)低一些：归并排序的比较结果会形成一个有序的结果序列，这个序列可以继续向下传递，减少比较的次数
 */
fun main() {
    testIntArray {
        println("起始:${it.joinToString()}")
        mergeSort(it)
    }
}

fun mergeSort(nums: IntArray, l: Int = 0, r: Int = nums.size - 1) {
    if (l == r) return
    val mid = l + ((r - l) shr 1)
    var left = l
    var right = mid + 1
    mergeSort(nums, l, mid)
    mergeSort(nums, right, r)
    var i = l
    val tempNums = IntArray(nums.size)
    while (left <= mid && right <= r) {
        if (nums[left] > nums[right]) {
            tempNums[i++] = nums[right++]
        } else {
            tempNums[i++] = nums[left++]
        }
    }
    while (left <= mid) {
        tempNums[i++] = nums[left++]
    }
    while (right <= r) {
        tempNums[i++] = nums[right++]
    }
    //最后将多出来的这份放进原来的数组中
    for (j in l..r) {
        nums[j] = tempNums[j]
    }
}
