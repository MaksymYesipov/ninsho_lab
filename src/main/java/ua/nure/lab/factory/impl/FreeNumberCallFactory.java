package ua.nure.lab.factory.impl;

import ua.nure.lab.bean.CallBean;
import ua.nure.lab.entity.FreeNumberCall;
import ua.nure.lab.factory.CallFactory;

import java.util.Date;

public class FreeNumberCallFactory implements CallFactory {
    @Override
    public FreeNumberCall createCall(CallBean bean) {
        return new FreeNumberCall(bean.getCaller(), bean.getReceiver(), new Date(), Float.parseFloat(bean.getPrice()), Integer.parseInt(bean.getDuration()), "FREE_NUMBER");
    }
}
