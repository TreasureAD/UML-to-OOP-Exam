package exam;

public abstract class Person {

    private String name;
    private Size size = new Size(); //Composition relationship

    // Constructor
    public Person(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    //Print info
    public void printInfo(){}

}
