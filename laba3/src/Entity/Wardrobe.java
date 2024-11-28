package Entity;

public class Wardrobe extends Furniture {
    private double width;
    private double length;
    private double height;

    public Wardrobe(double price, String material, String manufacturer, double width, double length, double height) {
        super(price, material, manufacturer);
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "price=" + getPrice() +
                ", material=" + getMaterial() +
                ", manufacturer=" + getManufacturer() +
                ", width=" + getWidth() +
                ", length=" + getLength() +
                ", height=" + getHeight() +
                '}';
    }
}
