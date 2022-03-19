package com.icafe4j.util;// Temporarily put in this package

/**
 * Basic node stored in a linked list
 *
 * @author Mark Allen Weiss
 */
class ListNode<E> {

  // Friendly data; accessible by other package routines
  final E element;
  ListNode<E> next;

  // Constructors
  ListNode(E theElement) {
    this(theElement, null);
  }
  ListNode(E theElement, ListNode<E> n) {
    element = theElement;
    next = n;
  }
}