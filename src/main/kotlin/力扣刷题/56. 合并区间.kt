/**
 * @author ldh
 * 时间: 2022/5/27 16:53
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    val test = arrayOf(
        arrayOf(1, 3).toIntArray(),
        arrayOf(2, 6).toIntArray(),
        arrayOf(8, 10).toIntArray(),
        arrayOf(15, 18).toIntArray()
    )
    merge(test)
}

fun merge(intervals: Array<IntArray>): Array<IntArray> {
    val set = mutableSetOf<Int>()
    intervals.forEach { array ->
        for (i in array[0]..array[1]) {
            set.add(i)
        }
    }
    val array = set.toIntArray()
    array.sort()
    println(array.joinToString())


    return arrayOf()
}

