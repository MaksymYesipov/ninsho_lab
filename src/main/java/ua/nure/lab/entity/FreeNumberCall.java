package ua.nure.lab.entity;

import java.time.Duration;
import java.util.Date;

public class FreeNumberCall extends StandardCall {
    public FreeNumberCall(String caller, String receiver, Date date, float price, int duration, String type) {
        super(caller, receiver, date, price, duration, type);
    }

    @Override
    public String toString() {
        return "FreeNumberCall{" +
                "caller='" + caller + '\'' +
                ", receiver='" + receiver + '\'' +
                ", date=" + date +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }
}
