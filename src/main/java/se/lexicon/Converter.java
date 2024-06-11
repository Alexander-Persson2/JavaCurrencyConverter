package se.lexicon;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Converter {
    private static final double SEK_TO_USD = 0.09;
    private static final double USD_TO_SEK = 10.49;
    private static final double SEK_TO_EURO = 0.08;
    private static final double EURO_TO_SEK = 11.28;

    public static String convertSEKToUSD(double amount) {
        return formatOutput(amount, "SEK", amount * SEK_TO_USD, "USD");
    }
    public static String convertUSDToSEK(double amount) {
        return formatOutput(amount, "USD", amount * USD_TO_SEK, "SEK");
    }
    public static String convertSEKToEuro(double amount) {
        return formatOutput(amount, "SEK", amount * SEK_TO_EURO, "Euro");
    }
    public static String convertEuroToSEK(double amount) {
        return formatOutput(amount, "Euro", amount * EURO_TO_SEK, "SEK");
    }
    private static String formatOutput(double originalAmount, String originalCurrency, double convertedAmount, String convertedCurrency) {
      DecimalFormat df = new DecimalFormat("#.##");
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
      LocalDateTime now = LocalDateTime.now();
      return String.format("Converted %s %s to %s %s on %s", df.format(originalAmount), originalCurrency, df.format(convertedAmount), convertedCurrency, dtf.format(now));
    }

}
