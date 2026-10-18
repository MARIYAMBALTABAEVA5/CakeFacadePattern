public class CakeOven {
    public String bake(String batter, int layers) {
        if (batter == null || batter.isEmpty()) {
            throw new IllegalArgumentException("Batter is required.");
        }
        int minutes = 20 + layers * 5;
        System.out.println("Baking " + layers + " layers for " + minutes + " minutes.");
        return "Baked " + batter;
    }
}
