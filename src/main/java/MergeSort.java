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

        int tempValue = 0;


        if(to - from == 2) {
            if (values[from] > values[from + 1]) {
                tempValue = values[from + 1];
                values[from + 1] = values[from];
                values[from] = tempValue;
            }
        } else {
            int boundDelta = (to - from) / 2;
            int leftPartIndex = from;
            int rightPartIndex = from + boundDelta;

            int tempLeft = values[leftPartIndex];
            int tempRight = values[rightPartIndex];


            for (int i = from; i < to; i++) {

                if (tempLeft < tempRight) {
                    values[leftPartIndex] = tempLeft;
                    tempLeft = values[++leftPartIndex];
                } else {
                    values[leftPartIndex] = tempRight;
                    if(rightPartIndex < to - 1){
                        tempRight = values[++rightPartIndex];
                        ++leftPartIndex;
                    } else {
                        values[rightPartIndex] = tempLeft;
                    }
                }
            }
        }
    }
}
