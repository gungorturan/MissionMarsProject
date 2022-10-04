public class Rocket implements SpaceShip {
    int cost;
    int weight;
    int maxWeight; // Max Weight (with cargo)
    double launchExplosion; // Chance of launch explosion
    double landingCrush; // Chance of landing crush
    int currentWeight;

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        return this.currentWeight + item.weight <= maxWeight;
    }

    public int carry(Item item) {
        this.currentWeight += item.weight;
        return this.currentWeight;
    }

}
