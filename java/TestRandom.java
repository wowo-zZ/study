import java.util.Random;

public class TestRandom {
    
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println(i);
    }
}
