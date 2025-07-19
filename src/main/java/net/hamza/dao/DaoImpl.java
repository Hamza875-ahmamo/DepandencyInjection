package net.hamza.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements Idao {

    @Override
    public double getPrice(String productName) {
        System.out.println("Version Vetementaire");
        return switch (productName) {
            case "Jean" -> 100;
            case "chemise" -> 290;
            case "jacket" -> 400;
            default -> 0.0; // Return 0.0 for unknown items
        };
    }
}


