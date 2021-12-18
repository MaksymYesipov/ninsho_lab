package ua.nure.lab.factory;

import ua.nure.lab.bean.CallBean;
import ua.nure.lab.entity.StandardCall;

public interface CallFactory {
    StandardCall createCall(CallBean bean);
}
