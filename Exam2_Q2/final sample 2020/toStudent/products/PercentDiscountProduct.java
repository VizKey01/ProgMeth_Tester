package products;

import discount.PercentDiscountable;
import logic.ShopUtil;

public class PercentDiscountProduct extends BaseProduct implements PercentDiscountable {
    private double percent;

    public PercentDiscountProduct(String name, int price, double percent) {
        super(name, price);
        setPercent(percent);
    }

    public int calcDiscountPerPiece() {
        return ShopUtil.calculateDiscountUsingPercent(price, getPercent());
    }

    public int calculateDiscount(int quantity){
        return quantity * calcDiscountPerPiece();
    }

    public String toString() {
        return this.getProductName() + " (Price: " + this.getPrice() +", "+ this.getPercent() + "% Off)";
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        if(percent > 100){
            percent = 100;
        } else if (percent < 0) {
            percent = 0;
        }
        this.percent = percent;
    }
}
