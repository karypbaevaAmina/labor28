import java.util.Random;

public enum City {

    PARIS("Paris") {
        @Override
        public String getName() {
            return "Paris";
        }
    },
    BISHKEK ("Bishkek") {
        @Override
        public String getName() {
            return "Bishkek";
        }
    },
    MOSCOW("Moscow") {
        @Override
        public String getName() {
            return "Moscow";
        }
    },
    TOKYO("Tokyo") {
        @Override
        public String getName() {
            return "Tokyo";
        }
    },
    ASTANA ("Astana") {
        @Override
        public String getName() {
            return "Astana";
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
