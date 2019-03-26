public class Employee {


    private double tariffPerHour = 5.5;
    public int hours;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSalary ()
    {
        return tariffPerHour * hours;
    }

    public double getTariffPerHour() {
        return tariffPerHour;
    }

}
