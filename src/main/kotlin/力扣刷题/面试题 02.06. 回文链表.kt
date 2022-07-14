import 自用拓展库.lib.ListNode

/**
 * @author ldh
 * 时间: 2022/7/4 10:22
 * 邮箱: 2637614077@qq.com
 */


fun main() {
    val testNode = ListNode(1).apply {
        next = ListNode(2).apply {
            next = ListNode(2).apply {
                next = ListNode(1)
            }
        }
    }
    println(isPalindrome(testNode))
}

/**
 * 第一种方法：先复制到list中再判断是否回文
 */
fun isPalindrome(head: ListNode?): Boolean {
    val list = mutableListOf<Int>()
    var node = head
    while (node != null) {
        list.add(node.`val`)
        node = node.next
    }
    var a = 0
    var b = list.size - 1
    while (a < b) {
        if (list[a++] != list[b--]) {
            return false
        }
    }
    return true
}
