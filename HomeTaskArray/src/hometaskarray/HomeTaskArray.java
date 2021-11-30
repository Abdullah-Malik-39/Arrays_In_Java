package hometaskarray;

import java.util.Scanner;

public class HomeTaskArray {

    public static void main(String[] args) {
        float[] arr = new float[10];  //Array Declaration
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <= 9; i++) //Input for array
        {
            System.out.print("Enter " + (i + 1) + " number : ");
            arr[i] = scan.nextFloat();
        }
        float low = lowest_height(arr);     //Calling Method for lowest value
        float high = highest_height(arr);   //Calling method for greatest value
        arr = sorted_height(arr);        //Calling Method for Sorting array
        System.out.println("Lowest height = " + low);     //Output of lowest height
        System.out.println("Highest height = " + high);   //Out[ut of Greatest height
        System.out.print("Sorted Array : ");
        for (int i = 0; i <= 9; i++) //Output of Sorted array
        {
            System.out.print(arr[i] + "  ");
        }
    }

    //Method to find Lowest Value in array
    public static float lowest_height(float[] array) {
        float lowest = array[0];
        for (int i = 0; i <= 9; i++) {
            if (lowest > array[i]) //Condition for fishing out lowest value
            {
                lowest = array[i];
            }
        }
        return lowest;      //Lowest Value return
    }

    //Method to find Greatest value in array 
    public static float highest_height(float[] array) {
        float high = array[0];
        for (int i = 0; i <= 9; i++) {
            if (high < array[i]) //Condition for fishing out greatest value
            {
                high = array[i];
            }
        }
        return high;        //Highest value return
    }

    //Array Sorting Method
    public static float[] sorted_height(float[] arr) {
        float tmp;      //temporaty variable for sorting
        //Bubble Sorting is Used
        for (int i = 0; i < 10; i++) //Outer loop for selecting each value of array
        {
            for (int j = i + 1; j < 10; j++) //Loop to compare value to rest of array
            {
                if (arr[i] > arr[j]) //Sorting logic
                {
                    tmp = arr[i];       //Moving values in ascending order
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;     //Sorted Array return
    }
}
