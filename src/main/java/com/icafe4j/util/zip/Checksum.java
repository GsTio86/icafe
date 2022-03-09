/**
 * COPYRIGHT (C) 2014-2019 WEN YU (YUWEN_66@YAHOO.COM) ALL RIGHTS RESERVED.
 * <p>
 * This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * <p>
 * Any modifications to this file must keep this entire header intact.
 */

package com.icafe4j.util.zip;

/**
 * Interface to be implemented by CRC32 and Adler32 etc.
 */
public interface Checksum {

  long getValue();

  void update(int b);

  void update(byte[] b, int offset, int length);

  void reset();
}