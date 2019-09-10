package com.tw.learning.objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistributorTest {
  @Test
  void should_return_toyota_introduction_when_introduce_given_car_is_toyota() {
    Car car = new Car("Toyota", "suv", 200000);
    Distributor distributor = new Distributor();
    assertEquals("This is suv under Toyota, the price is 200000.0. Who can beat me?", distributor.introduce(car));
  }

  @Test
  void should_return_honda_introduction_when_introduce_given_car_is_honda() {
    Car car = new Car("Honda", "suv", 200000);
    Distributor distributor = new Distributor();
    assertEquals("This is suv under Honda, the price is 200000.0. I do not want to talk with you.", distributor.introduce(car));
  }
}