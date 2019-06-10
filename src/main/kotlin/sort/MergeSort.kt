package sort

import java.util.Arrays

class MergeSort<E : Comparable<E>> : AbstractSort<E> {
    override fun sort(array: Array<E>) {
        sort(array, 0, array.size)
    }

    private fun sort(array: Array<E>, left: Int, right: Int) {
        if (right - left < 2) return

        val mid = (left + right).ushr(1)
        
        sort(array, left, mid)
        sort(array, mid, right)
        merge(array, left, mid, right)
    }

    private fun merge(array: Array<E>, left: Int, mid: Int, right: Int) {
        val leftArray = Arrays.copyOfRange(array, left, mid)
        val rightArray = Arrays.copyOfRange(array, mid, right)

        var i = left
        var l = 0
        var r = 0
        while (l < mid - left && r < right - mid) {
            array[i++] =
                    if (leftArray[l] < rightArray[r])
                        leftArray[l++]
                    else
                        rightArray[r++]
        }
        while (l < mid - left) {
            array[i++] = leftArray[l++]
        }
        while (r < right - mid) {
            array[i++] = rightArray[r++]
        }
    }
}