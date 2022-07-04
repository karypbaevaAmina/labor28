import java.util.Random;

public enum City {

    PARIS("Paris") {
        @Override
        public String getName() {
            return "Paris";
        }
    };

    String name;
    private int distance = new Random().nextInt(50) + 50;

    City(String name) {
    }

    public abstract String getName();

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }



}
