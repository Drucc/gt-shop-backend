package gtshop.model;

import java.util.List;

public class CheckoutResponse {
    private boolean success;
    private String message;
    private int newBalance;
    private List<CartItem> purchasedItems;
    private String transactionId;

    public CheckoutResponse() {}
    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public int getNewBalance() { return newBalance; }
    public void setNewBalance(int newBalance) { this.newBalance = newBalance; }
    public List<CartItem> getPurchasedItems() { return purchasedItems; }
    public void setPurchasedItems(List<CartItem> purchasedItems) { this.purchasedItems = purchasedItems; }
    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }
}
