import java.util.*;
import java.util.Arrays;

public class PassinginFunctions{
    public static void main(String args[]){
        int[] nums = {22,27,2,31};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 27;
    }
}