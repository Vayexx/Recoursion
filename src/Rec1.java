public class Rec1 {
    public static void main(String[] args) {
        //Есть массив чисел. Найти максимальное число
        int[] arr = {20,80,3};
        int max = findMax(arr, 0);
        System.out.println("max = "+max);
    }

    static int findMax(int[] arr, int i){
        if(i<arr.length) {
            int next = findMax(arr, i + 1);
            if (arr[i] % 2 == 0) {
                if (arr[i] > next) {
                    return arr[i];
                } else {
                    return next;
                }
            }
        }

        return 0;
    }


}
