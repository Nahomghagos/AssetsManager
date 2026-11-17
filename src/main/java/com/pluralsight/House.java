package com.pluralsight;

import java.math.BigDecimal;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private  int lotSize;

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public House (String address, int condition, int squareFoot, int lotSize,
                  String description, String dataAcquired, BigDecimal originalCost) {
        super(description,dataAcquired,originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }
    BigDecimal pricePerSquareFoot;
    @Override
    public BigDecimal getValue() {


        switch (condition) {
            case 1-> pricePerSquareFoot = new BigDecimal("180.00");
            case 2-> pricePerSquareFoot = new BigDecimal("130.00");
            case 3->pricePerSquareFoot = new BigDecimal("90.00");
            case 4->pricePerSquareFoot = new BigDecimal("80.00");
            default-> System.out.println("1-4 only");
        }

        BigDecimal houseValue = pricePerSquareFoot.multiply(new BigDecimal(squareFoot));

        BigDecimal lotValue = new BigDecimal("0.25").multiply(new BigDecimal(lotSize));

        return houseValue.add(lotValue);
    }
}



