package ua.nure.lab.entity;

import java.time.Duration;
import java.util.Date;

public class StandardCall {
    protected String caller;
    protected String receiver;
    protected Date date;
    protected float price;
    protected int duration;
    protected String type;

    public StandardCall() {
    }

    public StandardCall(String caller, String receiver, Date date, float price, int duration, String type) {
        this.caller = caller;
        this.receiver = receiver;
        this.date = date;
        this.price = price;
        this.duration = duration;
        this.type = type;
    }

    public String getCaller() {
        return caller;
    }

    public String getReceiver() {
        return receiver;
    }

    public Date getDate() {
        return date;
    }

    public float getPrice() {
        return price;
    }

    public long getDuration() {
        return duration;
    }

    public String getType() {
        return type;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "StandardCall{" +
                "caller='" + caller + '\'' +
                ", receiver='" + receiver + '\'' +
                ", date=" + date +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }
}
