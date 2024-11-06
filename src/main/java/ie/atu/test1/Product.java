package ie.atu.test1;
public class Product
{
        private String productId;
        private String name;
        private double price;
        private int quantity;

        public Product()
        {
            this.productId = null;
            this.name = null;
        }
        public Product(String name)
        {
            this.name = name;
        }
        public Product(String productId, String name, double price, int quantity)
        {
            this.productId = productId;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
