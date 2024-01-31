package com.epam.ta.service;

import com.epam.ta.cloudProductFactory.CloudProductFactory;
import com.epam.ta.cloudProductFactory.CloudProduct;

public class ComputeEngineProductBuilder {

  public static final String COMPUTE_ENGINE_AREA = "testdata.product.compute-engine";
  public static final String OPERATING_SYSTEM = "testdata.product.os";

  public static final int NUMBER_OF_INSTANCES = 4;
  public static final String PROVISIONING_MODEL = "Regular";
  public static final String SERIES = "N1";
  public static final String MACHINE_TYPE = "n1-standard-8";
  public static final String GPU_TYPE = "NVIDIA Tesla T4";
  public static final int NUMBER_OF_GPUS = 1;
  public static final String LOCAL_SSD = "2x375 GB";
  public static final String DATACENTER_LOCATION = "Frankfurt (europe-west3)";
  public static final String COMMITTED_USAGE = "1 Year";

  public static CloudProduct withAllDataFromProperty() {

    CloudProductFactory cloudProductFactory = new CloudProductFactory();
    CloudProduct testProduct =
        cloudProductFactory.createProduct(TestDataReader.getTestData(COMPUTE_ENGINE_AREA)).setProductParameters();

    return testProduct;
  }
}
