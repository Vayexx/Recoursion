public class Rec2 {
    public static void main(String[] args) {
        int[] arr = {10,40,3};
        int sum = findSum(arr, 0);
        System.out.println("max = "+sum);

    }
    static int findSum(int[] arr, int i){
        if(i<arr.length){
            if(arr[i] % 2 == 0) {
                return arr[i] + findSum(arr, i+1);
            }
            return findSum(arr, i+1);
        }
        return 0;
    }

}
