/**
 * COPYRIGHT (C) 2014-2019 WEN YU (YUWEN_66@YAHOO.COM) ALL RIGHTS RESERVED.
 * <p>
 * This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * <p>
 * Any modifications to this file must keep this entire header intact.
 */

package com.icafe4j.image.meta.iptc;

public interface IPTCTag {

  int MAX_STRING_REPR_LEN = 10;

  int getRecordNumber();

  int getTag();

  String getName();

  boolean allowMultiple();

  String getDataAsString(byte[] data);
}