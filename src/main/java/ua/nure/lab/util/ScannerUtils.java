package ua.nure.lab.util;

import ua.nure.lab.bean.CallBean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class ScannerUtils {

    private static BufferedReader reader;

    public static CallBean readCallFromConsole() {
        CallBean bean = new CallBean();
        System.out.println("----NEW-CALL----");
        reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            setFromConsole(reader, "Caller number (international format)", bean::setCaller);
            setFromConsole(reader, "Receiver number (international format)", bean::setReceiver);
            setFromConsole(reader, "Price", bean::setPrice);
            setFromConsole(reader, "Duration (in seconds)", bean::setDuration);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bean;
    }

    public static void close() {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void setFromConsole(BufferedReader reader, String header, Consumer<String> setter) throws IOException {
        System.out.print(header + ": ");
        setter.accept(reader.readLine());
    }

    private ScannerUtils() {
        throw new UnsupportedOperationException();
    }
}
