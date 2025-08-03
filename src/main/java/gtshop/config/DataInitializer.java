package gtshop.config;

import gtshop.model.Reward;
import gtshop.model.UserProfile;
import gtshop.service.RewardService;
import gtshop.service.UserService;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
public class DataInitializer {
    private final RewardService rewardService;
    private final UserService userService;

    public DataInitializer(RewardService rewardService, UserService userService) {
        this.rewardService = rewardService;
        this.userService = userService;
    }

    @PostConstruct
    public void init() {
        rewardService.saveAll(Arrays.asList(
            new Reward("rew-001","Tricou GT","Tricou bumbac cu logo GT","Tricou oficial Generația Tech, 100% bumbac.",300,"https://example.com/tricou.png","Merch",true,50),
            new Reward("rew-002","Căști Wireless","Căști sport fără fir","Căști Bluetooth, autonomie 8h.",500,"https://example.com/casti.png","Electro",true,30)
        ));
        userService.createUser(new UserProfile("user-123","Popescu Ion","https://example.com/avatar.png",2056));
    }
}
