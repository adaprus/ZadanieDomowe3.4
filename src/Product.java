public class Product {
    String name;
    double price;
    String description;
    Category category;

    Product(String n, double pr, String des, Category cat){
        name = n;
        description = des;
        price = pr;
        category = cat;
    }
}
