import java.util.*


fun gradingStudents(grades: Array<Int>): Array<Int> {

    for((index, grade) in grades.withIndex()) {
        val dividedByFive: Int = Math.ceil(grade / 5.0).toInt()
        val timesFive = dividedByFive * 5
        if (timesFive - grade < 3 && timesFive >= 40) {
            grades[index] = timesFive
        }
    }
    return grades

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val grades = Array<Int>(n, { 0 })
    for (gradesItr in 0 until n) {
        val gradesItem = scan.nextLine().trim().toInt()
        grades[gradesItr] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}