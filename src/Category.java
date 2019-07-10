public class Category {
    String name;
    String description;

    Category(String n, String des){
        name = n;
        description = des;
    }

    void categoryInfo(){
        System.out.println("Kategoria produktu: " + name + ". " + description);
    }
}
