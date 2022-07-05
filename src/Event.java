import java.util.Random;

public enum Event {
    NORMAL("Normal") {
        public void startDay(Cart cart) {
            System.out.println("Normal day!");
        }
    },
    RAIN("Rain") {
        @Override
        public void startDay(Cart cart) {
            System.out.println("it's rainy day!");
            cart.setSpeed(1);
            int random = new Random().nextInt(10);
            if (random < 3) {
                Product product = cart.getRandomProduct();
                product.downQuality();
            }
        }
    },
    FLATROAD("Flat road") {
        @Override
        public void startDay(Cart cart) {
            System.out.println("Today we are going on a flat road!");
            cart.setSpeed(5);
        }
    },
    BROKENWHEEL("Broken wheel") {
        @Override
        public void startDay(Cart cart) {
            cart.setSpeed(0);
            System.out.println("Broke wheel, wait help!");
        }
    },
    RIVER("River") {
        @Override
        public void startDay(Cart cart) {
            cart.setSpeed(0);
            System.out.println("Ran into the river, looking for a ford!");
        }
    },
    METNATIVE("Met native") {
        @Override
        public void startDay(Cart cart) {
            cart.setSpeed(0);
            int random = new Random().nextInt(3) + 3;
            City city = cart.getCity();
            city.setDistance(city.getDistance() - random);
            System.out.printf("Met native! Managed to cut %d of the way!\n", random);
        }
    },
    ROBBERS("Robbers") {
        @Override
        public void startDay(Cart cart) {
            System.out.println("Met robbers!");
            int random = new Random().nextInt(2);
            if (cart.getMoney() > 500 && random == 0) { // for pay to robbers we need have some money
                int money = (int) cart.getMoney();
                int tenPercentOfTotalMoney = money / 100 * 10;
                cart.setMoney(money - tenPercentOfTotalMoney);
                System.out.println("Give up to robbers 10 percent of money");
                System.out.printf("Money left: %d\n", cart.getMoney());
            } else {

            }
        }
    }
    ;

    Event(String event) {

    }

    public abstract void startDay(Cart cart);
}
