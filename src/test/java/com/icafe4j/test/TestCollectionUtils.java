package com.icafe4j.test;

import com.icafe4j.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

public class TestCollectionUtils extends TestBase {

  public TestCollectionUtils() {
  }

  public static void main(String[] args) {
    new TestCollectionUtils().test();
  }

  public void test(String... args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("first", 1);
    map.put("second", 1);

    logger.info("{}", CollectionUtils.getKeysByValue(map, 1));
  }
}