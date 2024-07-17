import java.util.Scanner;
import java.util.Arrays;

class Input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 55;
        arr[3] = 65;
        arr[4] = 75;
        //[23,45,55,65,75]
        System.out.println(arr[3]);

        // input using for loops
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
        // Array of Primitives
        //System.out.println(Arrays.toString(arr));
//        for (int j : arr) {
//            System.out.println(j + " ");
            //for enhanced for loop
//            for(datatype var: arr){
//                S.O.P(var+" ");
//            }
//
      //  }
       // System.out.println(arr[7]);// (error) Index out of Bounds exception
// array of Objects
    String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
          str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Bhavishya";
        System.out.println(Arrays.toString(str));
    }
}