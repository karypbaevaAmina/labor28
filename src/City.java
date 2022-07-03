import java.util.Random;

public enum City {
    BISHKEK,
    MOSCOW,
    NEWYORK,
    PARIS,
    TOKYO,
    ISSYKKUL;

    public void getCity() { // метод для подбора города
        switch (new Random().nextInt(6) + 1) {
            case 1:
                System.out.println(BISHKEK);
                break;
            case 2:
                System.out.println(MOSCOW);
                break;
            case 3:
                System.out.println(NEWYORK);
                break;
            case 4:
                System.out.println(PARIS);
                break;
            case 5:
                System.out.println(TOKYO);
                break;
            case 6:
                System.out.println(ISSYKKUL);
                break;
        }
    }


}
