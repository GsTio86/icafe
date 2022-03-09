package com.icafe4j.test;

import com.icafe4j.util.LangUtils;

public class InvokeMain {

  public static void main(String... args) {
    try {
      LangUtils.invokeMain(args);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}