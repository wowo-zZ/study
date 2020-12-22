public class EmployeeTest {
    
    private Employee employee;

    public EmployeeTest(Employee employee) {
        this.employee = employee;
    }

    public void echoName() {
        System.out.println(this.employee.getName());
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("wowo");
        e.setAge(30);
        EmployeeTest et = new EmployeeTest(e);
        et.echoName();
        Employee tom = new Employee("tom", 27);
        Employee jack = new Employee("jack", 28);
        tom.sayHello(jack);
    }
}
