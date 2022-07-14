fun main(args: Array<String>) {
    val testNums = listOf(2,2,1).toIntArray()
    println(singleNumber3(testNums))
}

/**
 * Set表来做
 */
fun singleNumber(nums: IntArray): Int {
    val set = mutableSetOf<Int>()
    nums.forEach {
        if (!set.remove(it)) {
            set.add(it)
        }
    }
    return set.first()
}

/**
 * 排序来做
 */
fun singleNumber2(nums: IntArray): Int {
    nums.sort()
    val n = nums.size - 1
    var i = 0
    while (i < n) {
        if (nums[i] == nums[i + 1]) {
            i += 2
        } else {
            return nums[i]
        }
    }
    return nums[n]
}

/**
 * 异或运算来做
 *
 * 十进制的异或操作：
 * 把每一位都进行异或操作
 * 两数相同异或出来是0
 * 0和任何数异或出来是那个数
 */
fun singleNumber3(nums: IntArray): Int {
    var result = 0
    nums.forEach {
        result = result xor it
    }
    return result
}