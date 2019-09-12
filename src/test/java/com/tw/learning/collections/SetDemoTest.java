package com.tw.learning.collections;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SetDemoTest {
  private SetDemo setDemo = new SetDemo();

  @Test
  void should_convert_set_to_array_list() {
    Set<String> ageSet = new HashSet<>(Arrays.asList("12", "34", "25"));
    List<String> ageList = new ArrayList<>(Arrays.asList("12", "34", "25"));

    assertEquals(ageList, setDemo.convertToList(ageSet));
  }

  @Test
  void should_retain_elements_which_are_same_on_both_set() {
    Set<String> ageSet = new HashSet<>(Arrays.asList("12", "34", "25"));
    Set<String> ageOlderSet = new HashSet<>(Arrays.asList("34", "25", "54"));

    Set<String> expectedSet = new HashSet<>(Arrays.asList("34", "25"));

    assertEquals(expectedSet, setDemo.retainTwoSets(ageSet, ageOlderSet));
  }

  @Test
  void should_clear_set() {
    Set<String> ageSet = new HashSet<>(Arrays.asList("12", "34", "25"));

    Set<String> expectedSet = new HashSet<>();

    assertEquals(expectedSet, setDemo.clearSet(ageSet));
  }

  @Test
  void should_convert_list_to_set() {
    List<String> ageList = new ArrayList<>(Arrays.asList("12", "34", "25", "34"));
    Set<String> ageSet = new HashSet<>(Arrays.asList("12", "34", "25"));

    assertEquals(ageSet, setDemo.convertListToSet(ageList));
  }
}