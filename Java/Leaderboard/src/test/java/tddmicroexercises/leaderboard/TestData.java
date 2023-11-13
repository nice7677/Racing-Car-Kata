package tddmicroexercises.leaderboard;

public class TestData {

    public static Driver driver1;
    public static Driver driver2;
    public static Driver driver3;
    public static SelfDrivingCar driver4;

    public static Race race1;
    public static Race race2;
    public static Race race3;
    public static Race race4;
    public static Race race5;
    public static Race race6;

    public static Leaderboard sampleLeaderboard1;
    public static Leaderboard sampleLeaderboard2;

    static {
        driver1 = new Driver(new Name("Nico Rosberg"), "DE");
        driver2 = new Driver(new Name("Lewis Hamilton"), "UK");
        driver3 = new Driver(new Name("Sebastian Vettel"), "DE");
        driver4 = new SelfDrivingCar(new Name("1.2"), "Acme");

        race1 = new Race(new Name("Australian Grand Prix"), driver1, driver2, driver3);
        race2 = new Race(new Name("Malaysian Grand Prix"), driver3, driver2, driver1);
        race3 = new Race(new Name("Chinese Grand Prix"), driver2, driver1, driver3);
        race4 = new Race(new Name("Fictional Grand Prix 1"), driver1, driver2, driver4);
        race5 = new Race(new Name("Fictional Grand Prix 2"), driver4, driver2, driver1);
        driver4.setAlgorithmVersion(new Name("1.3"));
        race6 = new Race(new Name("Fictional Grand Prix 3"), driver2, driver1, driver4);

        sampleLeaderboard1 = new Leaderboard(race1, race2, race3);
        sampleLeaderboard2 = new Leaderboard(race4, race5, race6);
    }
}
