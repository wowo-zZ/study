public class TestStaticMethod {

    public static String STATIC_FEILD = "111";
    public static final String STATIC_FINAL_FEILD = "222";
    public String normalFeild = "sdfs";
    
    public String getObjectFeild() {
        return "test";
    }

    public static void printString() {
        // this is illegal, this can not be refrence in static method
        System.out.println(this.getObjectFeild());

        // this is also illegal, no-static methed can not be call in static method
        System.out.println(getObjectFeild());

        // non-static feild can not be refrence in static method
        System.out.println(normalFeild);

        // only static feild can be refrence
        System.out.println(STATIC_FEILD);
        System.out.println(STATIC_FINAL_FEILD);
    }
}
