/**
 * @author ldh
 * 时间: 2022/7/13 11:51
 * 邮箱: 2637614077@qq.com
 */
fun main() {

}


fun findPeakElement(nums: IntArray): Int {
    var pre = Int.MIN_VALUE
    var posble = true
    nums.forEachIndexed { index, i ->
        if (i > pre) {
            posble = true
        } else {
            if (i < pre && posble) return index - 1
            posble = false
        }
        pre = i
    }
    return nums.size - 1
}
