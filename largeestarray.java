import java.util.*;
public class largeestarray {
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(largest < arr[i]){
                largest= arr[i];
            }

        }
        return largest;
    }
    public static void main(String args []){
        int arr[]= {1,3,4,55,4,5};
        System.out.println(getLargest(arr));
    }
}

    
    
