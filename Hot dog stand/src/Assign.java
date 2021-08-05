import java.util.Arrays;
public class Assign {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        System.out.println(Arrays.toString(arr));
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length-1]=10;
        System.out.println(Arrays.toString(arr));
    }
}