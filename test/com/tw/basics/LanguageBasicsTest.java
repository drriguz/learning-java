package com.tw.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LanguageBasicsTest {

  @Test
  void usingPrimitiveDataTypes() {
    NumberConverter converter = new NumberConverter();

    assertEquals(1024, converter.convert("1024"));
  }

  @Test
  void convertNumberToString() {
    NumberConverter converter = new NumberConverter();

    int intNumber = 111;
    long longNumber = 1012734891248712498L;
    double doubleNumber = 3.1415926d;

    assertEquals("111", converter.convertToString(intNumber));
    assertEquals("1012734891248712498L", converter.convertToString(longNumber));
    assertEquals("3.1415926d", converter.convertToString(doubleNumber));
  }

  @Test
  void serializeOneObject() {
    JsonSerializer serializer = new JsonSerializer();

    assertEquals("{\"foo\":\"bar\"}", serializer.serialize(new JsonObject("foo", "bar")));
  }

  @Test
  void serializeObjectArray() {
    JsonSerializer serializer = new JsonSerializer();

    JsonObject[] objects = {new JsonObject("name", "Riguz"),
        new JsonObject("remark", "A very nice man")};
    assertEquals("[{\"name\":\"Riguz\"},{\"remark\":\"A very nice man\"}]",
        serializer.serialize(objects));
  }

  @Test
  void reformatDateTime() {
    JsonSerializer serializer = new JsonSerializer();

    assertEquals("{\"date\":\"2019-10-11\"}",
        serializer.serialize(new JsonObject("date", "2019/10/11")));
  }
}
