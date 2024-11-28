package Entity;

import Entity.Interface.IFurniture;

public class Furniture implements IFurniture {
    private double price;
    private String material;
    private String manufacturer;

    public Furniture(double price, String material, String manufacturer) {
        this.price = price;
        this.material = material;
        this.manufacturer = manufacturer;
    }

    public Furniture() {

    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "price=" + price +
                ", material='" + material + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
