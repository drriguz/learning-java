package com.tw.learning.objects;

import static java.lang.String.format;

public class Distributor {

  private static final String Toyota_INTRODUCE_FORMAT = "This is %s under %s, the price is %s.";
  private static final String HONDA_INTRODUCE_FORMAT = "This is %s under %s, the price is %s.";
  private static final String INTRODUCE_FORMAT = "This is %s under %s, the price is %s.";

  public String introduce(Car car) {
    if (car instanceof Toyota) {
      return format(Toyota_INTRODUCE_FORMAT, car.getType(), car.getBrand(), car.getPrice());
    }

    if (car instanceof Honda) {
      return format(HONDA_INTRODUCE_FORMAT, car.getType(), car.getBrand(), car.getPrice());
    }

    return format(INTRODUCE_FORMAT, car.getType(), car.getBrand(), car.getPrice());
  }
}
