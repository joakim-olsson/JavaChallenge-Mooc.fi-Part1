
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
        System.out.println(Arrays.toString(values));
        
    }

    public static int smallest(int[] values) {
        int helper = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < helper) {
                helper = values[i];
            }
        }
        return helper;
    }

    public static int indexOfTheSmallest(int[] values) {
        int smallest = values[0];
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < smallest) {
                smallest = values[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] values, int index) {
        int smallest = values[index];
        for (int i = index; i < values.length; i++) {
            if (values[i] < smallest) {
                smallest = values[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] values, int index1, int index2) {
        // code goes here
        int ind1 = values[index2];
        int ind2 = values[index1];
        values[index1] = ind1;
        values[index2] = ind2;
    }

    public static void sort(int[] values) {
        for (int i = 0; i < values.length; i++) {
            int smallest = indexOfTheSmallestStartingFrom(values, i);
            swap(values, i, smallest);
            
        }
    }

}
