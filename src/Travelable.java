import java.util.Random;

public  interface Travelable {
    Event[] EVENTS = {Event.NORMAL, Event.RAIN};
    City[] CITIES = {City.BISHKEK, City.PARIS, City.MOSCOW,City.ASTANA, City.TOKYO} ;

    static Event getEvent() {
        int random = new Random().nextInt(EVENTS.length);
        return EVENTS[random];
    }
    City getCity();
}
