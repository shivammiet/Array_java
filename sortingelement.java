public class sortingelement {
    static boolean sorted(int arr[], int n){
        for(int i= 0; i <arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if (arr[j]< arr[i])
                    return false;
                }
            }
                return true;
            }
            public static void main(String[] args) {
                int arr[] = {1,2,3,4,5,6};
               int  n = 6;
                System.out.println(sorted(arr, n));
            
        }
    }


