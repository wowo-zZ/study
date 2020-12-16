public class StringStudy {
    
    public static void main(String[] args) {
        String greeting = "hello world!";
        String greetingWowo = greeting.substring(0, 5) + " wowo";
        String greetingTry = greeting.substring(0, 5) + " world!";
        System.out.println(greeting == greetingTry);
        System.out.println(greeting.equals(greetingTry));
        System.out.println(greetingWowo);
        System.out.println(Character.charCount(0x10400));
        System.out.println(Character.isLetter(0x10400));
        System.out.println(Character.toChars(0x10400).length);
        System.out.println(Character.toCodePoint((char)0xD801, (char)0xDC00));
    }
}
