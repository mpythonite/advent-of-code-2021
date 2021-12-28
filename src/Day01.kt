fun main() {
    fun part1(input: List<Int>): Int {
        var count = 0
        for (i in 1 until input.size)
        {
            if (input[i-1] < input[i]) count++
        }
        return count
    }

    fun part2(input: List<Int>): Int {
        var count = 0
        for (i in 3 until input.size)
        {
            val curr = input[i] + input[i-1] + input[i-2]
            val prev = input[i-1] + input[i-2] + input[i-3]
            if (curr > prev) count++
        }
        return count
    }

    val input = readInput("Day01").map{ it.toInt() }
    println(part1(input))
    println(part2(input))
}
