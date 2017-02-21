package ua.dp.levelup.io.task1.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by java on 21.02.2017.
 */
public class Department<T> {

    private final String name;
    private Map<Integer, T> map = new HashMap<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, T> getMap() {
        return map;
    }

    public void setMap(Map<Integer, T> map) {
        this.map = map;
    }
}
