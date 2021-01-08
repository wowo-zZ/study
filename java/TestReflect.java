import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
public class TestReflect {
    
    public static void main(String[] args) {
        String className = "java.util.ArrayList";
        try {
            ArrayList a = (ArrayList) Class.forName(className).getDeclaredConstructor().newInstance();
            a.add(2);
            a.add("wowo");
            System.out.println(a.getClass().getName());
            Field[] fields = a.getClass().getDeclaredFields();
            for(Field field: fields) {
                System.out.println(field.getName());
            }
            // System.out.println(a.toString());

            ReflectFather rf = new ReflectFather("zsw", 63);
            Field name = rf.getClass().getDeclaredField("name");
            // Object v = name.get(rf);
            // String rfName = (String) v;
            Method getName = rf.getClass().getDeclaredMethod("getName");
            String n = (String) getName.invoke(rf);
            Constructor c = rf.getClass().getDeclaredConstructor(String.class, int.class);
            ReflectFather rf2 = (ReflectFather) c.newInstance("chj", 59);
            System.out.println(rf2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ReflectFather {

    private String name;
    private int age;

    public ReflectFather(String aName, int aAge) {
        name = aName;
        age = aAge;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Hello I am %s, and I am %d years old.", name, age);
    }
}
