import java.time.LocalDate;
import java.util.Date;

public class TestDate {
    

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalDate oneHundredDaysLater = ld.plusDays(100);
        System.out.println(oneHundredDaysLater);
    }
}
