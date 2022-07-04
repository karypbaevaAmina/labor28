import java.util.List;
import java.util.Random;

public class Dealer {

    private int loadCapacity = 200;
    private int moveSpeed = 3;
    private int money =new Random().nextInt(10000) + 20000;;
    private City city;
    private List<Product>productList;
    private State state;


    public Dealer() {
        this.loadCapacity = loadCapacity;
        this.moveSpeed = moveSpeed;
        this.money = money;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }
    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public City getCity() {
        return city;
    }

    public void startDay() {
        state.startDay(this);
        if (moveSpeed != 0) {
            System.out.printf("Drove %d km today\n", moveSpeed);
            city.setDistance(city.getDistance()-moveSpeed);
            System.out.printf("%d km left to the city\n", city.getDistance());
        }
        moveSpeed = 3;
    }

    public Product getRandomProduct() {
        return productList.get(new Random().nextInt(productList.size()));
    }


}
