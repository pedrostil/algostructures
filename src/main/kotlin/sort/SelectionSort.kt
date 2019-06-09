package sort

import kotlin.Int.Companion.MAX_VALUE

class SelectionSort : Sort {
    override fun sort(array: Array<Int>) {
        for (i in 1 until array.size) {
            var min = MAX_VALUE
            var minIndex = -1
            for (j in i until array.size) {
                if (array[j] < min) {
                    min = array[j]
                    minIndex = j
                }
            }
            if (min < array[i-1]) {
                swap(array, i-1, minIndex)
            }
        }
    }

    private fun swap(array : Array<Int>, i : Int, j : Int) {
        val tmp = array[i]
        array[i] = array[j]
        array[j] = tmp
    }

}