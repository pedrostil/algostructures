package sort

class InsertionSort<E : Comparable<E>> : AbstractSort<E> {

    override fun sort(array: Array<E>) {
        for (i in 1 until array.size) {
            val cur = array[i]
            var j = i - 1
            while (j >= 0 && array[j] > cur) {
                array[j + 1] = array[j]
                j--
            }
            array[j + 1] = cur
        }
    }

}