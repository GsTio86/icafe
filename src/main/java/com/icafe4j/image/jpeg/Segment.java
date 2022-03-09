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
 * Segment.java
 * <p>
 * Who   Date       Description ====  =========  =================================================
 * WY    16Mar2015  Changed write() to work with stand-alone segments
 */

package com.icafe4j.image.jpeg;

import com.icafe4j.io.IOUtils;
import java.io.IOException;
import java.io.OutputStream;

/**
 * JPEG segment.
 *
 * @author Wen Yu, yuwen_66@yahoo.com
 * @version 1.0 05/21/2013
 */
public class Segment {

  private final Marker marker;
  private final int length;
  private final byte[] data;

  public Segment(Marker marker, int length, byte[] data) {
    this.marker = marker;
    this.length = length;
    this.data = data;
  }

  public Marker getMarker() {
    return marker;
  }

  public int getLength() {
    return length;
  }

  public byte[] getData() {
    return data.clone();
  }

  public void write(OutputStream os) throws IOException {
    IOUtils.writeShortMM(os, marker.getValue());
    // If this is not a stand-alone segment, write the content as well
    if (length > 0) {
      IOUtils.writeShortMM(os, length);
      IOUtils.write(os, data);
    }
  }

  @Override
  public String toString() {
    return this.marker.toString();
  }
}