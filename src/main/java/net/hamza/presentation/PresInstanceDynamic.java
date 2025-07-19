package net.hamza.presentation;

import net.hamza.dao.Idao;
import net.hamza.metier.Imetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresInstanceDynamic {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("config.txt"));
        String daoClassName = sc.nextLine();
        Class<?> objet= Class.forName(daoClassName);
        Idao idao = (Idao) objet.newInstance();
        String metierClassName = sc.nextLine();
        Class<?> objetMetier = Class.forName(metierClassName);
        Imetier metier = (Imetier) objetMetier.newInstance();
        Method setIdaoMethod = objetMetier.getMethod("setIdao", Idao.class);
        setIdaoMethod.invoke(metier, idao);
        System.out.println("Le prix de jacket apres le discount est : "+metier.discountedPrice("jacket", 1)+" DH");



    }
}
