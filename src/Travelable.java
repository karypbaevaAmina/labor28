import java.util.Random;

public  interface Travelable {
    State[] STATES = {State.NORMAL, State.RAIN};
    City[] CITIES = {City.PARIS};

    static State getEvent() {
        int random = new Random().nextInt(STATES.length);
        return STATES[random];
    }
    City getCity();
}
