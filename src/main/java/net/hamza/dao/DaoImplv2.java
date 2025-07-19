package net.hamza.dao;

import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImplv2 implements Idao {
    @Override
    public double getPrice(String itemName) {
        System.out.println("Version electronic");
        return switch (itemName) {
            case "IPHONE" -> 10000;
            case "SUMSANG" -> 2900;
            case "NOKIA" -> 4000;
            default -> 0.0; // Return 0.0 for unknown items
        };
    }
}
