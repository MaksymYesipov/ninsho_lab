package ua.nure.lab.factory.impl;

import ua.nure.lab.bean.CallBean;
import ua.nure.lab.entity.EmergencyCall;
import ua.nure.lab.factory.CallFactory;

import java.util.Date;

public class EmergencyCallFactory implements CallFactory {
    @Override
    public EmergencyCall createCall(CallBean bean) {
        return new EmergencyCall(bean.getCaller(), bean.getReceiver(), new Date(), Float.parseFloat(bean.getPrice()), Integer.parseInt(bean.getDuration()), "EMERGENCY");
    }
}
