package sort

class InsertionSort : Sort {

    override fun sort(arr: Array<Int>) {
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