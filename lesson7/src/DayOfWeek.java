/**
 * Created by kid on 25.11.2016.
 */
public enum DayOfWeek {

    Monday(1, "Monday", "Понедельник", "Пн"),
    Tuesday(2, "Monday", "Понедельник", "Пн"),
    Wednesday(3, "Monday", "Понедельник", "Пн"),
    Thursday(4, "Monday", "Понедельник", "Пн"),
    Friday(5, "Monday", "Понедельник", "Пн"),
    Saturday(6, "Monday", "Понедельник", "Пн"),
    Sunday(7, "Monday", "Понедельник", "Пн");

    int dayOfWeek;
    String enName;
    String ruName;
    String ruShortName;

    DayOfWeek(int dayOfWeek, String enName, String ruName, String ruShortName) {
        this.dayOfWeek = dayOfWeek;
        this.enName = enName;
        this.ruName = ruName;
        this.ruShortName = ruShortName;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public String getEnName() {
        return enName;
    }

    public String getRuName() {
        return ruName;
    }

    public String getRuShortName() {
        return ruShortName;
    }
}
