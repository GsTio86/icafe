/**
 * COPYRIGHT (C) 2014-2019 WEN YU (YUWEN_66@YAHOO.COM) ALL RIGHTS RESERVED.
 * <p>
 * This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * <p>
 * Any modifications to this file must keep this entire header intact.
 */

package com.icafe4j.image.png;

import com.icafe4j.util.Reader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * PNG IEND chunk reader
 *
 * @author Wen Yu, yuwen_66@yahoo.com
 * @version 1.0 04/29/2013
 */
public class IENDReader implements Reader {

  // Obtain a logger instance
  private static final Logger LOGGER = LoggerFactory.getLogger(IENDReader.class);
  private final Chunk chunk;

  public IENDReader(Chunk chunk) {
    if (chunk == null) {
      throw new IllegalArgumentException("Input chunk is null");
    }

    if (chunk.getChunkType() != ChunkType.IEND) {
      throw new IllegalArgumentException("Not a valid IEND chunk.");
    }

    this.chunk = chunk;

    read();
  }

  public void read() {
    if (chunk.getData().length != 0) {
      LOGGER.warn("Warning: IEND data field is not empty!");
    }
  }
}