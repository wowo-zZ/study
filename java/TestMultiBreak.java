public class TestMultiBreak {
    
    public static void main(String[] args) {
        outer:while(true) {
            for(int i = 1; i < 10; i++) {
                if (i > 2) {
                    break outer;
                }
                System.out.println(i);
            }
        }
        System.out.println("outside");
    }
}
