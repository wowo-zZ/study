public class TestAssert {
    public static void main(String[] args) {
        TestAssert.testAssert(-1);
    }

    public static void testAssert(int a) {
        assert a > 0 : "a > 0";
        System.out.println(a);
    }
}
