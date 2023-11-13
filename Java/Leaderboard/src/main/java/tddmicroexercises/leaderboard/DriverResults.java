package tddmicroexercises.leaderboard;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DriverResults {

    private final Map<String, Integer> values;

    public DriverResults() {
        this.values = new HashMap<>();
    }

    public Integer getValueByKey(String key) {
        return values.get(key);
    }

    public void add(String key, Integer value) {
        values.put(key, value);
    }

    public boolean containsKey(String key) {
        return values.containsKey(key);
    }

    public Set<String> getKeys() {
        return values.keySet();
    }

}
