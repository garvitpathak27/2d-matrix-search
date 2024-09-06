import java.util.Scanner;

public class trial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dimensions of array");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the element to find");
        int token = sc.nextInt();

        // int arr[][] = {{1,4,7,11},{2,5,8,12},{3,6,9,16} , {10,13,14,17}};
        // int token = 6;
        if(findelement(arr, token)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
    public static boolean findelement(int arr[][] , int token){
        for(int i = 0 ;i < arr.length; i++){
           if(binarysearch(arr[i], token)){
            return true;
           }
        }
        return false;
    }
    public static boolean binarysearch(int[] arr, int token){
        int left = 0 , right = arr.length -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == token){
                return true;
            }
            if(arr[mid] > token){
                right = mid -1;
            }
            if(arr[mid] < token){
                left = mid +1;
            }

        }
        return false;
    }
}


   
