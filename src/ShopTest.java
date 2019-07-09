public class ShopTest {
    public static void main(String[] args) {


        Category category1 = new Category("Nabiał", "Najlepszy nabiał na Dolnym Sląsku!");
        Category category2 = new Category("Makarony", "Pyszne makarony z jaj od zielononóżek!");

        Product product1 = new Product("Mleko", 5.5, "Wiejskie mleko od szczęsliwych krów!", category1);
        Product product2 = new Product("Smietana", 8.3, "Super gęsta śmietana, idealna do ciast!", category1);
        Product product3 = new Product("Makaron nitki", 4.2, "Makaron idealny do niedzielnego rosołu!", category2);
        Product product4 = new Product("Torba lniana", 16, "Idealna na zakupy na bazarze!");

        product1.categoryInfo(product1);
        product1.productInfo(product1);

        product2.categoryInfo(product2);
        product2.productInfo(product2);

        product3.categoryInfo(product3);
        product3.productInfo(product3);

        product4.productInfo(product4);

        SpecialOffer specialOffer = new SpecialOffer(product3, "Specjalna okazja w lipcu na makaron nitki!", "07.07.2019 - 31.07.2019", 0.2 );
        product3.price = product3.price * (1-specialOffer.reduce);

        System.out.println("Oferta specjalna na: " + product3.name);
        System.out.println(specialOffer.offerDescription);
        System.out.println("Czas trwania promocji: " + specialOffer.data);
        System.out.printf("Aktualna cena produktu: %2.2f\n", product3.price);
    }
}
