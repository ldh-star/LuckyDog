/**
 * @author ldh
 * 时间: 2022/7/13 11:33
 * 邮箱: 2637614077@qq.com
 */
fun main() {

}


fun Find(target: Int, array: Array<IntArray>): Boolean {
    val height = array.size
    var x = array[0].size - 1
    var y = 0
    var p = 0
    while (x >= 0 && y < height) {
        p = array[y][x]
        if (target > p) {
            y++
        } else if (target < p) {
            x--
        } else return true
    }
    return false
}
