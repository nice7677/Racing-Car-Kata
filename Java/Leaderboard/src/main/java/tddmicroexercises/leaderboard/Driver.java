package tddmicroexercises.leaderboard;

import java.util.Objects;

public class Driver {

    private final Name name;
    private final String country;

    public Driver(Name name, String country) {
        this.name = name;
        this.country = country;
    }

    public Name getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        if (!Objects.equals(name, driver.name)) return false;
        return Objects.equals(country, driver.country);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }

}
