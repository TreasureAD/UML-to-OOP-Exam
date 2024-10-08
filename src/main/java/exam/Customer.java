package exam;

public abstract class Customer extends Person{

    private Cloth[] clothingItems;

    //Constructor
    public Customer(String name, Size size, Cloth[] clothingItems) {
        super(name, size);
        this.clothingItems = clothingItems;
    }

    //Setter
    public void setClothingItems(Cloth[] clothingItems) {
        this.clothingItems = clothingItems;
    }

    //Print price after discount
    public double priceAfterDiscount(Cloth cloth){
        return cloth.getPrice();
    }

}
