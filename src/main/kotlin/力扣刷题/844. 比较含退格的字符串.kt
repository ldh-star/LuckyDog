import java.util.*

/**
 * @author ldh
 * 时间: 2022/6/23 10:46
 * 邮箱: 2637614077@qq.com
 *
 * 给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。
 * 注意：如果对空文本输入退格字符，文本继续为空。
 *
 *
 */
fun main() {
    println(backspaceCompare("ab#c", "ad#c"))
    println(backspaceCompare("ab##", "c#d#"))
}

fun backspaceCompare(s: String, t: String): Boolean {
    val format = { str: String ->
        val stack = Stack<Char>()
        str.forEach {
            if (it == '#') {
                if (stack.isNotEmpty()) {
                    stack.pop()
                }
            } else {
                stack.push(it)
            }
        }
        stack.toList()
    }
    val list1 = format(s)
    val list2 = format(t)
    if (list1.size != list2.size) return false
    list1.forEachIndexed { index, c ->
        if (c != list2[index]) return false
    }
    return true
}
