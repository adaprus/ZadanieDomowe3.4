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

    Product(String n, double pr, String des){
        name = n;
        description = des;
        price = pr;
    }

    void productInfo (){

        System.out.println(name + ": " + description);
        System.out.println("Cena: " + price + " zł.");
        System.out.println("\n");
    }
}
