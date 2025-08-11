package gtshop.config;

import gtshop.model.Reward;
import gtshop.model.UserProfile;
import gtshop.service.RewardService;
import gtshop.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

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
        // User demo
        userService.createUser(new UserProfile("user-123","Popescu Ion",
                "https://example.com/avatar.png",2056));

        List<Reward> rewards = Arrays.asList(
            // Haine
            new Reward("rew-tricou","Tricou GT",
                "Tricou personalizat Generația Tech din bumbac",
                "Tricou oficial Generația Tech, bumbac 100%, mărimi S–XL.",
                550,"","Haine", true, 100, false),

            // Electronice
            new Reward("rew-mouse","Mouse Logitech G305",
                "Mouse pentru birou sau gaming",
                "Mouse Logitech G305, senzor HERO, autonomie ridicată.",
                350,"","Electronice", true, 20, false),
            new Reward("rew-casti","Căști Wireless",
                "Căști bluetooth on-ear",
                "Căști wireless cu microfon, autonomie 20h.",
                800,"","Electronice", true, 25, false),

            // Cursuri
            new Reward("rew-templatecv","Template CV",
                "Primești acces la un CV template",
                "CV template editabil, design curat, secțiuni predefinite.",
                900,"","Cursuri", true, 9999, false),
            new Reward("rew-ghidgpt","Ghid ChatGPT",
                "Ghid pentru începători",
                "Ghid digital cu sfaturi și exemple practice.",
                3000,"","Cursuri", true, 9999, true),
            new Reward("rew-udemy","Subscripție Udemy 30 zile",
                "Acces 30 zile pe Udemy",
                "Acces la mii de cursuri online timp de 30 de zile.",
                2500,"","Cursuri", true, 9999, false),
            new Reward("rew-mentorat","Mentorat 1:1",
                "Mentorat 1:1 cu mentorul tău",
                "Sesiune 60 minute cu mentorul tău din track.",
                1560,"","Cursuri", true, 1000, false),
            new Reward("rew-alltracks","Acces la toate track-urile",
                "Acces 30 zile (fără teme/questuri)",
                "Acces 30 zile la toate track-urile din platformă.",
                3500,"","Cursuri", true, 1000, false),

            // Gaming
            new Reward("rew-lucky","Lucky Crate",
                "Cu acest lucky crate îți poți testa norocul",
                "Șanse: 50% Lose, 15% CV Template, 15% Ghid ChatGPT, 10% Agendă GT, 5% Mouse G305, 5% Subscripție Udemy.",
                2550,"","Gaming", true, 1000, true),

            // Accesorii
            new Reward("rew-sticker","Sticker GT",
                "Sticker personalizat Generația Tech",
                "Sticker pentru laptop/agenda/telefon.",
                180,"","Accesorii", true, 300, false),
            new Reward("rew-agenda","Agendă GT",
                "Agendă personalizată Generația Tech",
                "Agendă A5 cu hârtie 90 g/m², 160 pagini.",
                300,"","Accesorii", true, 50, false),
            new Reward("rew-badge","Badge Hero",
                "Badge afișat pe profil",
                "Badge digital „Hero” afișat pe profilul tău GT.",
                1500,"","Accesorii", true, 9999, false)
        );

        rewardService.saveAll(rewards);
        System.out.println("[DataInitializer] Seeded rewards: " + rewards.size());
    }
}
