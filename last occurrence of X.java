import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class LastIndex {
    
    static int LastIndex(int arr[] , int X){

        int LastIndexCount =  -1 ;

        for( int i = 0 ; i < arr.length ; i++){

            if ( arr[i] == X){

                LastIndexCount = i;
            }
        }

        return LastIndexCount;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the size of array ");

        int n = sc.nextInt();

        int arr [] = new int [n];

        System.out.println(" enter the " + n + " elements of array ");

        for ( int i = 0 ; i < arr.length ; i++){

            arr[i] = sc.nextInt();
        }

        System.out.println("enter X");

        int X = sc.nextInt();

        System.out.println("LAST occurrence OF X AT INDEX : " + " " + LastIndex(arr, X));
    }

    
}
