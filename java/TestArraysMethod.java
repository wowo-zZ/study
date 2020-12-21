import java.util.Arrays;

public class TestArraysMethod {
    
    public static void main(String[] args) {
        int[] a = {10, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));
        int[] b = Arrays.copyOfRange(a, 0, 2);
        System.out.println(Arrays.toString(b));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int search = Arrays.binarySearch(a, 4);
        System.out.println(search);
        int[] d = new int[10];
        Arrays.fill(d, 10);
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.equals(a, d));
    }
}
