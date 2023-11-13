package tddmicroexercises.leaderboard;

public class SelfDrivingCar extends Driver {

    private Name algorithmVersion;

    public SelfDrivingCar(Name algorithmVersion, String company) {
        super(algorithmVersion, company);
        this.algorithmVersion = algorithmVersion;
    }

    public String getAlgorithmVersion() {
        return algorithmVersion.getValue();
    }

    public void setAlgorithmVersion(Name algorithmVersion) {
        this.algorithmVersion = algorithmVersion;
    }

}
