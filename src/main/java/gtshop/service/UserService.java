package gtshop.service;

import gtshop.model.PurchaseRecord;
import gtshop.model.UserProfile;
import java.util.List;

public interface UserService {
    UserProfile getUser();
    void createUser(UserProfile user);
    List<PurchaseRecord> getHistory();
    void addPurchase(PurchaseRecord record);
}
