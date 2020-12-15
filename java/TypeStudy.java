public class TypeStudy {

    private final static int CONST_VALUE = 12345;
    
    public static void main(String[] args) {
        System.out.println(TypeStudy.testUpperAndLowerCase());
        TypeStudy.testComment();
        final int b = 1234;
        System.out.println(1.1/0);
        // System.out.println(1/0);
        System.out.println(2 >> 1);
        System.out.println(2 << 1);
        System.out.println(2 >>> 1);
        // illegal operator
        // System.out.println(2 <<< 1);
    }

    private static boolean testUpperAndLowerCase() {
        int bigNumber = 1000;
        int BigNumber = 10000;
        return bigNumber == BigNumber;
    }

    private static void testComment() {
        // this is a line comment;
        /*
        this is multi-lines comments;
        */
        /**
         * this is a document comment;
         */
    }

}