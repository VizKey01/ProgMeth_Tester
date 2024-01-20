package Q1.logic;

public class OrderItem {
    private Item item;
    private int itemAmount;

    public  OrderItem(Item item, int itemAmount) {
        this.item = item;
        this.itemAmount = itemAmount;
    }

    public void increaseItemAmount(int amount) {
        if(amount >= 0) {
             itemAmount += amount;
        }
    }

    public int calculateTotalPrice() {
        return item.getPricePerPiece() * itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = Math.max(itemAmount, 0);
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getItemAmount() {
        return Math.max(itemAmount, 0);
    }
}
