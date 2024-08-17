import java.util.ArrayList;

class Basket {
    private ArrayList<Product> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
    }

    public void removeProduct(Product product) {
        items.remove(product);
    }

    public ArrayList<Product> getItems() {
        return items;
    }
}