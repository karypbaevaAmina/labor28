import java.util.Random;

public enum State {
    NORMAL("Normal") {
        public void startDay(Dealer dealer) {
            System.out.println("Normal day!");
        }
    },
    RAIN("Rain") {
        @Override
        public void startDay(Dealer dealer) {
            System.out.println("it's rainy day!");
            dealer.setMoveSpeed(1);
            int random = new Random().nextInt(10);
            if (random < 3) {
                Product product = dealer.getRandomProduct();
                product.downQuality();
            }
        }
    },
    FLATROAD("Flat road") {
        @Override
        public void startDay(Dealer dealer) {
            System.out.println("Today we are going on a flat road!");
            dealer.setMoveSpeed(5);
        }
    },
    BROKENWHEEL("Broken wheel") {
        @Override
        public void startDay(Dealer dealer) {
            dealer.setMoveSpeed(0);
            System.out.println("Broke wheel, wait help!");
        }
    },
    RIVER("River") {
        @Override
        public void startDay(Dealer dealer) {
            dealer.setMoveSpeed(0);
            System.out.println("Ran into the river, looking for a ford!");
        }
    },
    METNATIVE("Met native") {
        @Override
        public void startDay(Dealer dealer) {
            dealer.setMoveSpeed(0);
            int random = new Random().nextInt(3) + 3;
            City city = dealer.getCity();
            city.setDistance(city.getDistance() - random);
            System.out.printf("Met native! Managed to cut %d of the way!\n", random);
        }
    },
    ROBBERS("Robbers") {
        @Override
        public void startDay(Dealer dealer) {
            System.out.println("Met robbers!");
            int random = new Random().nextInt(2);
            if (dealer.getMoney() > 500 && random == 0) {
                int money = dealer.getMoney();
                int tenPercentOfTotalMoney = money / 100 * 10;
                dealer.setMoney(money - tenPercentOfTotalMoney);
                System.out.println("Give up to robbers 10 percent of money");
                System.out.printf("Money left: %d\n", dealer.getMoney());
            } else {

            }
        }
    };
    State(String state) {
    }

    public abstract void startDay(Dealer dealer);


}
