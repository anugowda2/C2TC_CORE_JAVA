package com.tnsif.GoShopping.application;

import com.tnsif.GoShopping.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

    public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges, isPrime);
    }

    @Override
    public void bookProduct(float price) {
        float payable = price + DELIVERY_CHARGE + this.charges;

        System.out.println("GSPrimeAcc: Booking Product | Account No: " + getAccNo()
                + " | Price: " + price
                + " | Base Charges: " + this.charges
                + " | Delivery: 0"
                + " | Total: " + payable);
    }

    @Override
    public String toString() {
        return "GSPrimeAcc -> " + super.toString();
    }
}