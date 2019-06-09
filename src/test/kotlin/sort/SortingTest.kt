package sort

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class SortingTest {

    private val sortingAlgorithms = arrayOf(InsertionSort<Int>(), SelectionSort<Int>())

    @ParameterizedTest
    @CsvSource(
        "50 2 3 20 4 0 31",
        "0 2 3 4 20 31 50",
        "1",
        "1000 10",
        "10 9 9 4 1 1"
    )
    fun testSorting(arr: String) {
        for (sort in sortingAlgorithms) {
            val input = arr.split(" ").map { it.toInt() }.toTypedArray()
            sort.sort(input)
//            println(sort::class.simpleName + " " + Arrays.toString(input))
            assert(isSorted(input))
        }
    }

    private fun isSorted(array: Array<Int>): Boolean {
        for (i in 0 until array.size - 1) {
            if (array[i] > array[i + 1]) return false
        }
        return true
    }


}