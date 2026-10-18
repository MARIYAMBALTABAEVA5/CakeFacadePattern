public class InventoryManager {
    private int flour = 10;
    private int sugar = 10;
    private int eggs = 20;

    public void reserveIngredients(int layers) {
        if (layers < 1 || layers > 5) {
            throw new IllegalArgumentException("Layers must be between 1 and 5.");
        }
        if (flour < layers || sugar < layers || eggs < layers * 2) {
            throw new IllegalStateException("Not enough ingredients.");
        }
        flour -= layers;
        sugar -= layers;
        eggs -= layers * 2;
        System.out.println("Ingredients reserved for " + layers + " layers.");
    }
}
