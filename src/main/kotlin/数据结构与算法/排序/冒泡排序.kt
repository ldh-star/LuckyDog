package 数据结构与算法.排序

import 自用拓展库.lib.swap
import 自用拓展库.lib.testIntArray


/**
 * @author ldh
 * 时间: 2022/7/14 10:19
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    testIntArray { bubbleSort(it) }
}

fun bubbleSort(arr: IntArray) {
    val n = arr.size - 1
    var i = 0
    while (i in 0 until n) {
        for (p in 0 until n - i) {
            if (arr[p] > arr[p + 1]) {
                arr.swap(p, p + 1)
            }
        }
        i++
    }
}
