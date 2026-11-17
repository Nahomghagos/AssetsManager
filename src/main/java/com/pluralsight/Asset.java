package com.pluralsight;

import java.math.BigDecimal;

public class AssetManager {

private String description;
private String dataAcquired;
private BigDecimal originalCost;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDataAcquired() {
        return dataAcquired;
    }

    public void setDataAcquired(String dataAcquired) {
        this.dataAcquired = dataAcquired;
    }

    public BigDecimal getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(BigDecimal originalCost) {
        this.originalCost = originalCost;
    }

    public AssetManager(String description, String dataAcquired, BigDecimal originalCost) {
        this.description = description;
        this.dataAcquired = dataAcquired;
        this.originalCost = originalCost;
    }
    private BigDecimal getValue () {
        return
    }




}
