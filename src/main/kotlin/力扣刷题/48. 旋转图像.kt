/**
 * @author ldh
 * 时间: 2022/5/29 11:38
 * 邮箱: 2637614077@qq.com
 */
fun main() {
    val testSample = arrayOf(
        arrayOf(5, 1, 9, 11).toIntArray(),
        arrayOf(2, 4, 8, 10).toIntArray(),
        arrayOf(13, 3, 6, 7).toIntArray(),
        arrayOf(15, 14, 12, 16).toIntArray(),
    )
    rotate2(testSample)
    testSample.forEach {
        println(it.joinToString())
    }
}

/**
 * 辅助矩阵法
 */
fun rotate(matrix: Array<IntArray>): Unit {
    val lists = mutableListOf<List<Int>>()
    matrix.forEach {
        lists.add(0, it.toList())
    }
    lists.forEachIndexed { column, ints ->
        ints.forEachIndexed { row, i ->
            matrix[row][column] = i
        }
    }
}

/**
 * 旋转大法
 * 先对\主对角线旋转
 * 再左右镜像旋转就可以
 */
fun rotate2(matrix: Array<IntArray>): Unit {
    //先沿\对角线翻转
    matrix.forEachIndexed { row, ints ->
        for (column in 0 until row) {
            val temp = matrix[row][column]
            matrix[row][column] = matrix[column][row]
            matrix[column][row] = temp
        }
    }
    matrix.forEach {
        //再左右镜像翻转
        it.reverse()
    }
}
