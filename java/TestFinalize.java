public class TestFinalize {
    
    public static void main(String[] args) {
        TestFinalize tf = new TestFinalize();
        System.out.println("Excuting over");
        tf = null;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize excuting...");
    }

}
