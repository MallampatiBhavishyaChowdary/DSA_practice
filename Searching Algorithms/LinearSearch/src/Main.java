public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[] nums = new int[]{23, 16, 17, 18, -1, 12, -3};
        int target = 12;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        } else {
            int[] var2 = arr;
            int var3 = arr.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                int element = var2[var4];
                if (element == target) {
                    return true;
                }
            }

            return false;
        }
    }

    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        } else {
            int[] var2 = arr;
            int var3 = arr.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                int element = var2[var4];
                if (element == target) {
                    return element;
                }
            }

            return Integer.MAX_VALUE;
        }
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        } else {
            for(int index = 0; index < arr.length; ++index) {
                int element = arr[index];
                if (element == target) {
                    return index;
                }
            }

            return -1;
        }
    }
}
