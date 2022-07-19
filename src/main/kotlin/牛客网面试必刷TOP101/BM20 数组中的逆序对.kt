import 自用拓展库.lib.mid
import 自用拓展库.lib.testIntArray

/**
 * @author ldh
 * 时间: 2022/7/13 14:21
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    testIntArray(1, 2, 3, 4, 5, 6, 7, 0) {
        println(InversePairs(it))
    }

    testIntArray(1, 2, 3) {
        println(InversePairs(it))
    }

}


/**
 * 使用归并排序的解法
 */
fun InversePairs(data: IntArray): Int {
    return mergeSortInversePairs(data)
}

private fun mergeSortInversePairs(nums: IntArray, l: Int = 0, r: Int = nums.size - 1): Int {
    if (l == r) return 0
    val mid = mid(l, r)
    var left = l
    var right = mid + 1
    var count = (mergeSortInversePairs(nums, l, mid) + mergeSortInversePairs(nums, right, r)) % 1000000007
    var i = l
    val tempNums = IntArray(nums.size)
    while (left <= mid && right <= r) {
        if (nums[left] > nums[right]) {
            //合并的时候，如果发现有左边的数比右边的数大，则需记录下次数
            count += (mid - left + 1)
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
    return count % 1000000007
}

