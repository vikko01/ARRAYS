import java.util.Scanner;

public class query {

    static int [] makeFrequencyArray( int arr[] ){
        int freq[] = new int [100005];

        for( int i = 0 ; i < arr.length ; i++){
            freq[arr[i]]++;

        }

        return freq;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the size of the array ");
        int n = sc.nextInt();

        int arr[] = new int [n];

        System.out.println(" enter the " + n + " elements of the array ");
        for( int i = 0 ; i < arr.length ; i++ ){
            arr[i] = sc.nextInt();
        }

        int freq[] = makeFrequencyArray(arr);

        System.out.println(" enter the number of queries ");

        int q = sc.nextInt();

        while( q > 0 ){
            System.out.println(" enter number to be reached ");
            int x = sc.nextInt();

            if( freq[x] > 0 ){

                System.out.println(" YES ");

            }
            else {

                System.out.println(" NO ");
            }

            q--;
        }

    }
}
