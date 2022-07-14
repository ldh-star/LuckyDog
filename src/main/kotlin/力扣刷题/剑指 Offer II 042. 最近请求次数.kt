/**
 * @author ldh
 * 时间: 2022/6/6 20:11
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    RecentCounter().apply {
        ping(1)
        ping(100)
        ping(3001)
        ping(3002)
    }
}

class RecentCounter {

    private val recent = mutableListOf<Int>()

    fun ping(t: Int): Int {
        recent.add(t)
        return recent.filter { it >= t - 3000 }.size
    }

}
