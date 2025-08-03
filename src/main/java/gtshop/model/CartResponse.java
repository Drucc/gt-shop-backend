package gtshop.model;

import java.util.List;

public class CartResponse {
    private List<CartItem> items;
    private int totalPoints;

    public CartResponse() {}
    public List<CartItem> getItems() { return items; }
    public void setItems(List<CartItem> items) { this.items = items; }
    public int getTotalPoints() { return totalPoints; }
    public void setTotalPoints(int totalPoints) { this.totalPoints = totalPoints; }
}
