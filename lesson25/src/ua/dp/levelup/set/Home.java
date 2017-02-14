package ua.dp.levelup.set;

/**
 * Created by java on 10.02.2017.
 */
public class Home {

    private int number;
    private String streetName;
    private int stageCount;
    private int citizens;

    public Home(int number, String streetName, int stageCount, int citizens) {
        this.number = number;
        this.streetName = streetName;
        this.stageCount = stageCount;
        this.citizens = citizens;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStageCount() {
        return stageCount;
    }

    public void setStageCount(int stageCount) {
        this.stageCount = stageCount;
    }

    public int getCitizens() {
        return citizens;
    }

    public void setCitizens(int citizens) {
        this.citizens = citizens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Home home = (Home) o;

        return number == home.number && streetName.equals(home.streetName);
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + streetName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Home{" +
                "number=" + number +
                ", streetName='" + streetName + '\'' +
                ", stageCount=" + stageCount +
                ", citizens=" + citizens +
                '}';
    }
}
