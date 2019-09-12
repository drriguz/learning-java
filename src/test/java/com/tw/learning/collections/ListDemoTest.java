package com.tw.learning.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListDemoTest {
  private ListDemo listDemo = new ListDemo();

  @Test
  void should_reverse_list() {
    List<String> ageList = new ArrayList<>(Arrays.asList("12", "34", "25"));

    List<String> expectedList = new ArrayList<>(Arrays.asList("25", "34", "12"));

    assertEquals(expectedList, listDemo.reverse(ageList));
  }

  @Test
  void should_update_item_of_list() {
    List<String> colorList = new ArrayList<>(Arrays.asList("Red", "Green", "Orange"));

    List<String> expectedList = new ArrayList<>(Arrays.asList("Red", "Yellow", "Orange"));

    assertEquals(expectedList, listDemo.update(colorList));
  }

  @Test
  void should_sort_item_of_list() {
    List<String> colorList = new ArrayList<>(Arrays.asList("Red", "Green", "Orange"));

    List<String> expectedList = new ArrayList<>(Arrays.asList("Green", "Orange", "Red"));

    assertEquals(expectedList, listDemo.sort(colorList));
  }

  @Test
  void should_copy_list_to_other() {
    List<String> colorList = new ArrayList<>(Arrays.asList("Red", "Green", "Orange"));
    List<String> ageList = new ArrayList<>(Arrays.asList("12", "34", "25"));

    List<String> expectedList = new ArrayList<>(Arrays.asList("12", "34", "25"));

    listDemo.copy(colorList, ageList);

    assertEquals(expectedList, colorList);
    assertEquals(expectedList, ageList);
  }
}