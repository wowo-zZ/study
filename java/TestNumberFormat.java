import java.text.NumberFormat;

public class TestNumberFormat {

    public static void main(String[] args) {
        NumberFormat moneyNF = NumberFormat.getCurrencyInstance();
        NumberFormat percentNF = NumberFormat.getPercentInstance();
        double i = 0.1;
        System.out.println(moneyNF.format(i));
        System.out.println(percentNF.format(i));
    }
    
}
