sealed class UserResult {
    data class Failure(val message : String) : UserResult()
    data class Success(val users : List<String>) : UserResult()
    data class Loading(val animation : String) : UserResult()
}

fun main(args: Array<String>) {
    val resultFail = UserResult.Failure("error")
    val resultSuccess = UserResult.Success(mutableListOf("a", "b"))
    val animation = UserResult.Loading("..............")

    process(resultFail)
    process(resultSuccess)
    process(animation)
}

fun process(result : UserResult) {
    when(result) {
        is UserResult.Failure -> println(result.message)
        is UserResult.Success -> result.users.forEach { println(it)}
        is UserResult.Loading -> println(result.animation)
    }

}
