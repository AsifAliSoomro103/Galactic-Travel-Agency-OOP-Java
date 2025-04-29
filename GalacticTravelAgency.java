class CelestialDestination {
    String name, type;
    double distanceFromEarth, basePackageCost;
    boolean hasHabitablePlanets;
public CelestialDestination(String name, String type, double distance, boolean habitable, double cost) {
        this.name = name;
        this.type = type;
        this.distanceFromEarth = distance;
        this.hasHabitablePlanets = habitable;
        this.basePackageCost = cost;
    }
  public void displayInfo() {
        System.out.println(name + " (" + type + ") - " + distanceFromEarth + " light-years");
    }    public double calculateCost(String packageType) {
        double multiplier = packageType.equals("Luxury") ? 1.5 : packageType.equals("VIP") ? 2.0 : 1.2;
        return basePackageCost * multiplier;
    }
}
public class GalacticTravelAgency {
public static void main(String[] args) {
        CelestialDestination mars = new CelestialDestination("Mars", "Planet", 0.0000158, false, 5000);
        mars.displayInfo();
        System.out.println("Cost (Luxury): $" + mars.calculateCost("Luxury"));
    }
}
