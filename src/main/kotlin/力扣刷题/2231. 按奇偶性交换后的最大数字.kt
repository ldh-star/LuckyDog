import kotlin.random.Random

/**
 * @author ldh
 * 时间: 2022/7/4 9:15
 * 邮箱: 2637614077@qq.com
 *
 * 这道题比较数字大小或者是是否为偶数其实可以转换成字符串来做，用char列表来比较
 */
fun main() {
    println(largestInteger(1234))
    println(largestInteger(65875))

}

fun largestInteger(target: Int): Int {
    //第一步，记录下哪些位数是奇数，哪些位数是偶数
    //第二步，将奇数和偶数分别分开并同时排好序
    val numList = target.toDigitList()
    val isJiShu = BooleanArray(numList.size)
    val jiShu = mutableListOf<Int>()
    val ouShu = mutableListOf<Int>()
    numList.forEachIndexed { index, num ->
        if (num % 2 == 1) {
            //这是奇数
            isJiShu[index] = true
            jiShu.addAndSort(num)
        } else {
            //这是偶数
            ouShu.addAndSort(num)
        }
    }
    var result = 0
    isJiShu.forEach {
        result *=10
        result += if (it) jiShu.removeAt(0) else ouShu.removeAt(0)
    }
    return result
}

/**
 * 将正整数转换成数字的集合
 */
private fun Int.toDigitList(): List<Int> {
    val list = mutableListOf<Int>()
    var num = this
    while (num > 0) {
        val newNum = num / 10
        list.add(0, num - (newNum * 10))
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