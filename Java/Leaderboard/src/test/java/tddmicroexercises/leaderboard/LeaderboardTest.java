package tddmicroexercises.leaderboard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static tddmicroexercises.leaderboard.TestData.driver1;
import static tddmicroexercises.leaderboard.TestData.driver2;
import static tddmicroexercises.leaderboard.TestData.driver3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class LeaderboardTest {

    @Test
    public void itShouldSumThePoints() {
        // setup

        // act
        DriverResults results = TestData.sampleLeaderboard1.driverResults();

        // verify
        assertTrue(results.containsKey(new Name("Lewis Hamilton")), "results " + results);
        assertEquals(18 + 18 + 25, (int) results.getValueByKey(new Name("Lewis Hamilton")));
    }

    @Test
    public void isShouldFindTheWinner() {
        // setup

        // act
        List<Name> result = TestData.sampleLeaderboard1.driverRankings();

        // verify
        assertEquals(new Name("Lewis Hamilton"), result.get(0));
    }

    @Test
    public void itShouldKeepAllDriversWhenSamePoints() {
        // setup
        // bug, drops drivers with same points
        Race winDriver1 = new Race(new Name("Australian Grand Prix"), driver1, driver2, driver3);
        Race winDriver2 = new Race(new Name("Malaysian Grand Prix"), driver2, driver1, driver3);
        Leaderboard exEquoLeaderBoard = new Leaderboard(winDriver1, winDriver2);

        // act
        List<Name> rankings = exEquoLeaderBoard.driverRankings();

        // verify
        assertEquals(Arrays.asList(driver1.getName(), driver2.getName(), driver3.getName()), rankings);
        // note: the order of driver1 and driver2 is JDK/platform dependent
    }

}
