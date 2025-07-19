package net.hamza.presentation;

import net.hamza.metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("net.hamza");
        Imetier metier = (Imetier) ctx.getBean("metier");
        System.out.println("le prix de iphone apres discount :  "+metier.discountedPrice("IPHONE", 1)+" DH");

    }
}
