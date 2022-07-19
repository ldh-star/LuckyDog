package 自用拓展库.lib

import kotlin.random.Random
import kotlin.random.nextInt


/**
 * @author ldh
 * 时间: 2022/7/14 10:12
 * 邮箱: 2637614077@qq.com
 */
/**
 * 随机产生一个整数数组
 */
fun randomIntArray(n: Int = 20, range: IntRange = 0..n) = IntArray(n).apply {
    for (i in 0 until n) {
        set(i, Random.nextInt(range))
    }
}

/**
 * 在数组中交换两个数的位置
 */
fun IntArray.swap(a: Int, b: Int) {
    if (a == b) return
    val temp = get(a)
    set(a, get(b))
    set(b, temp)

    //这种方法不需要开辟额外的空间就能交换a和b，但前提是这两个数在内存空间上不会有重合
//    set(a, get(a) xor get(b))
//    set(b, get(a) xor get(b))
//    set(a, get(a) xor get(b))
}

fun intArrayOf(vararg num: Int) = num.toList().toIntArray()