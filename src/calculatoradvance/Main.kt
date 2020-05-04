package calculatoradvance

fun main(){
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
            "Your action it is:$action. Your answer it is:${Action.getAction(action).doOptration(array = arr)}"
    )

}