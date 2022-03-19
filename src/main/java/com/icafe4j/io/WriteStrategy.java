/**
 * COPYRIGHT (C) 2014-2019 WEN YU (YUWEN_66@YAHOO.COM) ALL RIGHTS RESERVED.
 * <p>
 * This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * <p>
 * Any modifications to this file must keep this entire header intact.
 */

package com.icafe4j.io;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Wen Yu, yuwen_66@yahoo.com
 * @version 1.0 01/29/2013
 */
public interface WriteStrategy {

  //
  void writeInt(byte[] buf, int start_idx, int value);

  void writeInt(OutputStream os, int value) throws IOException;

  void writeLong(byte[] buf, int start_idx, long value);

  void writeLong(OutputStream os, long value) throws IOException;

  void writeS15Fixed16Number(byte[] buf, int start_idx, float value) throws IOException;

  void writeS15Fixed16Number(OutputStream os, float value) throws IOException;

  void writeShort(byte[] buf, int start_idx, int value);

  void writeShort(OutputStream os, int value) throws IOException;

  void writeU16Fixed16Number(byte[] buf, int start_idx, float value) throws IOException;

  void writeU16Fixed16Number(OutputStream os, float value) throws IOException;

  void writeU8Fixed8Number(byte[] buf, int start_idx, float value) throws IOException;

  void writeU8Fixed8Number(OutputStream is, float value) throws IOException;
}