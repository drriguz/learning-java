package com.tw.basics;

public class NumberConverter {

  public int convert(String number) {
    return Integer.parseInt(number);
  }

  public String convertToString(Number number) {
    String value = number.toString();
    String suffix = "";
    if (number instanceof Long) {
      suffix = "L";
    }
    if (number instanceof Double) {
      suffix = "d";
    }
    return value + suffix;
  }
}
