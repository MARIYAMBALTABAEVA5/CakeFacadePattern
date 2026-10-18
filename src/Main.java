public class Main {
    public static void main(String[] args) {
        CakeOrderFacade bakery = new CakeOrderFacade();
        try {
            System.out.println(bakery.orderCake("Chocolate", 2, "Strawberries", "Mariyam"));
            System.out.println();
            System.out.println(bakery.orderCake("Vanilla", 3, "Buttercream", "Amina"));
        } catch (IllegalArgumentException | IllegalStateException error) {
            System.out.println("Order failed: " + error.getMessage());
        }
    }
}
