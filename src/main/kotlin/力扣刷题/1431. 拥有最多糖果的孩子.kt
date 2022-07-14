/**
 * @author ldh
 * 时间: 2022/7/4 11:35
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    println(kidsWithCandies(listOf(2, 3, 5, 1, 3).toIntArray(), 3))
    println(kidsWithCandies(listOf(4, 2, 1, 1, 2).toIntArray(), 1))
    println(kidsWithCandies(listOf(12, 1, 12).toIntArray(), 10))
}

fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val result = mutableListOf<Boolean>()
    //第一步，先计算谁糖果最多
    var max = candies[0]
    for (i in 1 until candies.size) {
        candies[i].also {
            if (it > max) {
                max = it
            }
        }
    }
    max -= extraCandies
    candies.forEach {
        result.add(it >= max)
    }
    return result
}
