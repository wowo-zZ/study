public class TestInterface implements ITest{
    
    public String testFunction() {
        return name;
    }
}

interface ITest{
    String name = "wowo";
    int age = 12;

    String testFunction();
}
