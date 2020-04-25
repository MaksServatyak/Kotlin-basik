package Calculator

fun main() {
    println("Enter the size of the array:")
    val n = readLine()!!
    var arr = emptyArray<Int>()
    println("Enter the items")
    for (i in 0..(n.toInt() - 1)) {
        arr += readLine()!!.toInt()
    }
    println("Enter the action")
    val action = readLine()!!
    println(
            "Your action it is:$action  " +
                    "Your answer it is:${calculator(action, arr)}"
    )
}


fun calculator(action: String, arr: Array<Int>): Float {
    var result = 0f
    when (action) {
        "+" -> for (i in 0..(arr.size - 1)) {
            result += arr[i]
        }
        "-" -> {
            result = arr[0].toFloat()
            for (i in 1..(arr.size - 1)) {
                result -= arr[i]
            }
        }
        "*" -> {
            result = 1f
            for (i in 0..(arr.size-1)) {
                result *= arr[i]
            }
        }
        "/" -> {
            result = arr[0].toFloat()
            for (i in 1..(arr.size-1)) {
                result /= arr[i]
            }
        }
        else -> throw Exception("Unknown action")
    }
    return result
}