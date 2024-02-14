import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Date3 {
    public static void main(String[] args) {
        String inputString = "2023-03-01T13:00:00Z";

        // Creazione dell'oggetto LocalDateTime dalla stringa
        LocalDateTime dateTime = LocalDateTime.parse(inputString, DateTimeFormatter.ISO_DATE_TIME);

        // Ottenere l'anno, mese e giorno
        int year = dateTime.getYear();
        int month = dateTime.getMonthValue();
        int day = dateTime.getDayOfMonth();

        // Ottenere il giorno della settimana
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();

        // Stampare i risultati sulla console
        System.out.println("Anno: " + year);
        System.out.println("Mese: " + month);
        System.out.println("Giorno: " + day);
        System.out.println("Giorno della settimana: " + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.US));
    }
}

