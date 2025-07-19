package net.hamza.presentation;

import net.hamza.dao.DaoImpl;
import net.hamza.dao.Idao;
import net.hamza.metier.Imetier;
import net.hamza.metier.MetierImpl;

public class PresNewInstance {
    public static void main(String[] args) {
        Idao idao=new DaoImpl();
        Imetier metier=new MetierImpl(idao);
        //((MetierImpl) metier).setIdao(idao);
        System.out.println("le prix de jacket apres le discount : "+metier.discountedPrice("jacket", 1)+"DH");
    }
}
