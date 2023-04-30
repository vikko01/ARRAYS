import java.util.Scanner;

public class SortedArray {
    
    static boolean isSorted(int arr[]){

        boolean check = true;

        for ( int i = 1 ; i < arr.length ; i++){

            if ( arr[i] < arr[i-1]){

                check = false;

                break;
            }
        }
        
        return check;

    
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the size of array ");

        int n = sc.nextInt();

        int arr[] = new int [n];

        System.out.println(" enter the " + n + " elements of the array ");

        for ( int i = 0 ; i < arr.length ; i++){

            arr[i] = sc.nextInt();
        }

        System.out.println("IS SORTED :" + " " + isSorted(arr));
    
    }

    
}
