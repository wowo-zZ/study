import java.util.ArrayList;

public class TestArrayListE {
    
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(0);
        arrayList.add("rrr");
        System.out.println(arrayList.toString());
        TestFather tf = new TestFather();
        System.out.println(tf.getClass().getSuperclass().getName());

    }
}

class TestFather {

}
