import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Milk", 1.5, 4);
        Product product2 = new Product("Bread", 0.8, 3);
        Product product3 = new Product("Eggs", 2.0, 5);

        Category category1 = new Category("Dairy", new ArrayList<>());
        category1.getProducts().add(product1);
        category1.getProducts().add(product3);

        Category category2 = new Category("Bakery", new ArrayList<>());
        category2.getProducts().add(product2);

        Basket basket1 = new Basket();
        basket1.addProduct(product1);

        User user1 = new User("user1", "123456", basket1);

        System.out.println("Catalog of products:");
        System.out.println("Category: " + category1.getName());
        for (Product product : category1.getProducts()) {
            System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice() + ", Rating: " + product.getRating());
        }

        System.out.println("\nUser's purchases:");
        System.out.println("User: " + user1.getLogin());
        for (Product product : user1.getBasket().getItems()) {
            System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice() + ", Rating: " + product.getRating());
        }
    }
}