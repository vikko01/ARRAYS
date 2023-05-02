import java.util.Scanner;

public class triplets {

    static int TripletSum( int arr[] , int target){

        int n = arr.length;
        int ans = 0;

        for ( int i = 0 ; i < n ; i++){ // first number
           
            for ( int j = i+1 ; j < n ; j++){ // second number 

                for ( int k = j+1 ; k < n ; k++){ // third number

                    if( arr[i] + arr[j] + arr[k] == target){

                        ans++;
                    }
                 }
            }
        }

        return ans ;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the size of array ");

        int n = sc.nextInt();

        System.out.println(" enter the " + n + " elements of the array ");

        int arr[] = new int[n];

        for ( int i = 0 ; i < n ; i++){

            arr[i] = sc.nextInt();
        }

        System.out.println(" enter the target sum ");

        int target = sc.nextInt();

        System.out.println(TripletSum(arr, target));
    }
    
}
