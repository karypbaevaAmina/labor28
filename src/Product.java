public class Product {

    public int weight;

    public String name;
    public double quality;
    public int price;

    public Product(int weight, String name, double quality, int price) {
        this.weight = weight;
        this.name = name;
        this.quality = quality;
        this.price = price;
    }
    public int getWeight() {
        return weight;
    }
    public String getName(){
        return name;
    }
    public double getQuality(){
        return quality;
    }

    public int getPrice(){
        return price;
    }
}
