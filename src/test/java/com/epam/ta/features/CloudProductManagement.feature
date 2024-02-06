Feature: Final Cloud Product Calculation
  Background: Open CP Calculator Page
    Given I open calculator legacy page
    Then I validate that page navigates to "Legal Calculator"

@RegularTest
Scenario Outline: Compute Engine Product Calculation
Given I select "Compute Engine" program
And I enter Operating System as <OperatingSystem>
And I enter Provisioning Model parameters as <ProvisioningModel>
And I enter Number Of Instances as <NumberOfInstances>
And I enter Series as <Series>
And I enter Machine Type as <MachineType>
And I enter Gpu Type as <GpuType>
And I enter Number Of Gpu as <NumberOfGpu>
And I enter Local Ssd as <LocalSsd>
And I enter Datacenter Location as <DatacenterLocation>
And I enter Committed Usage as <CommittedUsage>
And I click "Estimate" button
Then Estimated price is <EstimatedAmount>
Examples:
|OperatingSystem     |ProvisioningModel|NumberOfInstances|Series|MachineType  |GpuType        |NumberOfGpu|LocalSsd|DatacenterLocation      |CommittedUsage|EstimatedAmount|
|Free: Debian, CentOS|Regular          |4                |N1    |n1-standard-8|NVIDIA Tesla T4|1          |2x375 GB|Frankfurt (europe-west3)|1 Year        |1,840.40 / mo  |
