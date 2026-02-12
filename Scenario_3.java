import java.util.ArrayList;
class Product{
    String name;
    double price;
    Product(String name, double price){
        this.name=name;
        this.price=price;
    }
}

class ShoppingCart extends Product{
    ShoppingCart() { super(null, 0); }
    ArrayList<Product> products=new ArrayList<Product>();
    public void addProduct(Product p){
        products.add(p);
    }
    public void removeProduct(String productName){
        if(products.isEmpty()){
            System.out.println("Cart is empty. No products to remove.");
            return;
        }
        for(Product p:products)
        {
            if(p.name.equals(productName))
            {
                products.remove(p);
                System.out.println("Product removed: " + p.name);
                if(products.isEmpty()){
                    System.out.println("Cart is now empty.");
                }
                break;
            }
        }

    }
    public double calculateTotalCost(){
        double total=0;
        for(Product p:products)
        {
            total+=p.price;
        }
        return total;
    }
    public void displayCart(){
        if(products.isEmpty()){
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("Products in Cart:");
        for(Product p:products)
        {
            System.out.println("- " + p.name + ": $" + p.price);
        }
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}

public class Scenario_3 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product p1 = new Product("Laptop", 999.99);
        Product p2 = new Product("Headphones", 199.99);
        Product p3 = new Product("Mouse", 49.99);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.displayCart();

        cart.removeProduct("Headphones");
        cart.displayCart();

        cart.removeProduct("Laptop");
        cart.removeProduct("Mouse");
        cart.displayCart();
    }
}
