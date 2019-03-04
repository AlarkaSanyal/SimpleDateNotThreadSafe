import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleDateNotThreadSafe {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    public static void main(String[] args) {

        String date = "2019-03-03T09:44:44";

        ExecutorService ex = Executors.newFixedThreadPool(10);

        List<PrintDate> printDates = Collections.nCopies(100, new PrintDate(date, simpleDateFormat));

        for (PrintDate printDate : printDates) {
            ex.submit(printDate);
        }
        ex.shutdown();
    }
}


