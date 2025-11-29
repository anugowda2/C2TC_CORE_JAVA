package com.tnsif.anushreev.shoppingcs;

public class TestShopping {
    public static void main(String[] args) {

        ShopFactory factory = new GSShopFactory();

        System.out.println("----- PRIME ACCOUNT -----");
        PrimeAcc prime = factory.getNewPrimeAccount(301, "Pavi", 10.0f, true);
        System.out.println(prime);
        prime.items(200);
        prime.bookProduct(200);

        System.out.println("\n----- NORMAL ACCOUNT (Lazy Delivery) -----");
        NormalAcc normal = factory.getNewNormalAccount(401, "Ravi", 5.0f, 0.0f);
        System.out.println(normal);
        normal.items(150);
        normal.bookProduct(150);

        System.out.println("\n----- NORMAL ACCOUNT (Fixed Delivery) -----");
        NormalAcc normal2 = factory.getNewNormalAccount(402, "Varsha", 2.0f, 30.0f);
        System.out.println(normal2);
        normal2.bookProduct(100);

        System.out.println("\n----- FINAL STATE -----");
        System.out.println(prime);
        System.out.println(normal);
        System.out.println(normal2);
    }
}