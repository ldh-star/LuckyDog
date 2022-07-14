/**
 * @author ldh
 * 时间: 2022/7/6 9:48
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    println(minimumSum2(2932))
    println(minimumSum2(4009))

}

fun minimumSum(num: Int): Int {
    val list = num.toDigitList()
    return (list[2] + list[3]) * 10 + list[0] + list[1]
}


fun minimumSum2(num: Int): Int {
    val chars = num.toString().toCharArray()
    val list = mutableListOf<Int>().apply {
        chars.forEach {
            add(it.code - '0'.code)
        }
    }.sorted()
    return (list[0] + list[1]) * 10 + list[2] + list[3]
}

/**
 * 将正整数转换成数字的集合
 */
private fun Int.toDigitList(): List<Int> {
    val list = mutableListOf<Int>()
    var num = this
    while (num > 0) {
        val newNum = num / 10
        list.addAndSort(num - (newNum * 10))
        num = newNum
    }
    return list
}


/**
 * 以有序的方式加入新的数字
 * 采用二分查找法来插入新的数字
 */
private fun MutableList<Int>.addAndSort(num: Int) {
    if (size == 0) {
        add(num)
    } else if (size == 1) {
        if (num < get(0)) add(1, num) else add(0, num)
    } else {
        //接下来就用二分法排序
        var a = 0
        var b = size - 1
        while (a <= b) {
            val i = (a + b) / 2
            val current = get(i)
            if (num > current) {
                b = i - 1
            } else if (num < current) {
                a = i + 1
            } else {
                add(i, num)
                return
            }
        }
        add(a, num)
    }
}