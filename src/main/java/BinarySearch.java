
public class BinarySearch {

    public static int doBinarySearch(int[] values, int target, int start, int end) {
        int from = start;
        int to = end;
        int currentIndex = (start + end) / 2;

        if (values[0] == target) {
            return 0;
        }
        if (values[currentIndex] == target) {
            return currentIndex;
        }
        if (values[start] >= values[values.length - 1]) {
            if (target < values[start] || target > values[currentIndex]) {
                from = start + 1;
            } else {
                to = end - 1;
            }
        } else {
            if (values[currentIndex] < target) {
                from = currentIndex + 1;
            } else {
                to = currentIndex - 1;
            }
        }
        return doBinarySearch(values, target, from, to);
    }
}