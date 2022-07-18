package 自用拓展库.lib


/**
 * @author ldh
 * 时间: 2022/7/18 15:19
 * 邮箱: 2637614077@qq.com
 */
/**
 * 求两个数的中数，一般是数组题会用到
 * 如果直接用(a + b) / 2可能会发生越界，用这种方式不会
 */
fun mid(a: Int, b: Int) = a + ((b - a) shr 1)