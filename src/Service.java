import java.util.Random;

public class Service {

    public static Product[] printProduct() {

        Product[] products = new Product[20]; //реализовать

        System.out.println("Bought the following products: ");
        for (int i = 0; i < products.length; i++) {
            switch (new Random().nextInt(5) + 1) {
                case 1:
                    products[i] = new Meat(5, "Meat", 1.2, 2500);
                    System.out.println("Meat ");
                    break;
                case 2:
                    products[i] = new DryFruits(3, "DryFruits", 1.2, 1500);
                    System.out.println("DryFruits ");
                    break;
                case 3:
                    products[i] = new Corn(50, "Corn", 0.95, 5000);
                    System.out.println("Corn ");
                    break;
                case 4:
                    products[i] = new Flour(55, "Flour", 0.55, 8000);
                    System.out.println("Flour ");
                    break;
                case 5:
                    products[i] = new Fabrics(10, "Fabrics", 0.25, 5000);
                    System.out.println("Fabrics ");
                    break;
                case 6:
                    products[i] = new Paint(2, "Paint", 0.1, 1000);
                    System.out.println("Paint ");
                    break;
            }
        }
        return products;
    }
}



