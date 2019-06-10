package sort

class SelectionSort<E : Comparable<E>> : AbstractSort<E> {
    override fun sort(array: Array<E>) {
        for (i in 1 until array.size) {
            var min = array[i]
            var minIndex = i
            for (j in i until array.size) {
                if (array[j] < min) {
                    min = array[j]
                    minIndex = j
                }
            }
            if (min < array[i - 1]) {
                swap(array, i - 1, minIndex)
            }
        }
    }

    private fun swap(array: Array<E>, i: Int, j: Int) {
        val tmp = array[i]
        array[i] = array[j]
        array[j] = tmp
    }

}