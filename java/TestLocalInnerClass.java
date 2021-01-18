public class TestLocalInnerClass {
    
    public static void main(String... args) {
        boolean testLocal = true;
        

        class LocalInnerClass{
            void output() {
                if (testLocal) {
                    System.out.println("testLocal is true");
                } else {
                    System.out.println("testLocal is not trur");
                }
            }
        }
        LocalInnerClass ltc = new LocalInnerClass();
        ltc.output();
    }
}
