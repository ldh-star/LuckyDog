package 牛客网面试必刷TOP101

import java.lang.Math.max


/**
 * @author ldh
 * 时间: 2022/7/19 17:44
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    println(compare("1.1", "2.1"))
    println(compare("1.1", "1.01"))
    println(compare("1.1", "1.1.1"))
    println(compare("2.0.1", "2"))
    println(compare("0.226", "0.36"))

}

fun compare(version1: String, version2: String): Int {
    val list1 = version1.split('.')
    val list2 = version2.split('.')
    val size = if (list1.size > list2.size) list1.size else list2.size
    val arr1 = IntArray(size)
    val arr2 = IntArray(size)
    list1.forEachIndexed { index, s ->
        arr1[index] = s.toInt()
    }
    list2.forEachIndexed { index, s ->
        arr2[index] = s.toInt()
    }
    for (i in 0 until size) {
        if (arr1[i] > arr2[i]) {
            return 1
        } else if (arr1[i] < arr2[i]) {
            return -1
        }
    }
    return 0
}
