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
 * TiffExif.java
 * <p>
 * Who   Date       Description ====  =======    =================================================
 * WY    11Feb2015  Moved showMetadata() to Exif WY    06Feb2015  Added showMetadata() WY
 * 03Feb2015  Initial creation
 */

package com.icafe4j.image.meta.tiff;

import com.icafe4j.image.meta.exif.Exif;
import com.icafe4j.image.tiff.IFD;
import java.io.OutputStream;

public class TiffExif extends Exif {

  public TiffExif() {
  }

  public TiffExif(IFD imageIFD) {
    super(imageIFD);
  }

  /**
   * Write the EXIF data to the OutputStream
   *
   * @param os OutputStream
   */
  @Override
  public void write(OutputStream os) {
    ensureDataRead();
    // We won't write anything here
  }
}