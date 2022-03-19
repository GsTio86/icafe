package com.icafe4j.test;

import com.icafe4j.image.meta.Metadata;
import com.icafe4j.image.meta.MetadataEntry;
import com.icafe4j.image.meta.icc.ICCProfile;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;

public class TestICCProfile extends TestBase {

  public static void main(String[] args) throws IOException {
    new TestICCProfile().test(args);
  }

  public void test(String... args) throws IOException {
    FileInputStream fin = new FileInputStream(args[0]);
    Metadata icc_profile = new ICCProfile(fin);
    for (MetadataEntry item : icc_profile) {
      logger.info(item.getKey() + ": " + item.getValue());
      if (item.isMetadataEntryGroup()) {
        String indent = "    ";
        Collection<MetadataEntry> entries = item.getMetadataEntries();
        for (MetadataEntry e : entries) {
          logger.info(indent + e.getKey() + ": " + e.getValue());
        }
      }
    }
    FileOutputStream fout = new FileOutputStream("ICCProfile.icc");
    icc_profile.write(fout);
    fin.close();
    fout.close();
  }
}