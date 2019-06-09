package sort

interface AbstractSort<E : Comparable<E>> {
    fun sort(array: Array<E>)
}
