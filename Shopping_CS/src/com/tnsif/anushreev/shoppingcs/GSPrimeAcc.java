package com.tnsif.anushreev.shoppingcs;

public class GSPrimeAcc extends PrimeAcc {

    public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges, isPrime);
    }

    @Override
    public void bookProduct(float price) {
        if (price <= 0) {
            System.out.println("Invalid product price: " + price);
            return;
        }

        float payable = price + DELIVERY_CHARGE + this.charges;

        System.out.println("GSPrimeAcc: Booking product for account " + getAccNo()
                + ". Price: " + price + ", Delivery: " + DELIVERY_CHARGE
                + ", BaseCharges: " + this.charges + ". Total payable: " + payable);
    }

    @Override
    public String toString() {
        return "GSPrimeAcc -> " + super.toString();
    }
}