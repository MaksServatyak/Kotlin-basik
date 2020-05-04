package calculatoradvance

class Plus_operation() : Operation {
    override fun doOptration(array: Array<Int>): Float {
        var result = 0f
        for (i in 0..(array.size - 1)) {
            result += array[i]
        }
        return result
    }
}

class Minus_operation() : Operation {
    override fun doOptration(array: Array<Int>): Float {
        var result: Float = array[0].toFloat()
        for (i in 1..(array.size - 1)) {
            result -= array[i]
        }
        return result
    }
}

class Multiply_operation() : Operation {
    override fun doOptration(array: Array<Int>): Float {
        var result = 1f
        for (i in 0..(array.size - 1)) {
            result *= array[i]
        }
        return result
    }
}

class Divide_operation() : Operation {
    override fun doOptration(array: Array<Int>): Float {
        var result = array[0].toFloat()
        for (i in 1..(array.size - 1)) {
            result /= array[i]
        }
        return result
    }
}

class Action {
    companion object {
        private val PLUS_OPERATION = "+"
        private val MINUS_OPERATION = "-"
        private val MULTIPLY_OPERATION = "*"
        private val DIVIDE_OPERATION = "/"
        fun getAction(action: String): Operation {
             return when (action) {
                 PLUS_OPERATION -> Plus_operation()
                 MINUS_OPERATION -> Minus_operation()
                 MULTIPLY_OPERATION -> Multiply_operation()
                 DIVIDE_OPERATION -> Divide_operation()
                 else -> throw Exception("Unknown action")
             }
         }
    }
}
