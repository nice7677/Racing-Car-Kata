package tddmicroexercises.leaderboard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {

    private static final int[] POINTS = new int[]{25, 18, 15};
    private static final String NAME_RULE = "Self Driving Car - ";
    private static final String LEFT_BRACKET = " (";
    private static final String RIGHT_BRACKET = " )";

    private final Name name;
    private final List<Driver> results;
    private final Map<Driver, Name> driverNames;

    public Race(Name name, Driver... drivers) {
        this.name = name;
        this.results = Arrays.asList(drivers);
        this.driverNames = new HashMap<>();
        for (Driver driver : results) {
            this.driverNames.put(driver, getDriverName(driver));
        }
    }

    private Name getDriverName(Driver driver) {
        if (driver instanceof SelfDrivingCar) {
            return new Name(NAME_RULE + driver.getCountry() + LEFT_BRACKET + ((SelfDrivingCar) driver).getAlgorithmVersion() + RIGHT_BRACKET);
        }
        return driver.getName();
    }

    public int position(Driver driver) {
        return this.results.indexOf(driver);
    }

    public int getPoints(Driver driver) {
        return Race.POINTS[position(driver)];
    }

    public List<Driver> getResults() {
        return results;
    }

    public Name getDriverNameByDriver(Driver driver) {
        return this.driverNames.get(driver);
    }

    @Override
    public String toString() {
        return name.toString();
    }
}
