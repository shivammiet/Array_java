import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class reversearray {
    private static int temp;

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int arr[] = {1,3,4,56,7};
        int n=arr.length;
        int low=0; 
        int high =n-1;
        while(low<high){
          int temp = arr[low];
         arr[low]= arr[high];
         arr[high] = temp;
         low++;
         high--;
        }
         for(int i =0; i <arr.length; i++){
    System.out.println(arr[i]+ " ");
}
}
}