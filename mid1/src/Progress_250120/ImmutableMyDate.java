package Progress_250120;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public ImmutableMyDate changeDate(int year, int month, int day){
        return new ImmutableMyDate(year,month,day);
    }

    public ImmutableMyDate withYear(int year){
        return new ImmutableMyDate(year,this.month,this.day);
    }

    public ImmutableMyDate withMonth(int month){
        return new ImmutableMyDate(this.year,month,this.day);
    }

    public ImmutableMyDate withDay(int day){
        return new ImmutableMyDate(this.year,this.month,day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}