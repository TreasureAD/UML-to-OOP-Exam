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

}
