import java.util.Arrays;

public class TestArray {
    
    public static void main(String[] args) {
        int[] a;
        int[] b;
        a = new int[10];
        for (int i: a) {
            i = 10;
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < 10; i++) {
            a[i] = 10;
        }
        System.out.println(Arrays.toString(a));
        b = a;
        b[2] = 12;
        System.out.println(Arrays.toString(a));
        a = new int[] {1, 2, 3, 4};
        System.out.println(Arrays.toString(a));

        int[] c = Arrays.copyOf(a, a.length);
        a[2] = 11111;
        System.out.println(Arrays.toString(c));
    }
}
