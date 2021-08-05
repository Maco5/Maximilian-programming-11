import java.util.Arrays;
public class Practice {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        System.out.println(Arrays.toString(arr));
        arr = Arrays.copyOf(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}