package exam;

public class Student extends Customer{

    private long studentID;
    private static long studentsCounter = 0;
    private final double DISCOUNT = .05;
    private Size size;


    //Constructor
    public Student(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
        studentsCounter++;
    }

    //Setter and getter
    public long getStudentID() {
        return studentID;
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    //print counter
    public static void printStudentsCounter(){
        System.out.println("We have created " + studentsCounter + " students in our database successfully");
    }

    @Override
    public void printInfo(){
        System.out.println("Student ID " + studentID + " : Student Name: " + getName());
    }

    public boolean checkFitting(Cloth item, Size size){
        boolean fits;

        if(item.getSize() == getSize()){
            return true;
        }
        return false;
    }

}
