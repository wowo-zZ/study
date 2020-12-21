import java.math.BigInteger;

public class TestBigInteger {
    
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(248888888);
        BigInteger b = BigInteger.valueOf(248888888);
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        System.out.println(a.multiply(b).mod(BigInteger.valueOf(12)));
    }
}
