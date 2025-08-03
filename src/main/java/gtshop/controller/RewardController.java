package gtshop.controller;

import gtshop.service.RewardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rewards")
public class RewardController {
    private final RewardService rewardService;
    public RewardController(RewardService rewardService) { this.rewardService = rewardService; }
    @GetMapping public java.util.Map<String,Object> getRewards() { return java.util.Map.of("rewards", rewardService.getAllRewards()); }
}
