package com.epam.ta.page;

public interface LocatorService {
  default String buildLocatorByText(String valuePart) {
    return String.format("//div[contains(@id, 'select_container')]//div[text()[contains(.,'%s')" +
        "]]", valuePart);
  }
}
