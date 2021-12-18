package ua.nure.lab.resolver;

import ua.nure.lab.bean.CallBean;
import ua.nure.lab.entity.StandardCall;
import ua.nure.lab.factory.CallFactory;
import ua.nure.lab.factory.impl.EmergencyCallFactory;
import ua.nure.lab.factory.impl.FreeNumberCallFactory;
import ua.nure.lab.factory.impl.ShortNumberCallFactory;
import ua.nure.lab.factory.impl.StandardCallFactory;

import java.util.*;
import java.util.function.Predicate;

public class CallFactoryResolver {
    public static final List<String> EMERGENCY_NUMBERS = Arrays.asList("101", "102", "103", "104");

    private final Map<Predicate<CallBean>, CallFactory> factoryMapping;

    public CallFactoryResolver() {
        factoryMapping = new LinkedHashMap<>();
        factoryMapping.put(b -> b.getReceiver().startsWith("0800"), new FreeNumberCallFactory());
        factoryMapping.put(b -> EMERGENCY_NUMBERS.contains(b.getReceiver()), new EmergencyCallFactory());
        factoryMapping.put(b -> b.getReceiver().length() < 10, new ShortNumberCallFactory());
        factoryMapping.put(b -> true, new StandardCallFactory());
    }

    public StandardCall resolveBean(CallBean bean) {
        for (Map.Entry<Predicate<CallBean>, CallFactory> entry : factoryMapping.entrySet()) {
            if (entry.getKey().test(bean)) {
                return entry.getValue().createCall(bean);
            }
        }
        return null;
    }
}
