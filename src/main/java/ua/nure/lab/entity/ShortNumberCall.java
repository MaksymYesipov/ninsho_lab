package ua.nure.lab.entity;

import java.time.Duration;
import java.util.Date;

public class ShortNumberCall extends StandardCall {
    public ShortNumberCall(String caller, String receiver, Date date, float price, int duration, String type) {
        super(caller, receiver, date, price, duration, type);
    }

    @Override
    public String toString() {
        return "ShortNumberCall{" +
                "caller='" + caller + '\'' +
                ", receiver='" + receiver + '\'' +
                ", date=" + date +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }
}
