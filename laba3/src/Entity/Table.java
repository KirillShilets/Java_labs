package Entity;

public class Table extends Furniture {
    private int numOfBoxes;
    private double workArea;

    public Table(double price, String material, String manufacturer, int numOfBoxes, double workArea) {
        super(price, material, manufacturer);
        this.numOfBoxes = numOfBoxes;
        this.workArea = workArea;
    }

    public int getNumOfBoxes() {
        return numOfBoxes;
    }

    public double getWorkArea() {
        return workArea;
    }

    @Override
    public String toString() {
        return "Table{" +
                "price=" + getPrice() +
                ", material=" + getMaterial() +
                ", manufacturer=" + getManufacturer() +
                ", numOfBoxes=" + getNumOfBoxes() +
                ", workArea=" + getWorkArea() +
                '}';
    }
}
