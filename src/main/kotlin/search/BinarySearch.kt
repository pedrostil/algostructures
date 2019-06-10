package search

class BinarySearch<E : Comparable<E>> : Search<E> {
    override fun search(array: Array<E>, value: E): Int {
        return search(array, value, 0, array.size)
    }

    private fun search(array: Array<E>, value: E, l: Int, r: Int): Int {
        if (l >= r) return -1
        if (r - l == 1) return if (array[l] == value) l else -1

        val mid = (l + r).ushr(1)
        val midValue = array[mid]
        if (midValue == value) return mid

        return if (value < midValue)
            search(array, value, l, mid)
        else
            search(array, value, mid, r)
    }

}