/**
 * COPYRIGHT (C) 2014-2019 WEN YU (YUWEN_66@YAHOO.COM) ALL RIGHTS RESERVED.
 * <p>
 * This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * <p>
 * Any modifications to this file must keep this entire header intact.
 * <p>
 * Change History - most recent changes go on top of previous changes
 * <p>
 * DuckyTag.java
 * <p>
 * Who   Date       Description ====  =======    ============================================================
 * WY    02Jul2015  Initial creation
 */

package com.icafe4j.image.meta.jpeg;

import java.util.HashMap;
import java.util.Map;

public enum DuckyTag {
  //
  QUALITY(1, "Quality"),
  COMMENT(2, "Comment"),
  COPYRIGHT(3, "Copyright"),

  UNKNOWN(999, "Unknown");

  private static final Map<Integer, DuckyTag> recordMap = new HashMap<>();

  static {
    for (DuckyTag record : values()) {
      recordMap.put(record.getTag(), record);
    }
  }

  private final int tag;
  private final String name;

  DuckyTag(int tag, String name) {
    this.tag = tag;
    this.name = name;
  }

  public static DuckyTag fromTag(int value) {
    DuckyTag record = recordMap.get(value);
    if (record == null) {
      return UNKNOWN;
    }
    return record;
  }

  public String getName() {
    return name;
  }

  public int getTag() {
    return tag;
  }

  @Override
  public String toString() {
    return name;
  }
}