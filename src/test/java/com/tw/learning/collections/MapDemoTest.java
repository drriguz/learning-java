package com.tw.learning.collections;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MapDemoTest {
  private MapDemo mapDemo = new MapDemo();

  @Test
  void should_return_true_if_map_contains_key_of_red() {
    Map<String, Integer> colorMap = new HashMap<String, Integer>(){{
      put("Red", 1);
      put("Green", 2);
      put("Black", 3);
      put("White", 4);
    }};
    String keyName = "Red";

    assertTrue(mapDemo.isContainKey(colorMap, keyName));
  }

  @Test
  void should_return_true_if_map_contains_value_of_red() {
    Map<Integer, String> colorMap = new HashMap<Integer, String>(){{
      put(1, "Red");
      put(2, "Green");
      put(3, "Black");
      put(4, "White");
    }};
    String valueName = "Red";

    assertTrue(mapDemo.isContainValue(colorMap, valueName));
  }

  @Test
  void should_return_keyset_value_of_map() {
    Map<Integer, String> colorMap = new HashMap<Integer, String>(){{
      put(1, "Red");
      put(2, "Green");
      put(3, "Black");
      put(4, "Orange");
      put(5, "White");
    }};

    Set<Integer> expectedKeySet = new HashSet<>(Arrays.asList(1,2,3,4,5));

    assertEquals(expectedKeySet, mapDemo.getKeySetOfMap(colorMap));
  }
}