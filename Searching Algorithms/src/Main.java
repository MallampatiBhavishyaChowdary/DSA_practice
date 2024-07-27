//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {23,16,17,18,-1,12,-3};
        int target = 12;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }
    //search the target and return true or false
     static boolean linearSearch3(int[] arr,int target){
        if(arr.length == 0){
            return false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        //this line will execute if none of the return statements above have found then return the target element
        //hence target not found
        return false;

    }
    //search the target and return the index itself
    static int linearSearch2(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        //this line will execute if none of the return statements above have found then return the target element
        //hence target not found
        return Integer.MAX_VALUE;

    }
    //search in the array: return the index if the item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //this line will execute if none of the return statements above have found then return the target element
        //hence target not found
        return -1;

    }
}