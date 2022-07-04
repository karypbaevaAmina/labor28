public enum Quality {
    HIGH("High") {
        @Override
        public void downerQuality(Product product) {
            System.out.printf("One %s quality is damaged to first class", product.getName());
            product.setQuality(Quality.FIRST);
        }

        public double getFinalCost(Product product) {
            return product.getPrice() * 1.2;
        }
    },
    FIRST("First") {
        @Override
        public void downerQuality(Product product) {
            System.out.printf("One %s quality is damaged to second class", product.getName());
            product.setQuality(Quality.SECOND);
        }

        @Override
        public double getFinalCost(Product product) {
            return product.getPrice() * 0.95;
        }
    },
    SECOND("Second") {
        @Override
        public void downerQuality(Product product) {
            System.out.printf("One %s quality is damaged to thirst class", product.getName());
            product.setQuality(Quality.THIRST);
        }

        @Override
        public double getFinalCost(Product product) {
            return product.getPrice() * 0.55;
        }
    },
    THIRST("Thirst") {
        @Override
        public void downerQuality(Product product) {
            System.out.printf("One %s quality is damaged to fourth class", product.getName());
            product.setQuality(Quality.FOURTH);
        }

        @Override
        public double getFinalCost(Product product) {
            return product.getPrice() * 0.25;
        }
    },
    FOURTH("Fourth") {
        @Override
        public void downerQuality(Product product) {

        }

        @Override
        public double getFinalCost(Product product) {
            return product.getPrice() * 0.1;
        }
    };

    private String quality;

    Quality(String quality) {}

    public abstract void downerQuality(Product product);

    public abstract double getFinalCost(Product product);

}
