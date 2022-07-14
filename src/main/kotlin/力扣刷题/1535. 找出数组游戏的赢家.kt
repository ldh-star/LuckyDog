/**
 * @author ldh
 * 时间: 2022/7/1 9:50
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    println(getWinner2(arrayOf(2, 1, 3, 5, 4, 6, 7).toIntArray(), 2))
    println(getWinner2(arrayOf(3, 2, 1).toIntArray(), 10))
    println(getWinner2(arrayOf(1, 9, 8, 2, 3, 7, 6, 4, 5).toIntArray(), 7))
    println(getWinner2(arrayOf(1, 11, 22, 33, 44, 55, 66, 77, 88, 99).toIntArray(), 1000000000))

}

fun getWinner(arr: IntArray, k: Int): Int {
    if (arr.size == 2) return if (arr[0] > arr[1]) arr[0] else arr[1]
    if (k > arr.size) return max(arr)
    val map = mutableMapOf<Int, Int>()
    val list = arr.toMutableList()
    while (true) {
        list.add(list.removeAt(if (list[0] > list[1]) 1 else 0))
        val max = list[0]
        map[max] = (map[max] ?: 0) + 1
        if (map[max] == k) return max
    }
}

fun max(arr: IntArray): Int {
    var max = arr[0]
    for (i in 1 until arr.size) {
        if (arr[i] > max) max = arr[i]
    }
    return max
}

//其实根本不需要移动数组
//1.不管arr[0] 与 arr[1] 的大小谁大，下一次还是胜出的大的数与arr[1]之后下一个数a[2]比较，以此类推下一个是与a[3],直达末尾。
//2.当遍历完数组发现连胜回合数还是小于k，可知到arr中最后获胜的数一定是arr中的最大值（遍历完arr后最后获胜的数就是最大值）
fun getWinner2(arr: IntArray, k: Int): Int {
    var max = arr[0]
    var count = 0
    arr.forEach { num ->
        if (num != max) {
            if (num > max) {
                max = num
                count = 1
            } else count++
            if (count == k) return num
        }
    }
    return max
}

