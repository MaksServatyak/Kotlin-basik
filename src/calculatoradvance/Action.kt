package calculatoradvance

class PlusOperation() : Operation {
    override fun doOperation(array: Array<Int>): Float {
        var result = 0f
        for (i in 0..(array.size - 1)) {
            result += array[i]
        }
        return result
    }
}

class MinusOperation() : Operation {
    override fun doOperation(array: Array<Int>): Float {
        var result: Float = array[0].toFloat()
        for (i in 1..(array.size - 1)) {
            result -= array[i]
        }
        return result
    }
}

class MultiplyOperation() : Operation {
    override fun doOperation(array: Array<Int>): Float {
        var result = 1f
        for (i in 0..(array.size - 1)) {
            result *= array[i]
        }
        return result
    }
}

class DivideOperation() : Operation {
    override fun doOperation(array: Array<Int>): Float {
        var result = array[0].toFloat()
        for (i in 1..(array.size - 1)) {
            result /= array[i]
        }
        return result
    }
}

class Action {
    companion object {
        private const val PLUS_OPERATION = "+"
        private const val MINUS_OPERATION = "-"
        private const val MULTIPLY_OPERATION = "*"
        private const val DIVIDE_OPERATION = "/"
        fun getAction(action: String): Operation {
             return when (action) {
                 PLUS_OPERATION -> PlusOperation()
                 MINUS_OPERATION -> MinusOperation()
                 MULTIPLY_OPERATION -> MultiplyOperation()
                 DIVIDE_OPERATION -> DivideOperation()
                 else -> throw Exception("Unknown action")
             }
         }
    }
}
