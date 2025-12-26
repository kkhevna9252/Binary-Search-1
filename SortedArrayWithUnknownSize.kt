/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * class ArrayReader {
 *     fun get(index: Int): Int {}
 * }
 */

class SortedArrayWithUnknownSize {
    fun search(reader: ArrayReader, target: Int): Int {
        var l = 0
        var r = 10000
        while(l <= r) {
            val mid = l + (r -l)/2
            val current= reader.get(mid)
            if (current == target) return mid
            else if( current < target) l = mid + 1
            else r = mid - 1
        }
        return - 1
    }
}