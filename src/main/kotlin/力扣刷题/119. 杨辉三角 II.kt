/**
 * @author ldh
 * 时间: 2022/5/28 9:28
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    println(getRow(19))
}


fun getRow(rowIndex: Int): List<Int> {
    if (rowIndex == 0) return listOf(1)
    val list = mutableListOf<Int>()
    for (i in 0..(rowIndex / 2)) {
        list.add(cnr(rowIndex, i))
    }
    if (rowIndex % 2 != 0) {
        list.addAll(list.reversed())
    } else {
        val newList = list.toMutableList()
        newList.reverse()
        newList.removeAt(0)
        list.addAll(newList)
    }
    return list
}

fun cnr(n: Int, r: Int): Int {
    var result = 1.0
    for (i in 0 until r) {
        result = result * (n - i) / (i + 1)
    }
    return result.toInt()
}

