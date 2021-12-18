package ua.nure.lab.factory.impl;

import ua.nure.lab.bean.CallBean;
import ua.nure.lab.entity.ShortNumberCall;
import ua.nure.lab.factory.CallFactory;

import java.time.Duration;
import java.util.Date;

public class ShortNumberCallFactory implements CallFactory {
    @Override
    public ShortNumberCall createCall(CallBean bean) {
        return new ShortNumberCall(bean.getCaller(), bean.getReceiver(), new Date(), Float.parseFloat(bean.getPrice()), Integer.parseInt(bean.getDuration()), "SHORT_NUMBER");
    }
}
