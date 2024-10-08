package exam;

public class UtilityMethods {

    public static double calculatSubtotal(Cloth[] items){

        double subTotal = 0.0;

        for (Cloth item : items){
            subTotal += item.getPrice();
        }

        return subTotal;
    }

    public static String getClothingItems(Cloth[] items){
        StringBuilder str = new StringBuilder(" ");

        for (Cloth item : items){
            str.append(item.getName()).append(" ");
        }

        return str.toString();
    }

    public static boolean checkFitting(Cloth item){
    return false;

    }

    public static void printClassNamesOfPayableEntities(Payable[] payables){
        System.out.println(payables);
    }

    public static void checkCustomerDiscount(Customer customer){
        System.out.println("Student qualifies for a discount of " + Student.getDISCOUNT());
        System.out.println("HourlyEmployee qualifies for a discount of " + HourlyEmployee.DISCOUNT);
        System.out.println("Manager qualifies for a discount of " + Manager.getDiscount());
    }

}
