package gtshop.service;

import gtshop.model.Reward;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class RewardServiceImpl implements RewardService {
    private final List<Reward> rewards = new ArrayList<>();
    @Override public List<Reward> getAllRewards() { return new ArrayList<>(rewards); }
    @Override public void saveAll(List<Reward> rewards) { this.rewards.clear(); this.rewards.addAll(rewards); }
}
