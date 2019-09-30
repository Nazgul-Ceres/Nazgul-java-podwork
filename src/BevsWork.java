import java.util.Scanner;

public class BevsWork {
        static int[] nums = {1,2,3,4,5,6};
        static int[] a = {1,2,3,4,5,6};
        static int[] b = {1,2,3,4,5,6};
        static int[] c = {5,5,3};

    public static void main(String[] args) {

//        https://codingbat.com/java/Warmup-1


        System.out.println(firstLast6(nums));
        System.out.println(commonEnd(a,b));
        System.out.println(sum(c));


    }

//1---------------------------------------------------------------------------------------------------------------------

//    Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.


    public static boolean firstLast6(int[] nums) {
        if(nums[0]== 6 || nums[nums.length -1] == 6) {
            return true;
        } else {
            return false;
        }

    }

//2---------------------------------------------------------------------------------------------------------------------
//
//    Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
//
//
//    commonEnd([1, 2, 3], [7, 3]) → true
//    commonEnd([1, 2, 3], [7, 3, 2]) → false
//    commonEnd([1, 2, 3], [1, 3]) → true

    public static boolean commonEnd(int[] a, int[] b) {

        if (a [a.length -1] == b[b.length -1]) {
            return true;
        } else if (a[0] == b[0]) {
            return true;
        }else {
            return false;
        }
    }

//3---------------------------------------------------------------------------------------------------------------------

//    Return the sum of the numbers in the array, returning 0 for an empty array.

    public static int sum(int[] nums) {
        int sum = 0;
        for (int value : nums) {
            sum += value;
        }
        return sum;
    }


}