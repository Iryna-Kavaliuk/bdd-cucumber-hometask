package com.epam.ta.cloudProductFactory;

public abstract class CloudProduct {
  private String productType;

  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public CloudProduct setProductParameters() {
    return this;
  }

  public String calculateProductPrice() {
    return "";
  }
}
