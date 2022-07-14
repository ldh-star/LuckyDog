package 自用拓展库.lib

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return "Node[$`val`] -> $next"
    }
}
