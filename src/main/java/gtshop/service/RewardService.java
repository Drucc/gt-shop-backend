package gtshop.service;

import gtshop.model.Reward;
import java.util.List;

public interface RewardService {
    List<Reward> getAllRewards();
    void saveAll(List<Reward> rewards);
}
