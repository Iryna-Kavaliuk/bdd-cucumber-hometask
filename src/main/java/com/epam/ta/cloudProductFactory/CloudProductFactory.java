package com.epam.ta.cloudProductFactory;

import com.epam.ta.service.TestDataReader;

import static com.epam.ta.service.ComputeEngineProductBuilder.OPERATING_SYSTEM;

public class CloudProductFactory {

  public static CloudProduct createProduct(String type){
    switch (type) {
      case "COMPUTE ENGINE" -> {
        return new ComputeEngineProduct(TestDataReader.getTestData(OPERATING_SYSTEM));
      }
      case "GKE STANDARD" -> {
        return new GkeProduct();
      }
      case "APP ENGINE" -> {
        return new AppEngineProduct();
      }
      default -> {
        return null;
      }
    }
  }

}
