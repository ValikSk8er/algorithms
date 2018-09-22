import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] values1 = {7, 1, 5, 3};
        int[] values2 = {2, 6, 8, 4};
        int[] values = {7, 1, 5, 3, 2, 6, 8, 4};

        int skipParametr = 2;

        while (skipParametr <= values.length) {

            for (int i = 0; i < values.length; i += skipParametr) {
                doMergeSort(values, i, i + skipParametr);
            }
            skipParametr *= 2;
        }

        Arrays.stream(values).forEach(i -> System.out.print(i + ", "));
    }

    public static void doMergeSort(int[] values, int from, int to) {

        int tempValue;

        if (to - from == 2) {
            if (values[from] > values[from + 1]) {
                tempValue = values[from + 1];
                values[from + 1] = values[from];
                values[from] = tempValue;
            }
        } else {
            int leftPartIndex = from;
            int rightPartIndex = from + (to - from) / 2;

            int current = values[leftPartIndex];

            for (int i = from; i < to; i++) {

                if (current < values[rightPartIndex]) {
                    if (values[leftPartIndex] != current) {
                        tempValue = values[leftPartIndex];
                        values[leftPartIndex] = current;
                        if(current < tempValue){
                            current = tempValue;
                        }
                        ++leftPartIndex;
                    } else {
                        ++leftPartIndex;
                        current = values[leftPartIndex];
                    }
                } else {
                    tempValue = values[leftPartIndex];
                    values[leftPartIndex] = values[rightPartIndex];
                        values[rightPartIndex] = tempValue;
                    if (rightPartIndex < to - 1) {
                        ++leftPartIndex;
                        ++rightPartIndex;
                    }
                    else {
                        values[rightPartIndex] = current;
                        break;
                    }
                }
            }
        }
    }
}
