package search

interface Search<E : Comparable<E>> {
    fun search(array: Array<E>, value: E): Int
}
