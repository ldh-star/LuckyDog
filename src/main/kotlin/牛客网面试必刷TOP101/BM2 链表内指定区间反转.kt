import 自用拓展库.lib.ListNode

/**
 * @author ldh
 * 时间: 2022/7/11 9:32
 * 邮箱: 2637614077@qq.com
 */
fun main() {

}

/**
 * 第一种方法
 * 先全局反转，然后对局部进行修改
 */
fun reverseBetween1(head: ListNode?, m: Int, n: Int): ListNode? {
    var p = head
    var pre: ListNode? = null
    while (p?.next != null) {
        val next = p.next
        p.next = pre
        pre = p
        p = next
    }
    p?.next = pre
    return p
}
