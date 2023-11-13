package tddmicroexercises.leaderboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Leaderboard {

    private static final int DEFAULT_POINT = 0;

    private final List<Race> races;

    public Leaderboard(Race... races) {
        this.races = Arrays.asList(races);
    }

    public DriverResults driverResults() {
        DriverResults results = new DriverResults();
        iterativeRaces(results);
        return results;
    }

    private void iterativeRaces(DriverResults results) {
        for (Race race : this.races) {
            iterativeDrivers(results, race);
        }

    }

    private void iterativeDrivers(DriverResults results, Race race) {
        for (Driver driver : race.getResults()) {
            getResult(results, race, driver);
        }
    }

    private void getResult(DriverResults results, Race race, Driver driver) {
        String driverName = race.getDriverName(driver);
        int points = race.getPoints(driver);
        if (results.containsKey(driverName)) {
            results.add(driverName, results.getValueByKey(driverName) + points);
            return;
        }
        results.add(driverName, DEFAULT_POINT + points);
    }

    public List<String> driverRankings() {
        DriverResults results = driverResults();
        List<String> resultsList = new ArrayList<>(results.getKeys());
        resultsList.sort(new DriverByPointsDescendingComparator(results));
        return resultsList;
    }

    private static final class DriverByPointsDescendingComparator implements Comparator<String> {
        private final DriverResults results;

        private DriverByPointsDescendingComparator(DriverResults results) {
            this.results = results;
        }

        @Override
        public int compare(String driverName1, String driverName2) {
            return -results.getValueByKey(driverName1).compareTo(results.getValueByKey(driverName2));
        }
    }

}
