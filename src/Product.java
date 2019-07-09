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

    void productInfo (Product product){

        System.out.println(product.name + ": " + product.description);
        System.out.println("Cena: " + product.price + " zł.");
        System.out.println("\n");
    }

    void categoryInfo(Product product){
        System.out.println("Kategoria produktu: " + product.category.name + ". " + product.category.description);
    }

}
