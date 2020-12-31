public class TestInherite {
    
    public static void main(String[] args) {

    }

    public class Father {
        private String name;
        private int age;

        public Father(String aName, int aAge) {
            name = aName;
            age = aAge;
        }
    } 

    public class Son extends Father {
        public Son() {
            // 如果没有这个，无法编译通过
            super("zs", 12);
        }
    }
}
