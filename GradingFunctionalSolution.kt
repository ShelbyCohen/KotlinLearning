
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    (0 until n)
            .asSequence()
            .map { readLine()!!.split(" ").map(String::toInt) }
            .flatMap { gradeList -> gradeList.asSequence() }
            .map { grade ->
                val difference = 5 - grade % 5
                when {
                    grade < 38 -> grade
                    difference < 3 -> grade + difference
                    else -> grade
                }
            }
            .forEach { println(it) }
}