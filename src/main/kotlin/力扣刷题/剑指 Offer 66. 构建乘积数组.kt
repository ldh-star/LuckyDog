/**
 * @author ldh
 * 时间: 2022/5/28 17:44
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    println(constructArr(listOf(1, 2, 3, 4, 5).toIntArray()).joinToString())
    println(constructArr2(listOf(1, 2, 3, 4, 5).toIntArray()).joinToString())

}

fun constructArr(a: IntArray): IntArray {
    val result = mutableListOf<Int>()
    val pre = a.toMutableList()
    a.forEach {
        pre.remove(it)
        var b = 1
        pre.forEach { c ->
            b *= c
        }
        pre.add(it)
        result.add(b)
    }
    return result.toIntArray()
}

/**
 * 左右乘积列表
 */
fun constructArr2(a: IntArray): IntArray {
    val l = listOf(1).toMutableList()
    val r = listOf(1).toMutableList()
    var ji = 1
    a.forEach {
        ji *= it
        l.add(ji)
    }
    ji = 1
    a.reversed().forEach {
        ji *= it
        r.add(ji)
    }
    r.reverse()
    val result = IntArray(a.size)
    for (i in a.indices) {
        result[i] = l[i] * r[i + 1]
    }
    return result
}
