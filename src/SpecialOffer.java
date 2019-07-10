public class SpecialOffer {
    Product product;
    String offerDescription;
    String data;
    double reduce;

    SpecialOffer(Product pro, String des, String d, double red){
        product = pro;
        offerDescription = des;
        data = d;
        reduce = red;
    }

    void specialOfferInfo (){
        System.out.println("Oferta specjalna na: " + product.name);
        System.out.println(offerDescription);
        System.out.println("Czas trwania promocji: " + data);
        System.out.printf("Aktualna cena produktu: %2.2f\n", product.price);
    }
}
