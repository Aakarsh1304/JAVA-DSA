public class BinaRec {
    //Binary Search using Recursion

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 0;
    
        System.out.println(seaaa(arr, target,0,arr.length-1));
    }

    static int seaaa(int[] arr, int t, int s, int e) {

        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == t) {
            return m;
        }
        if (arr[m] > t) {
            return seaaa(arr, t, s, m - 1);
        } else {
            return seaaa(arr, t, m + 1, e);

        }

    }
}
