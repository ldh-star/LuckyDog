package 自用拓展库.lib

/**
 * 经典链表数据结构，很多题都用这个
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return "Node[$`val`] -> $next"
    }
}
