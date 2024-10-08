package exam;

public class HourlyEmployee extends Employee {

    private float hoursWorked;
    private double hourlyWage;


    public HourlyEmployee(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }

    public HourlyEmployee(String name, float hoursWorked, double hourlyWage, Size size, Cloth[] shoppingBag){
        super(name, size, shoppingBag);
        this.hourlyWage = hourlyWage;
        if (hoursWorked > 0){
            this.hoursWorked = hoursWorked;
        } else {
            System.out.println("hoursWorked cannot be a negative number");
        }
    }

    //Getter and Setter
    public float getHasWorked() {
        return hoursWorked;
    }

    public void setHasWorked(float hoursWorked) {
        if (hoursWorked > 0){
            this.hoursWorked = hoursWorked;
        } else {
            System.out.println("hoursWorked cannot be a negative number");
        }
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
}
