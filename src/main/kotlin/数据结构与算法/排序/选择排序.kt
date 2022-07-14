package 数据结构与算法.排序

import 自用拓展库.lib.randomIntArray
import 自用拓展库.lib.testIntArray


/**
 * @author ldh
 * 时间: 2022/7/14 10:05
 * 邮箱: 2637614077@qq.com
 *
 * 选择排序
 * 每遍历一次，就将数组中最小的数提前，然后在剩下的数里再次进行这种操作
 */
fun main() {
    testIntArray(*randomIntArray(n = 100, range = 0..50)) {
        selectionSort(it)
    }
}

fun selectionSort(arr: IntArray) {
    val n = arr.size
    for (i in 0 until n - 1) {
        var min = Int.MAX_VALUE
        var minIndex = i
        for (j in i until n) {
            if (arr[j] < min) {
                min = arr[j]
                minIndex = j
            }
        }
        val temp = arr[i]
        if (temp != min) {
            arr[i] = min
            arr[minIndex] = temp
        }
    }
}
