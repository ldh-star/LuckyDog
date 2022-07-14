package 自用拓展库.lib


/**
 * @author ldh
 * 时间: 2022/7/14 10:27
 * 邮箱: 2637614077@qq.com
 */
/**
 * 对于数组进行测试
 */
fun testIntArray(vararg num: Int = randomIntArray(), block: (IntArray) -> Unit) {
    val test = num.toList().toIntArray()
    block(test)
    println(test.joinToString())
}