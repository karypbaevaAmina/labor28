import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cart {
    private int capacity = 500;
    private int speed = 3;
    private double money = new Random().nextInt(15000) + 25000d;
    private City city;
    private Event event;

    private Travelable travelable ;
    List<Product> productList = new ArrayList<>();

    public Cart() {
    }

    public  int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public City getCity() {
        return city;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void startDay() {
        event.startDay(this);
        if (speed != 0) {
            System.out.printf("Drove %d km today\n", speed);
            city.setDistance(city.getDistance()-speed);
            System.out.printf("%d km left to the city\n", city.getDistance());
        }
        speed = 3;
    }

    public Product getRandomProduct() {
        return productList.get(new Random().nextInt(productList.size()));
    }
}
