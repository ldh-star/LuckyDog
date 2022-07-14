import 自用拓展库.lib.ListNode
import java.util.*

/**
 * @author ldh
 * 时间: 2022/7/11 8:47
 * 邮箱: 2637614077@qq.com
 */

/**
 * 打印链表
 */
fun ListNode?.print() {
    val list = mutableListOf<Int>()
    var p = this
    while (p != null) {
        list.add(p.`val`)
        p = p.next
    }
    println(list)
}

/**
 * 通过数组生成链表
 */
fun generateListNode(vararg list: Int): ListNode? {
    var head: ListNode? = null
    var pre: ListNode? = null
    list.forEach {
        val node = ListNode(it)
        if (pre == null) {
            head = node
        } else {
            pre!!.next = node
        }
        pre = node
    }
    return head
}


fun main() {
    val head = generateListNode(1, 2, 3, 4)
    println(ReverseList2(head))
}

/**
 * 前后指针
 * 116ms	12844KB
 */
fun ReverseList1(h: ListNode?): ListNode? {
    var head = h
    var pre: ListNode? = null
    while (head?.next != null) {
        val next = head.next
        head.next = pre
        pre = head
        head = next
    }
    head?.next = pre
    return head
}

/**
 * 栈
 *
 */
fun ReverseList2(h: ListNode?): ListNode? {
    val stack = Stack<ListNode>()
    var p = h
    while (p != null) {
        stack.push(p)
        p = p.next
    }
    while (!stack.empty()) {
        val node = stack.pop()
        p = node
        p.next = node
    }
    return p
}