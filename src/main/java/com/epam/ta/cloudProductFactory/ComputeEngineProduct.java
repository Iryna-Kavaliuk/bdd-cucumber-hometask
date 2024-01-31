package com.epam.ta.cloudProductFactory;

import com.epam.ta.service.TestDataReader;

import static com.epam.ta.service.ComputeEngineProductBuilder.*;

public class ComputeEngineProduct extends CloudProduct {
  private int numberOfInstances;
  private String operatingSystem;
  private String provisioningModel;
  private String series;
  private String machineType;
  private String gpuType;
  private int numberOfGPU;
  private String localSSD;
  private String dataCenterLocation;
  private String committedUsage;

  private static final String MANUALLY_GOT_ESTIMATION = "1,840.40 / mo";

  public ComputeEngineProduct(String operatingSystem) {
    super();
    this.operatingSystem = operatingSystem;
  }

  @Override
  public CloudProduct setProductParameters() {
    setProductType(TestDataReader.getTestData(COMPUTE_ENGINE_AREA));
    setOperatingSystem(TestDataReader.getTestData(OPERATING_SYSTEM));
    setNumberOfInstances(NUMBER_OF_INSTANCES);
    setProvisioningModel(PROVISIONING_MODEL);
    setSeries(SERIES);
    setMachineType(MACHINE_TYPE);
    setGpuType(GPU_TYPE);
    setNumberOfGPU(NUMBER_OF_GPUS);
    setLocalSSD(LOCAL_SSD);
    setDataCenterLocation(DATACENTER_LOCATION);
    setCommittedUsage(COMMITTED_USAGE);
    return this;
  }

  public int getNumberOfInstances() {
    return numberOfInstances;
  }

  public void setNumberOfInstances(int numberOfInstances) {
    this.numberOfInstances = numberOfInstances;
  }

  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public String getProvisioningModel() {
    return provisioningModel;
  }

  public void setProvisioningModel(String provisioningModel) {
    this.provisioningModel = provisioningModel;
  }

  public String getSeries() {
    return series;
  }

  public void setSeries(String series) {
    this.series = series;
  }

  public String getMachineType() {
    return machineType;
  }

  public void setMachineType(String machineType) {
    this.machineType = machineType;
  }

  public String getGpuType() {
    return gpuType;
  }

  public void setGpuType(String gpuType) {
    this.gpuType = gpuType;
  }

  public int getNumberOfGPU() {
    return numberOfGPU;
  }

  public void setNumberOfGPU(int numberOfGPU) {
    this.numberOfGPU = numberOfGPU;
  }

  public String getLocalSSD() {
    return localSSD;
  }

  public void setLocalSSD(String localSSD) {
    this.localSSD = localSSD;
  }

  public String getDataCenterLocation() {
    return dataCenterLocation;
  }

  public void setDataCenterLocation(String dataCenterLocation) {
    this.dataCenterLocation = dataCenterLocation;
  }

  public String getCommittedUsage() {
    return committedUsage;
  }

  public void setCommittedUsage(String committedUsage) {
    this.committedUsage = committedUsage;
  }

  public String calculateProductPrice() {
    return MANUALLY_GOT_ESTIMATION;
  }

}
