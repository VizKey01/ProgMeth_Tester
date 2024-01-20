package Q1.logic;

public class Item {
    private String name;
    private int pricePerPiece;

    public Item(String name, int pricePerPiece) {
        this.name = name;
        setPricePerPiece(pricePerPiece);
    }

    public void setPricePerPiece(int pricePerPiece) {
        this.pricePerPiece = Math.max(pricePerPiece, 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPricePerPiece() {
        return pricePerPiece;
    }
}
