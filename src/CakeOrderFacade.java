public class CakeOrderFacade {
    private final InventoryManager inventory;
    private final CakeBatterMaker batterMaker;
    private final CakeOven oven;
    private final CakeDecorator decorator;
    private final CakePackager packager;

    public CakeOrderFacade() {
        this.inventory = new InventoryManager();
        this.batterMaker = new CakeBatterMaker();
        this.oven = new CakeOven();
        this.decorator = new CakeDecorator();
        this.packager = new CakePackager();
    }

    public String orderCake(String flavor, int layers, String decoration, String customer) {
        if (flavor == null || flavor.trim().isEmpty()
                || decoration == null || decoration.trim().isEmpty()
                || customer == null || customer.trim().isEmpty()
                || layers < 1 || layers > 5) {
            throw new IllegalArgumentException("Invalid cake order details.");
        }
        System.out.println("Starting cake order...");
        inventory.reserveIngredients(layers);
        String batter = batterMaker.makeBatter(flavor, layers);
        String bakedCake = oven.bake(batter, layers);
        String decoratedCake = decorator.decorate(bakedCake, decoration);
        String result = packager.packageCake(decoratedCake, customer);
        System.out.println("Cake order completed!");
        return result;
    }
}
