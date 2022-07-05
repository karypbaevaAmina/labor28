public class Product {

    private int weight;

    private String name;
    private Quality quality;
    private int price;

    public Product(int weight, String name, Quality quality, int price) {
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

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public int getPrice(){
        return price;
    }

    public double getFinalCost() {
        return quality.getFinalCost(this);
    }
    public void downQuality() {
        quality.downerQuality(this);
    }
}
