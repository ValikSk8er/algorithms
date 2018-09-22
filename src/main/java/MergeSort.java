import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

//    Merge Sort:
//            - Google => Merge Sort, how it works.
//            - Google => Merge Sort, how it works.
//            - and maybe again… you should understand very clear how it works for your future practice.
// - for now it should works with basic cases. Any unsorted arrays will be good.
//
//    Note: your implementations should perform all actions in-place.
// It means you don’t need to create additional objects for storing information or using Java readymade APIs.
    public static void main(String[] args) {
        int[] array = {7, 1, 5, 3};
        int tempValue = 0;

        for (int i = 0; i < array.length/2; i+= 2) {
            if (array[i] > array[i + 1]) {
                tempValue = array[i + 1];
                array[i + 1] = array[i];
                array[i] = tempValue;
            }
        }
        int bound = array.length / 2;

        while (bound > 2){
            bound = bound / 2;
        }


        while (bound <= array.length){
            doMergeSort(array, 0, bound);
            doMergeSort(array, bound, array.length);

        }

        Arrays.stream(array).forEach(i -> System.out.print(i + ", "));
    }

    public static void doMergeSort(int[] array, int from, int to) {


        int tempValue = 0;

        for (int i = from; i < to - 1; i++) {
            if (array[i] > array[i + 1]) {
                tempValue = array[i + 1];
                array[i + 1] = array[i];
                array[i] = tempValue;
                i--;
            }
        }
    }

}
