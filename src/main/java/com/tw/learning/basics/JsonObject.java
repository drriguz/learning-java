package com.tw.learning.basics;

public class JsonObject {

  private String name;
  private String value;

  public JsonObject(String name, String value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public String getValue() {
    return value;
  }
}
