package search

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream


class SearchTest {

    private val searchingAlgorithms =
        arrayOf(
            BinarySearch<Int>()
        )

    @ParameterizedTest
    @MethodSource("inputProvider")
    fun testSearch(arr: String, value: Int, position: Int) {
        for (search in searchingAlgorithms) {
            val array = arr.split(" ").map { it.toInt() }.toTypedArray()
            assertEquals(position, search.search(array, value))
        }
    }

    companion object {
        @JvmStatic
        private fun inputProvider(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("1 2 3 4", 2, 1),
                Arguments.of("1 2 3 4", 5, -1),
                Arguments.of("1", 1, 0),
                Arguments.of("1 5 1000", 1000, 2)
            )
        }
    }
}