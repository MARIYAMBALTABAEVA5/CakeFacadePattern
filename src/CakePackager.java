public class CakePackager {
    public String packageCake(String decoratedCake, String customer) {
        if (decoratedCake == null || decoratedCake.isEmpty()) {
            throw new IllegalArgumentException("Decorated cake is required.");
        }
        if (customer == null || customer.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name is required.");
        }
        System.out.println("Packing cake for " + customer + ".");
        return "Order ready for " + customer + ": " + decoratedCake;
    }
}
