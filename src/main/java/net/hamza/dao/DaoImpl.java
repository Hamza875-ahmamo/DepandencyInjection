package net.hamza.dao;

public class DaoImpl implements Idao {

    @Override
    public double getPrice(String productName) {
        return switch (productName) {
            case "Jean" -> 100;
            case "chemise" -> 290;
            case "jacket" -> 400;
            default -> 0.0; // Return 0.0 for unknown items
        };
    }
}


