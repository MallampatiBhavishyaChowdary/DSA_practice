public class MultiDimensional {
    public static void main(String[] args){
        /*
             1 2 3
             4 5 6
             7 8 9
         */

        int[][] arr = new int[3][];
//2d Array
      //  int[][] arr = new int[3][];// no of cols is not mandatory
        int[][] arr = {
                {1, 2, 3},//0th index
                {4, 5},//1st index
                {6, 7, 8, 9}//2nd index--> arr2D[2] = {6, 7, 8, 9}
        };
        //input
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
}
