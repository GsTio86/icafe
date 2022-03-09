/**
 * COPYRIGHT (C) 2014-2019 WEN YU (YUWEN_66@YAHOO.COM) ALL RIGHTS RESERVED.
 * <p>
 * This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * <p>
 * Any modifications to this file must keep this entire header intact.
 */

package com.icafe4j.image.options;

import com.icafe4j.image.ImageType;
import com.icafe4j.image.tiff.TiffFieldEnum.Compression;
import com.icafe4j.image.tiff.TiffFieldEnum.PhotoMetric;
import com.icafe4j.image.tiff.TiffFieldEnum.ResolutionUnit;
import com.icafe4j.io.ByteOrder;

public class TIFFOptions extends ImageOptions {

  private boolean isApplyPredictor;
  private Compression tiffCompression = Compression.PACKBITS;
  private PhotoMetric photoMetric = PhotoMetric.UNKNOWN;
  private ResolutionUnit resolutionUnit = ResolutionUnit.RESUNIT_INCH;
  private ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
  private int defalteCompressionLevel = 4;
  private boolean writeICCProfile;

  private int jpegQuality = 90;
  private int xResolution = 72;
  private int yResolution = 72;

  public TIFFOptions() {
  }

  // Copy constructor
  public TIFFOptions(TIFFOptions options) {
    this.isApplyPredictor = options.isApplyPredictor;
    this.tiffCompression = options.tiffCompression;
    this.photoMetric = options.photoMetric;
    this.resolutionUnit = options.resolutionUnit;
    this.byteOrder = options.byteOrder;
    this.defalteCompressionLevel = options.defalteCompressionLevel;
    this.writeICCProfile = options.writeICCProfile;
    this.jpegQuality = options.jpegQuality;
    this.xResolution = options.xResolution;
    this.yResolution = options.yResolution;
  }

  public ByteOrder getByteOrder() {
    return byteOrder;
  }

  public void setByteOrder(ByteOrder byteOrder) {
    this.byteOrder = byteOrder;
  }

  public int getDeflateCompressionLevel() {
    return defalteCompressionLevel;
  }

  public void setDeflateCompressionLevel(int deflateCompressionLevel) {
    if (deflateCompressionLevel >= 0 && deflateCompressionLevel <= 9) {
      this.defalteCompressionLevel = deflateCompressionLevel;
    }
  }

  public ImageType getImageType() {
    return ImageType.TIFF;
  }

  public int getJPEGQuality() {
    return jpegQuality;
  }

  public void setJPEGQuality(int quality) {
    this.jpegQuality = quality;
  }

  public PhotoMetric getPhotoMetric() {
    return photoMetric;
  }

  public void setPhotoMetric(PhotoMetric photoMetric) {
    this.photoMetric = photoMetric;
  }

  public Compression getTiffCompression() {
    return tiffCompression;
  }

  public void setTiffCompression(Compression tiffCompression) {
    this.tiffCompression = tiffCompression;
  }

  public ResolutionUnit getResolutionUnit() {
    return resolutionUnit;
  }

  public void setResolutionUnit(ResolutionUnit resolutionUnit) {
    this.resolutionUnit = resolutionUnit;
  }

  public int getXResolution() {
    return xResolution;
  }

  public void setXResolution(int xResolution) {
    if (xResolution > 0) {
      this.xResolution = xResolution;
    }
  }

  public int getYResolution() {
    return yResolution;
  }

  public void setYResolution(int yResolution) {
    if (yResolution > 0) {
      this.yResolution = yResolution;
    }
  }

  public boolean isApplyPredictor() {
    return isApplyPredictor;
  }

  public void setApplyPredictor(boolean isApplyPredictor) {
    this.isApplyPredictor = isApplyPredictor;
  }

  public boolean writeICCProfile() {
    return writeICCProfile;
  }

  public void setWriteICCProfile(boolean writeICCProfile) {
    this.writeICCProfile = writeICCProfile;
  }
}