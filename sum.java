import java .util.*;
public class sum {
    public static void main(String[] args) {
        int arr[] = {3,4,3,5,6,4,4,6};
        int sum = 0;
        for (int i = 1; i<arr.length; i++){
            sum = sum + arr[i];

        }
        System.out.println(sum);
        
    }
    
}
