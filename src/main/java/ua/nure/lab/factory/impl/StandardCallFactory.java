package ua.nure.lab.factory.impl;

import ua.nure.lab.bean.CallBean;
import ua.nure.lab.entity.StandardCall;
import ua.nure.lab.factory.CallFactory;

import java.time.Duration;
import java.util.Date;

public class StandardCallFactory implements CallFactory {
    @Override
    public StandardCall createCall(CallBean bean) {
        return new StandardCall(bean.getCaller(), bean.getReceiver(), new Date(), Float.parseFloat(bean.getPrice()), Integer.parseInt(bean.getDuration()), "STANDARD");
    }
}
