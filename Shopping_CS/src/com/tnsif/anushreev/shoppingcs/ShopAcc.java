package com.tnsif.anushreev.shoppingcs;

public abstract class ShopAcc {
    private int accNo;
    private String accNm;
    protected float charges;

    public ShopAcc(int accNo, String accNm, float charges) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.charges = charges;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccNm() {
        return accNm;
    }

    public void setAccNm(String accNm) {
        this.accNm = accNm;
    }

    public float getCharges() {
        return charges;
    }

    public void items(float price) {
        System.out.println("Item added with price: " + price);
    }

    public abstract void bookProduct(float price);

    @Override
    public String toString() {
        return "Account No: " + accNo + ", Name: " + accNm + ", BaseCharges: " + charges;
    }
}