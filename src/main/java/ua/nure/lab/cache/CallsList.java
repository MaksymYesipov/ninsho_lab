package ua.nure.lab.cache;

import ua.nure.lab.entity.StandardCall;

import java.util.ArrayList;
import java.util.List;

public class CallsList {
    private List<StandardCall> calls;

    public CallsList() {
        calls = new ArrayList<>();
    }

    public void addCall(StandardCall call) {
        calls.add(call);
    }

    public List<StandardCall> getCalls() {
        return new ArrayList<>(calls);
    }
}
