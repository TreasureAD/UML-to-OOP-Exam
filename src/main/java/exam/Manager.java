package exam;

public class Manager extends Employee{

    protected static final double EXTRA_DISCOUNT = .05;
    private double salary;
    private Cloth[] clothingItems;

    // Constructor
    public Manager(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }

    public Manager(String name, double salary, Size size, Cloth[] shoppingBag) {
        super(name, size, shoppingBag);
        this.salary = salary;
        this.clothingItems = shoppingBag;
    }

    //Getter and Setter
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Cloth[] getClothingItems() {
        return clothingItems;
    }

    @Override
    public void printInfo(){
        System.out.println(getName() + " makes " + getSalary() + " and his shopping bag consists of the following clothing items: " + UtilityMethods.getClothingItems(clothingItems));
    }

    public static double getDiscount() {
        double discount = EXTRA_DISCOUNT+ Employee.getDISCOUNT();
        return discount;
    }
}
