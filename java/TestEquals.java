public class TestEquals {

    public static void main(String[] args) {
        Child child = new Child();
        Child child1 = new Child();
        System.out.println(child.equals(child1));
        System.out.println(child.getClass().getModifiers());
    }

}

class Father {

    public boolean equals(Father otherObject) {
        return true;
    }
}

class Child extends Father{

    public boolean equals(Child otherObject) {

        if (!super.equals(otherObject)) {
            return false;
        }
        return true;
    }
}
