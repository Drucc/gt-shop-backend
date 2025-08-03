package gtshop.controller;

import gtshop.model.UserProfile;
import gtshop.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) { this.userService = userService; }
    @GetMapping("/profile") public UserProfile getProfile() { return userService.getUser(); }
    @GetMapping("/history") public java.util.Map<String,Object> getHistory() { return java.util.Map.of("purchases", userService.getHistory()); }
}
