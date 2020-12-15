public class StringTest {
    
    public static void main (String[] args) {
        String str = "Hello wowo~";
        System.out.println(str.codePointAt(7));
        System.out.println("abs".compareTo("abs"));
        System.out.println("abs".compareToIgnoreCase("Abs"));

        System.out.println("wowo".endsWith("wo"));
        char[] chars = {'w', 'o'};
        System.out.println(Character.codePointAt(chars, 1));
        System.out.println("wowo".indexOf("owo"));
        System.out.println("wowo".indexOf(111));
        System.out.println("wowo".length());
        System.out.println("wowo".codePointCount(1, 4));
        System.out.println("wowo".replace("ow", "sss"));
        System.out.println("wowo".substring(2, 3));
        System.out.println("wowo".toLowerCase());
        System.out.println("wowo".toUpperCase());
        System.out.println("wowo".trim());


        StringBuilder sb = new StringBuilder();
        sb.append('a');
        sb.append('b');
        sb.append((char)111);
        sb.append((char)0xf2);
        sb.insert(1, "sss");
        System.out.println(sb.toString());
    }
}