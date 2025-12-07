package com.tnsif.GoShopping.framework;

public abstract class PrimeAcc extends ShopAcc {

    private boolean isPrime;
    protected static final float DELIVERY_CHARGE = 0.0f;

    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges);
        this.isPrime = isPrime;
    }

    public boolean isPrime() {
        return isPrime;
    }

    @Override
    public abstract void bookProduct(float price);

    @Override
    public String toString() {
        return super.toString() +
                ", PrimeAcc[isPrime=" + isPrime + ", deliveryCharge=" + DELIVERY_CHARGE + "]";
    }
}