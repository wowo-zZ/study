import javax.swing.Timer;

public class TestMethodReference extends Greeter{
    
    public static void main(String... args) {
        
    }

    public void timeGreet() {
        Timer t = new Timer(1000, super::greet);
        t.start();
    }
}

class Greeter {
    public void greet() {
        System.out.println("hello wowo!");
    }
}
