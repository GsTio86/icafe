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
import java.io.InputStream;

/**
 * @author Wen Yu, yuwen_66@yahoo.com
 * @version 1.0 12/27/2012
 */
public interface ReadStrategy {

  //
  int readInt(byte[] buf, int start_idx);

  int readInt(InputStream is) throws IOException;

  long readLong(byte[] buf, int start_idx);

  long readLong(InputStream is) throws IOException;

  float readS15Fixed16Number(byte[] buf, int start_idx);

  float readS15Fixed16Number(InputStream is) throws IOException;

  short readShort(byte[] buf, int start_idx);

  short readShort(InputStream is) throws IOException;

  float readU16Fixed16Number(byte[] buf, int start_idx);

  float readU16Fixed16Number(InputStream is) throws IOException;

  float readU8Fixed8Number(byte[] buf, int start_idx);

  float readU8Fixed8Number(InputStream is) throws IOException;

  long readUnsignedInt(byte[] buf, int start_idx);

  long readUnsignedInt(InputStream is) throws IOException;

  int readUnsignedShort(byte[] buf, int start_idx);

  int readUnsignedShort(InputStream is) throws IOException;
}