package com.tw.basics;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JsonSerializer {

  public String serialize(JsonObject[] object) {
    String items = Stream.of(object)
        .map(this::serialize)
        .collect(Collectors.joining(","));

    return String.format("[%s]", items);
  }

  public String serialize(JsonObject object) {
    String value = object.getValue();
    if ("date".equals(object.getName())) {
      value = formatDate(value);
    }
    return String.format("{%s:%s}", wrapString(object.getName()), wrapString(value));
  }

  private String formatDate(String date) {
    return date.replaceAll("/", "-");
  }

  private String wrapString(String value) {
    return "\"" + value + "\"";
  }
}
