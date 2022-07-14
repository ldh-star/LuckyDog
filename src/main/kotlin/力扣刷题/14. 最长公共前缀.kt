/**
 * @author ldh
 * 时间: 2022/7/1 11:08
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))

}


fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.size == 1) return strs[0]
    var n = strs[0].length
    for (i in 1 until strs.size) {
        if (strs[i].length < n) n = strs[i].length
    }
    val sb = StringBuilder()
    for (i in 0 until n) {
        val c = strs[0].toCharArray()[i]
        var same = true
        for (j in 1 until strs.size) {
            if (c != strs[j].toCharArray()[i]) {
                same = false
                break
            }
        }
        if (!same) {
            break
        }
        sb.append(c)
    }
    return sb.toString()
}
