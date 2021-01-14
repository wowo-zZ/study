import java.lang.Comparable;
import java.util.Arrays;

public class TestLambda {
    
    public static void main(String... args) {
        String[] strs = {"wowo", "wudaman", "ranran"};
        // Arrays.sort的多态对int[]来说，无法传入lambda表达式作为排序依据
        Arrays.sort(strs, (a, b) -> a.length() - b.length());
        System.out.println(Arrays.toString(strs));

        TestCompare tc1 = new TestCompare(2);
        TestCompare tc2 = new TestCompare(4);
        TestCompare[] tc = {tc1, tc2};
        // 传入数组的泛型类必须为实现了java.lang.Comparable的类
        Arrays.sort(tc);
        System.out.println(tc[1].getValue());

        Comparable iComparable;
        // lambda表达式也无法赋值给函数式接口的变量
        // iComparable = (a, b) -> a.length() - b.length();
    }
}

class TestCompare implements Comparable<TestCompare> {

    private int value;

    public TestCompare(int i) {
        value = i;
    }

    public int compareTo(TestCompare t) {
        return t.value - value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
}
