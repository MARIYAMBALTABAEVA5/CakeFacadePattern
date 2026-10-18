public class CakeDecorator {
    public String decorate(String bakedCake, String decoration) {
        if (bakedCake == null || bakedCake.isEmpty()) {
            throw new IllegalArgumentException("A baked cake is required.");
        }
        if (decoration == null || decoration.trim().isEmpty()) {
            throw new IllegalArgumentException("Decoration is required.");
        }
        System.out.println("Decorating cake with " + decoration + ".");
        return bakedCake + " with " + decoration;
    }
}
