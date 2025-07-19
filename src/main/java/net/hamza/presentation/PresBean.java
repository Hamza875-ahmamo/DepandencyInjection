package net.hamza.presentation;

import net.hamza.metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresBean {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Imetier metier = (Imetier) ctx.getBean("metier");
        System.out.println("le prix de jacket apres discount : "+metier.discountedPrice("jacket", 1)+" DH");

    }
}
