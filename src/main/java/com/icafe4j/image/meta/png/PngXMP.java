/**
 * COPYRIGHT (C) 2014-2019 WEN YU (YUWEN_66@YAHOO.COM) ALL RIGHTS RESERVED.
 * <p>
 * This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * <p>
 * Any modifications to this file must keep this entire header intact.
 */

package com.icafe4j.image.meta.png;

import com.icafe4j.image.meta.xmp.XMP;
import java.io.OutputStream;

public class PngXMP extends XMP {

  public PngXMP(String xmp) {
    super(xmp);
    // TODO Auto-generated constructor stub
  }

  public void write(OutputStream os) {
    // TODO: add code to write XMP to PNG image
    throw new UnsupportedOperationException("PngXMP.write() is not implemented.");
  }
}