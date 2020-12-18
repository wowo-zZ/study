public class TestChar {
    
    public static void main(String[] args) {
        // 增补字符集的字符可以通过这个方法得到，但大概率我们的机器上显示不出来
        String s = String.valueOf(Character.toChars( 0x2F8A1 ));
        System.out.println(s);
        char []chars = s.toCharArray();
        for ( char  c:chars){
            System.out.format( " %x " ,( short )c);
            System.out.println(String.valueOf(Character.toChars(c)));
        }
    }
}
