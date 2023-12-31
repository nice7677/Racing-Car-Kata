package tddmicroexercises.leaderboard;

import java.util.Objects;

public class Name {

    private final String value;

    public Name(String name) {
        this.value = name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Name name1 = (Name) o;

        return Objects.equals(value, name1.value);
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + value + '\'' +
                '}';
    }

}
