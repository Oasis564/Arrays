import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //create a one dimensional array
        Scanner s = new Scanner(System.in);
        // declaration of array which can contain 5 items
        int arr[] = new int[5];

        //initialization
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // traversing array
        for(int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }

        System.out.println("==========================starting 2d arrays from here==========================");
        // create a 2d array
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};

        // print 2 from arr1
        System.out.println(arr1[0][1]);

        System.out.println("==========================starting 2d arrays print from here==========================");

        // print all the items in arr1
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(arr1[i][j]);
            }
        }

        // write a program to ask the choice of the user

        system.out.println("do you want to do a 1d array or 2d array?");
        int choice;

    }
}
