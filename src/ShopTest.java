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
        System.out.println("\n");

        SpecialOffer specialOffer = new SpecialOffer(product3, "Specjalna okazja w lipcu na makaron nitki!", "07.07.2019 - 31.07.2019", 0.2 );
        product3.price = product3.price * (1-specialOffer.reduce);

        System.out.println("Oferta specjalna na: " + product3.name);
        System.out.println(specialOffer.offerDescription);
        System.out.println("Czas trwania promocji: " + specialOffer.data);
        System.out.printf("Aktualna cena produktu: %2.2f\n", product3.price);



    }
}
