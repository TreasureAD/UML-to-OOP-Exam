package exam;

public class Employee extends Customer implements TerminateAble, Payable{

    protected static final double DISCOUNT = .10;

    // Constructor
    public Employee(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }

    public static double getDISCOUNT() {
        return DISCOUNT;
    }

    @Override
    public double priceAfterDiscount(Cloth cloth){
        return cloth.getPrice() - cloth.getPrice()*DISCOUNT;
    }
}

