public class CakeBatterMaker {
    public String makeBatter(String flavor, int layers) {
        if (flavor == null || flavor.trim().isEmpty()) {
            throw new IllegalArgumentException("Cake flavor is required.");
        }
        System.out.println("Mixing " + flavor + " batter for " + layers + " layers.");
        return flavor.trim() + " batter";
    }
}
