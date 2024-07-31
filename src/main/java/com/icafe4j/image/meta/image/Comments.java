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
 * Comments.java
 * <p>
 * Who   Date       Description ====  =========  =================================================
 * WY    04Nov2015  Initial creation
 */

package com.icafe4j.image.meta.image;

import com.icafe4j.image.meta.Metadata;
import com.icafe4j.image.meta.MetadataEntry;
import com.icafe4j.image.meta.MetadataType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Comments extends Metadata {

  private final Queue<byte[]> queue;
  private final List<String> comments;

  public Comments() {
    super(MetadataType.COMMENT);
    queue = new LinkedList<>();
    comments = new ArrayList<>();
  }

  public Comments(List<String> comments) {
    super(MetadataType.COMMENT);
    queue = new LinkedList<>();
    if (comments == null) {
      throw new IllegalArgumentException("Input is null");
    }
    this.comments = comments;
  }

  public List<String> getComments() {
    ensureDataRead();
    return Collections.unmodifiableList(comments);
  }

  public void addComment(byte[] comment) {
    if (comment == null) {
      throw new IllegalArgumentException("Input is null");
    }
    queue.offer(comment);
  }

  public void addComment(String comment) {
    if (comment == null) {
      throw new IllegalArgumentException("Input is null");
    }
    comments.add(comment);
  }

  public Iterator<MetadataEntry> iterator() {
    ensureDataRead();
    List<MetadataEntry> entries = new ArrayList<>();

    for (String comment : comments) {
      entries.add(new MetadataEntry(comment, "")); // For comments, we set the value to empty string
    }

    return Collections.unmodifiableCollection(entries).iterator();
  }

  public void read() {
    if (queue.size() > 0) {
      for (byte[] comment : queue) {
        comments.add(new String(comment, StandardCharsets.UTF_8));
      }
      queue.clear();
    }
  }
}