public class ShopTest {
    public static void main(String[] args) {


        Category category1 = new Category("Nabiał", "Najlepszy nabiał na Dolnym Sląsku!");
        Category category2 = new Category("Makarony", "Pyszne makarony z jaj od zielononóżek!");

        Product product1 = new Product("Mleko", 5.5, "Wiejskie mleko od szczęsliwych krów!", category1);
        Product product2 = new Product("Smietana", 8.3, "Super gęsta śmietana, idealna do ciast!", category1);
        Product product3 = new Product("Makaron nitki", 4.2, "Makaron idealny do niedzielnego rosołu!", category2);

        System.out.println("Kategoria produktu: " + product1.category.name + ". " + product1.category.description);
        System.out.println(product1.name + ": " + product1.description);
        System.out.println("Cena: " + product1.price + " zł.");
        System.out.println("\n");

        System.out.println("Kategoria produktu: " + product2.category.name + ". " + product2.category.description);
        System.out.println(product2.name + ": " + product2.description);
        System.out.println("Cena: " + product2.price + " zł.");
        System.out.println("\n");

        System.out.println("Kategoria produktu: " + product3.category.name + ". " + product3.category.description);
        System.out.println(product3.name + ": " + product3.description);
        System.out.println("Cena: " + product3.price + " zł.");



    }
}
