/**
 * @author ldh
 * 时间: 2022/5/26 13:19
 * 邮箱: 2637614077@qq.com
 */
fun main(args: Array<String>) {
    val testNums = listOf(2, 2, 1, 1, 1, 2, 2).toIntArray()
    println(majorityElement4(testNums))
}

/**
 * 方法一
 * 建立哈希表映射
 */
fun majorityElement(nums: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    val a = nums.size / 2 + 1
    nums.forEach {
        map[it] = ((map[it] ?: 0) + 1).apply {
            if (this >= a) {
                return it
            }
        }
    }
    return 0
}

/**
 * 方法二
 * 先排序
 */
fun majorityElement2(nums: IntArray): Int {
    nums.sort()
    return nums[nums.size / 2]
}

/**
 * 方法三
 * 随机挑选一个并验证
 *
 * 空间复杂度为 O(1)，时间复杂度得看运气
 */
fun majorityElement3(nums: IntArray): Int {
    //这个函数用来验证一个数是不是众数
    val isMajorityElement: (Int) -> Boolean = { target ->
        var count = 0
        nums.forEach {
            if (it == target) {
                count++
            }
        }
        count > nums.size / 2
    }
    while (true) {
        val random = nums.random()
        if (isMajorityElement(random)) {
            return random
        }
    }
}


/**
 * 方法四
 *
 * 摩尔投票算法
 * 几只军队相互残杀，最后获胜的是优势最大的那个
 */
fun majorityElement4(nums: IntArray): Int {
    var youshishu = 0
    var youshi = 0
    nums.forEach {
        if (youshi == 0) {
            youshishu = it
        }
        youshi += if (youshishu == it) 1 else -1
    }
    return youshishu
}
