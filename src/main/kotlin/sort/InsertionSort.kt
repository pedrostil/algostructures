package sort

class InsertionSort<E : Comparable<E>> : AbstractSort<E> {

    override fun sort(arr: Array<E>) {
        for (i in 1 until arr.size) {
            val cur = arr[i]
            var j = i - 1
            while (j >= 0 && arr[j] > cur) {
                arr[j + 1] = arr[j]
                j--
            }
            arr[j + 1] = cur
        }
    }

}