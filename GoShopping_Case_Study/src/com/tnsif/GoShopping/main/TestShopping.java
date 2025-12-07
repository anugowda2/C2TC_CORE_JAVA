package com.tnsif.GoShopping.main;

import com.tnsif.GoShopping.framework.*;
import com.tnsif.GoShopping.application.*;

public class TestShopping {

    public static void main(String[] args) {

        ShopFactory factory = new GSShopFactory();

        System.out.println("\n--- PRIME ACCOUNT ---");
        PrimeAcc prime = factory.getNewPrimeAccount(101, "Pavi", 20.0f, true);
        System.out.println(prime);
        prime.items(500);
        prime.bookProduct(500);

        System.out.println("\n--- NORMAL ACCOUNT (Lazy Delivery) ---");
        NormalAcc normal1 = factory.getNewNormalAccount(102, "Ravi", 10.0f, 0);
        System.out.println(normal1);
        normal1.items(300);
        normal1.bookProduct(300);

        System.out.println("\n--- NORMAL ACCOUNT (Fixed Delivery) ---");
        NormalAcc normal2 = factory.getNewNormalAccount(103, "Varsha", 5.0f, 40.0f);
        System.out.println(normal2);
        normal2.bookProduct(200);

        System.out.println("\n--- FINAL STATE ---");
        System.out.println(prime);
        System.out.println(normal1);
        System.out.println(normal2);
    }
}