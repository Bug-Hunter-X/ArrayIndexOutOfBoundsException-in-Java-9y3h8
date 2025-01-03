public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // Or to avoid the error completely:
        // if (index >=0 && index < arr.length) {
        //     System.out.println(arr[index]);
        // }
    }
}