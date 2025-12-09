package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

    private List<Object> list = new ArrayList<>();

    public void addValue(Object value) {
        list.add(value);
    }

    public Object first() {
        return list.getFirst();
    }

    public void print() {
        System.out.println(list);
    }
}
