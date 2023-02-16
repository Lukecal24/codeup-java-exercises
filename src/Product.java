public class Product {
    private String name;
    private int priceInCents;

    public Product(String name, int priceInCents) {
        this.name = name;
        this.priceInCents = priceInCents;
    }

    public String getName() {
        return name;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    public static double findAveragePrice(Product[] products) {
        if (products == null || products.length == 0) {
            return 0.0;
        }

        int totalCents = 0;
        for (Product product : products) {
            totalCents += product.getPriceInCents();
        }

        return (double) totalCents / products.length / 100.0;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product("Product A", 1999),
                new Product("Product B", 2499),
                new Product("Product C", 1499)
        };

        double avgPrice = Product.findAveragePrice(products);
        System.out.println("Average price: $" + avgPrice);
    }
}