/**
 * 这个例子表明java的对象类型的参数也是值传递
 */
public class TestObjParams {
    
    public static void main(String[] args) {
        Employee a = new Employee("wowo", 23);
        Employee b = new Employee("manman", 21);
        swapEmployee(a, b);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }

    private static void swapEmployee(Employee a, Employee b) {
        Employee tmp = a;
        a = b;
        b = tmp;
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
