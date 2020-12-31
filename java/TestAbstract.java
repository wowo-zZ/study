public class TestAbstract {
    
    public static void main(String[] args) {
        Super s = new Sub();
        System.out.println(s.getName());
    }

}

abstract class Super{

    // if without this declaration of method, error will occur
    public abstract String getName();
}

class Sub extends Super {

    public String getName() {
        return "wowo";
    }
}
