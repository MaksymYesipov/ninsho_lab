package ua.nure.lab.entity;

import java.util.Date;

public class EmergencyCall extends StandardCall {

    public EmergencyCall(String caller, String receiver, Date date, float price, int duration, String type) {
        super(caller, receiver, date, price, duration, type);
    }

    @Override
    public String toString() {
        return "EmergencyCall{" +
                "caller='" + caller + '\'' +
                ", receiver='" + receiver + '\'' +
                ", date=" + date +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }
}
