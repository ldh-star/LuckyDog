package 数据结构与算法.`认识O(NlogN)`


/**
 * @author ldh
 * 时间: 2022/7/19 8:48
 * 邮箱: 2637614077@qq.com
 *
 * 在一个数组中，每一个数左边比当前数小的数累加起来，叫做这个数组的最小和
 */
fun main() {
    println(littleSum(intArrayOf(1,3,4,2,5)))
}

/**
 * 跟归并排序算法一样，只是在合并的时候要把总和计算出来
 */
private fun littleSum(nums: IntArray, l: Int = 0, r: Int = nums.size - 1): Int {
    if (l == r) return 0
    val mid = l + ((r - l) shr 1)
    var left = l
    var right = mid + 1
    var sum = littleSum(nums, l, mid) + littleSum(nums, right, r)
    var i = l
    val tempNums = IntArray(nums.size)
    while (left <= mid && right <= r) {
        if (nums[left] >= nums[right]) {
            tempNums[i++] = nums[right++]
        } else {
            //合并的时候，如果发现有左边比右边小的，则要把总和加上去，通过右边的索引就能确定这个小数要乘几次
            sum += nums[left] * (r - right + 1)
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
    return sum
}
