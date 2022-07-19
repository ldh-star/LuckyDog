package 牛客网面试必刷TOP101


/**
 * @author ldh
 * 时间: 2022/7/19 15:57
 * 邮箱: 2637614077@qq.com
 */
fun main() {

}


fun minNumberInRotateArray(rotateArray: IntArray): Int {
    if (rotateArray.size == 0) return 0
    var l = 0
    var r = rotateArray.size - 1
    while (l < r) {
        val m = l + ((r - l) shr 1)
        if (rotateArray[m] < rotateArray[r]) {
            r = m
        } else if (rotateArray[m] > rotateArray[r]) {
            l = m + 1
        } else {
            r--
        }
    }
    return rotateArray[l]
}
