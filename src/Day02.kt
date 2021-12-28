fun main() {
    fun part1(input: List<String>): Int {
        var position = 0
        var depth = 0
        for (command in input) {
            val direction = command.substringBefore(" ")
            val magnitude = command.substringAfter(" ").toInt()

            when (direction) {
                "forward" -> position += magnitude
                "down" -> depth += magnitude
                "up" -> depth -= magnitude
            }
        }
        return position * depth
    }

    fun part2(input: List<String>): Int {
        var aim = 0
        var position = 0
        var depth = 0
        for (command in input) {
            val direction = command.substringBefore(" ")
            val magnitude = command.substringAfter(" ").toInt()

            when (direction) {
                "forward" -> {
                    position += magnitude
                    depth += aim * magnitude
                }
                "down" -> aim += magnitude
                "up" -> aim -= magnitude
            }
        }
        return position * depth
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}