import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        String inputString = "2002-03-01T13:00:00Z";

        // Creazione dell'oggetto OffsetDateTime dalla stringa
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(inputString);

        // Formattazione della data in FULL, MEDIUM e SHORT
        String fullFormat = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String mediumFormat = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String shortFormat = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        // Stampare le varie versioni formattate
        System.out.println("Formato FULL: " + fullFormat);
        System.out.println("Formato MEDIUM: " + mediumFormat);
        System.out.println("Formato SHORT: " + shortFormat);
    }
}
