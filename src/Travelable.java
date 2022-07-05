import java.util.Random;

public  interface Travelable {
    Event[] EVENTS = {Event.NORMAL, Event.RAIN};
    City[] CITIES = {City.BISHKEK};

    static Event getEvent() {
        int random = new Random().nextInt(EVENTS.length);
        return EVENTS[random];
    }
    City getCity();
}
