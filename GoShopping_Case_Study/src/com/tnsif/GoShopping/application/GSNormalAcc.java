package com.tnsif.GoShopping.application;

import com.tnsif.GoShopping.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

    private static final float DEFAULT_DELIVERY = 50.0f;

    public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges, (deliveryCharges > 0 ? deliveryCharges : null));

        if (deliveryCharges > 0) {
            this.deliveryCharges = deliveryCharges;
        }
    }

    @Override
    public void bookProduct(float price) {

        if (deliveryCharges == null) {
            initDeliveryIfNeeded(DEFAULT_DELIVERY);
            System.out.println("GSNormalAcc: Lazy deliveryCharges initialized to: " + deliveryCharges);
        }

        float payable = price + deliveryCharges + charges;

        System.out.println("GSNormalAcc: Booking Product | Account No: " + getAccNo()
                + " | Price: " + price
                + " | Base Charges: " + charges
                + " | Delivery: " + deliveryCharges
                + " | Total: " + payable);
    }

    @Override
    public String toString() {
        return "GSNormalAcc -> " + super.toString();
    }
}