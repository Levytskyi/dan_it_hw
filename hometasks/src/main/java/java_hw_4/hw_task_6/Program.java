package java_hw_4.hw_task_6;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] arr = new int[45];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (100+1)) - 50;
        }
        System.out.println(Arrays.toString(arr));
        int minValue = arr[0];
        int maxValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("The smaller value is: " + minValue);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println("The biggest value is: " + maxValue);
    }
}
