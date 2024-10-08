package exam;

public class Main {

    public static void main(String[] args) {

        Size S = new Size();
        Size M = new Size();
        Size L = new Size();

        //PART 1 - SHOPPING BAG

        Cloth clothingItem1 = new Cloth("Jeans", 20, S);
        Cloth clothingItem2 = new Cloth("T-shirt", 8, M);
        Cloth clothingItem3 = new Cloth("Hat", 2, L);

        Cloth[] shoppingBag = {clothingItem1, clothingItem2, clothingItem3};
        System.out.println("Subtotal of clothing items: " + UtilityMethods.calculatSubtotal(shoppingBag));

        //PART 2 - STUDENT INFO
        Student student1 = new Student("Mike", L, shoppingBag);
        Student student2 = new Student("Jane", S, shoppingBag);
        student1.setStudentID(1);
        student2.setStudentID(2);

        Student[] listOfStudents = {student1, student2};
        for (Student student : listOfStudents){
            student.printInfo();
        }

        //PART 3 PRINT STUDENT COUNTER
        Student.printStudentsCounter();

        //PART 4 HASWORKED RESTRICTIONS
        HourlyEmployee employee = new HourlyEmployee("Alex", -2, 20, S, shoppingBag);

        //PART 5 PRINT MANAGER INFO
        Manager manager = new Manager("Terry", 100000, L, shoppingBag);
        manager.printInfo();

        //PART 6 PRICE AFTER DISCOUNT
        System.out.println(clothingItem1.getName() + " will cost " + employee.getName() + " : " + employee.priceAfterDiscount(clothingItem1));

        //PART 7 CHECK FITTING
        student1.setSize(L);
        System.out.println("It is " + student1.checkFitting(clothingItem3, student1.getSize()) + " that the " + clothingItem3.getName() + " fits " + student1.getName());

        //PART 8 BUSINESS TAX EARNINGS
        Business business = new Business("Acme", 10000, 20);
        System.out.println("Is this biz taxable?: " + business.payTaxOnEarnings());

        //INCOMPLETE PROBLEMS---------------------------------------------------------------------------------------------
        //PART 9 PRINT NAMES OF PAYABLE ENTITIES
        //PART 10 DISCOUNTS
        UtilityMethods.checkCustomerDiscount(employee);
        //PART 11
        //--------------------------------------------------------------------------------------------------------------------------
    }

}
