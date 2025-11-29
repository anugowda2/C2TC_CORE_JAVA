package com.tnsif.anushreev.shoppingcs;

public abstract class NormalAcc extends ShopAcc {

    protected Float deliveryCharges = null;

    public NormalAcc(int accNo, String accNm, float charges, Float deliveryCharges) {
        super(accNo, accNm, charges);

        if (deliveryCharges != null && deliveryCharges > 0) {
            this.deliveryCharges = deliveryCharges;
        }
    }

    protected void initDeliveryIfNeeded(float defaultDelivery) {
        if (deliveryCharges == null) {
            deliveryCharges = defaultDelivery;
        }
    }

    public float getDeliveryCharges() {
        return (deliveryCharges == null) ? 0.0f : deliveryCharges;
    }

    @Override
    public abstract void bookProduct(float price);

    @Override
    public String toString() {
        return super.toString() + ", NormalAcc[deliveryCharge=" + getDeliveryCharges() + "]";
    }
}