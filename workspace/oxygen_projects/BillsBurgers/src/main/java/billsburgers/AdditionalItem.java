package billsburgers;

public class AdditionalItem {

    private String item;
    private double price;

    public AdditionalItem(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n" + item + ", additional $" + price;
    }
}
