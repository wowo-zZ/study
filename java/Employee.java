public class Employee {
    
    private String name;
    private int age;

    public Employee() {

    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void sayHello(Employee e) {
        // 类的方法可以访问同类实例下的私有属性
        System.out.println(String.format("%s say hello to %s", name, e.getName()));
    }
}
