package gtshop.controller;

import gtshop.model.CartItem;
import gtshop.model.CartResponse;
import gtshop.service.CartService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    private final CartService cartService;
    public CartController(CartService cartService) { this.cartService = cartService; }
    @PostMapping("/add") public java.util.Map<String,Object> addToCart(@RequestBody CartItem req) {
        cartService.addToCart(req);
        List<CartItem> items = cartService.getCartItems();
        int total = items.stream().mapToInt(i -> i.getPrice() * i.getQuantity()).sum();
        CartResponse resp = new CartResponse(); resp.setItems(items); resp.setTotalPoints(total);
        return java.util.Map.of("success", true, "message", "Adăugat în coș.", "cart", resp);
    }
    @GetMapping public CartResponse viewCart() {
        List<CartItem> items = cartService.getCartItems();
        int total = items.stream().mapToInt(i -> i.getPrice() * i.getQuantity()).sum();
        CartResponse resp = new CartResponse(); resp.setItems(items); resp.setTotalPoints(total);
        return resp;
    }
}
