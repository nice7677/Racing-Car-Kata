package tddmicroexercises.leaderboard;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DriverResults {

    private final Map<Name, Integer> values;

    public DriverResults() {
        this.values = new HashMap<>();
    }

    public Integer getValueByKey(Name key) {
        return values.get(key);
    }

    public void add(Name key, Integer value) {
        values.put(key, value);
    }

    public boolean containsKey(Name key) {
        return values.containsKey(key);
    }

    public Set<Name> getKeys() {
        return values.keySet();
    }

}
