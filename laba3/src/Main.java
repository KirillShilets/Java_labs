import Entity.Chair;
import Entity.Furniture;
import Entity.Table;
import Entity.Wardrobe;

public class Main {
    public static void main(String[] args) {
        Furniture furniture = new Furniture(149.99, "Wood", "BrestOAO");
        System.out.println(furniture.toString());

        Wardrobe wardrobe = new Wardrobe(99.99, "Metal", "MinskOAO", 20.00, 30.50, 120.00);
        System.out.println(wardrobe.toString());

        Table table = new Table(12.99,"Glass", "GrodnoOAO", 2, 80.00);
        System.out.println(table.toString());

        Chair chair = new Chair(25.49, "Wood", "KSK", false);
        System.out.println(chair.toString());
    }
}
