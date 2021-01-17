public class TestInnerClass {
    
    private boolean innerClassFlag;

    public TestInnerClass(boolean b) {
        innerClassFlag = b;
    }

    public void run() {
        InnerClass ic = new InnerClass();
        ic.showStatus();
    }

    public class InnerClass{
        public void showStatus() {
            if (innerClassFlag) {
                System.out.println("innerclass flag is true");
            } else {
                System.out.println("innerclass flag is false");
            }
        }
    }

    public static void main(String... args) {
        TestInnerClass tic = new TestInnerClass(true);
        tic.run();
    }
}
