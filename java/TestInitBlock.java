public class TestInitBlock {
    
    private int id;
    private int nextId;

    private static int staticId;
    private static int nextStaticId;

    {
        nextId = nextId == 0 ? 1 : nextId + 1;
        id = nextId;
        nextStaticId = nextStaticId == 0 ? 1 : nextStaticId + 1;
        staticId = nextStaticId;
    }

    public static void main(String[] args) {
        TestInitBlock tib1 = new TestInitBlock();
        System.out.println(tib1.getId());
        System.out.println(tib1.getNextId());
        System.out.println(TestInitBlock.getStaticId());
        System.out.println(TestInitBlock.getNextStaticId());
        TestInitBlock tib2 = new TestInitBlock();
        System.out.println(tib2.getId());
        System.out.println(tib2.getNextId());
        System.out.println(TestInitBlock.getStaticId());
        System.out.println(TestInitBlock.getNextStaticId());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNextId() {
        return nextId;
    }

    public void setNextId(int nextId) {
        this.nextId = nextId;
    }

    public static int getStaticId() {
        return staticId;
    }

    public static void setStaticId(int staticId) {
        TestInitBlock.staticId = staticId;
    }

    public static int getNextStaticId() {
        return nextStaticId;
    }

    public static void setNextStaticId(int nextStaticId) {
        TestInitBlock.nextStaticId = nextStaticId;
    }
}
