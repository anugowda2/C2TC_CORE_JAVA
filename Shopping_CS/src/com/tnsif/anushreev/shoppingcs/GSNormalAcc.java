package com.tnsif.anushreev.shoppingcs;

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
        if (price <= 0) {
            System.out.println("Invalid product price: " + price);
            return;
        }

        if (deliveryCharges == null) {
            initDeliveryIfNeeded(DEFAULT_DELIVERY);
            System.out.println("GSNormalAcc: Lazy-initialized delivery charges to: " + deliveryCharges);
        }

        float payable = price + deliveryCharges + charges;

        System.out.println("GSNormalAcc: Booking product for account " + getAccNo()
                + ". Price: " + price + ", Delivery: " + deliveryCharges
                + ", BaseCharges: " + charges + ". Total payable: " + payable);
    }

    @Override
    public String toString() {
        return "GSNormalAcc -> " + super.toString();
    }
}