package gtshop.service;

import gtshop.model.PurchaseRecord;
import gtshop.model.UserProfile;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserProfile user;
    private final List<PurchaseRecord> history = new ArrayList<>();
    @Override public UserProfile getUser() { return user; }
    @Override public void createUser(UserProfile user) { this.user = user; }
    @Override public List<PurchaseRecord> getHistory() { return new ArrayList<>(history); }
    @Override public void addPurchase(PurchaseRecord record) { history.add(record); }
}
