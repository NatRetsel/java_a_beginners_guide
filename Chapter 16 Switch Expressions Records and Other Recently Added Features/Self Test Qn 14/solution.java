/*
 * In the BlockArrowCaseDemo program, the switch expression yields the shipping method, but the variable
 * extraCharge is set separately inside each case. This program can be improved by having the switch yield a record that
 * contains both the shipping method and the extraCharge value. In essence, the use of a record enables the switch to yield
 * two or more values when it returns its result. Rework the BlockArrowCaseDemo program to demonstrate this approach.
 */
class BlockArrowCaseDemo {

    enum ShipMethod { STANDARD, TRUCK, AIR, OVERNIGHT }
    record ShippingMeth (ShipMethod sm, boolean extraCharge) {}

    public static void main(String[] args) {
        int productID = 5099;
        
        ShippingMeth result = switch(productID) {
            case 1774, 8708, 6709 -> new ShippingMeth(ShipMethod.TRUCK, true);
            case 4657, 2195, 1887, 3621 -> new ShippingMeth(ShipMethod.AIR, false);
            case 2907, 5099 -> new ShippingMeth(ShipMethod.OVERNIGHT, true);
            default -> new ShippingMeth(ShipMethod.STANDARD, false);
        };

        System.out.println("Shipping method for product number " + productID + " is " + result.sm());
        if(result.extraCharge()) System.out.println("Extra charge required.");
        
    }
}