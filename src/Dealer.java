import java.util.Random;

public class Dealer {

    public int loadCapacity = 200;
    public int moveSpeed = 3;
    public int money;

    public Dealer() {
        money = x;
    }


    public Dealer(int loadCapacity, int moveSpeed, int money) {
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

    Random rand = new Random();
    int a = 10000;
    int b = 20000;
    int x = a + rand.nextInt(b - a + 1);


}
