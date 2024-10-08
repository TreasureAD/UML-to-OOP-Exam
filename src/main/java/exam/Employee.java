package exam;

public class Employee extends Customer implements TerminateAble, Payable{

    protected final double DISCOUNT = .10;

    // Constructor
    public Employee(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    @Override
    public double priceAfterDiscount(Cloth cloth){
        return cloth.getPrice() - cloth.getPrice()*DISCOUNT;
    }
}

