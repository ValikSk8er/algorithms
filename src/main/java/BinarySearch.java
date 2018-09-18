import java.util.Arrays;

public class BinarySearch {

//  [5, 6, 9, 10, 15, 1, 3, 4]. It means you should modify basic implementation of the BinarySearch.
//          ***WARNING!
//          If you have this kind of case 5,5,1,3,4,5,5,5,5, and your target
// is 5 result value should be index of first satisfactory value in array. In our array it will be 0

    public static void main(String[] args) {

        int[] values = {1, 2, 4, 6, 7, 11, 12, 14, 15, 16, 22, 23, 54, 55, 67, 89, 90, 91 ,92};
        int target = 11;

        System.out.println(doBinarySearch(values, target, 0, values.length - 1));
        System.out.println(Arrays.binarySearch(values, target));
    }

    public static int doBinarySearch(int[] values, int target, int start, int end) {

        int from = start;
        int to = end;
        int currentIndex = (start + end) / 2;

        if(values[currentIndex] == target){
            return currentIndex;
        }
        if(values[currentIndex] < target){
            from = currentIndex + 1;
        } else if (values[currentIndex] > target) {
            to = currentIndex - 1;
        }
        return doBinarySearch(values, target, from, to);
    }
}