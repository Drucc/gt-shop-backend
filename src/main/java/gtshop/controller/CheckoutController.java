package gtshop.controller;

import gtshop.model.CheckoutRequest;
import gtshop.model.CheckoutResponse;
import gtshop.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {
    private final CheckoutService checkoutService;
    public CheckoutController(CheckoutService checkoutService) { this.checkoutService = checkoutService; }
    @PostMapping public CheckoutResponse checkout(@RequestBody CheckoutRequest req) { return checkoutService.checkout(req.getItems()); }
}
