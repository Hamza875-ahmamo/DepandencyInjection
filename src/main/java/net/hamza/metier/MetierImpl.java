package net.hamza.metier;

import net.hamza.dao.Idao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements Imetier {
    Idao idao;
    public MetierImpl( @Qualifier("dao2") Idao idao) {
        this.idao = idao;
    }
    @Override
    public double discountedPrice(String product, int quantity) {
       return switch (product) {
            case "Jean" -> idao.getPrice(product) * quantity * 0.9; // 10% discount
            case "chemise" -> idao.getPrice(product) * quantity * 0.85; // 15% discount
            case "jacket" -> idao.getPrice(product) * quantity * 0.8; // 20% discount
            default -> idao.getPrice(product) * quantity; // No discount for unknown items
        };
    }

    public void setIdao(Idao idao) {
        this.idao = idao;
    }
}
