
fun main(args: Array<String>) {
    val n = Integer.parseInt(readLine())
    val grades = mutableListOf<Int>()
    for (i in (0 until n)) {
        grades.add(modifyGrade(Integer.parseInt(readLine())))
    }
    grades.forEach { println(it) }
}

fun modifyGrade(grade: Int): Int {
    if (grade < 38) return grade
    else if ((grade + 1) % 5 == 0) return grade + 1
    else if ((grade + 2) % 5 == 0) return grade + 2
    else return grade
}