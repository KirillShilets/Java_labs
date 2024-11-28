package Entity;

public class Chair extends Furniture {
    private boolean adjustingBackrest;

    public Chair(double price, String material, String manufacturer, boolean adjustingBackrest) {
        super(price, material, manufacturer);
        this.adjustingBackrest = adjustingBackrest;
    }

    public boolean isAdjustingBackrest() {
        return adjustingBackrest;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "price=" + getPrice() +
                ", material=" + getMaterial() +
                ", manufacturer=" + getManufacturer() +
                ", adjustingBackrest=" + adjustingBackrest +
                '}';
    }
}
