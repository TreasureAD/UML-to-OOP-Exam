package exam;

public class Cloth {

    private String name;
    private double price;
    private Size size = new Size(); //Composition

    public Cloth(String name, double price, Size size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
