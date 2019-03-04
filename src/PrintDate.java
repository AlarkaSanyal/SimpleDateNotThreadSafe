import java.text.SimpleDateFormat;

public class PrintDate implements Runnable {

    String date;
    SimpleDateFormat simpleDateFormat;

    public PrintDate(String date, SimpleDateFormat simpleDateFormat) {
        this.date = date;
        this.simpleDateFormat = simpleDateFormat;
    }

    @Override
    public void run() {
        try {
            System.out.println(simpleDateFormat.parse(date));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
