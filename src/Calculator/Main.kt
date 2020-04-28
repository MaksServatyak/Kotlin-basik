package Calculator

private val PLUS_OPERATION = "+"
private val MINUS_OPERATION = "-"
private val MULTIPLY_OPERATION = "*"
private val DIVIDE_OPERATION = "/"


fun main() {
    println("Enter the size of the array:")

    val n = readLine()?.toInt()
    var arr = emptyArray<Int>()
    println("Enter the items")

    for (i in 0..((n ?: 0) - 1)) {
        arr += readLine()?.toInt() ?: 0
    }

    println("Enter the action")
    val action = readLine()!!
    println(
            "Your action it is:$action. Your answer it is:${calculator(action, arr)}"
    )
}


fun calculator(action: String, arr: Array<Int>): Float {
    return when (action) {
        PLUS_OPERATION -> plusOperation(arr)
        MINUS_OPERATION -> minusOperation(arr)
        MULTIPLY_OPERATION -> multiplyOperation(arr)
        DIVIDE_OPERATION -> divideOperation(arr)
        else -> throw Exception("Unknown action")
    }
}

fun plusOperation(arr: Array<Int>): Float {
    var result = 0f
    for (i in 0..(arr.size - 1)) {
        result += arr[i]
    }
    return result
}

fun minusOperation(arr: Array<Int>): Float {
    var result = 0f
    result = arr[0].toFloat()
    for (i in 1..(arr.size - 1)) {
        result -= arr[i]
    }
    return result
}

fun multiplyOperation(arr: Array<Int>): Float {
    var result = 1f
    for (i in 0..(arr.size - 1)) {
        result *= arr[i]
    }
    return result
}

fun divideOperation(arr: Array<Int>): Float {
    var result = arr[0].toFloat()
    for (i in 1..(arr.size - 1)) {
        result /= arr[i]
    }
    return result
}


