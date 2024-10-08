package exam;

public class Business implements Payable{

    private String name;
    private int productQtySupplied;
    private double productPrice;

    //Constructor
    public Business(String name, int productQtySupplied, double productPrice) {
        this.name = name;
        this.productQtySupplied = productQtySupplied;
        this.productPrice = productPrice;
    }


    public boolean payTaxOnEarnings(){

        if (productPrice*productQtySupplied > 100000){
            return true;
        }
        return false;
    }
}
