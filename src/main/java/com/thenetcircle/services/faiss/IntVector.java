/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.thenetcircle.services.faiss;

public class IntVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IntVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_IntVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntVector() {
    this(swigfaissJNI.new_IntVector(), true);
  }

  public void push_back(int arg0) {
    swigfaissJNI.IntVector_push_back(swigCPtr, this, arg0);
  }

  public void clear() {
    swigfaissJNI.IntVector_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_int data() {
    long cPtr = swigfaissJNI.IntVector_data(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public long size() {
    return swigfaissJNI.IntVector_size(swigCPtr, this);
  }

  public int at(long n) {
    return swigfaissJNI.IntVector_at(swigCPtr, this, n);
  }

  public void resize(long n) {
    swigfaissJNI.IntVector_resize(swigCPtr, this, n);
  }

  public void swap(IntVector other) {
    swigfaissJNI.IntVector_swap(swigCPtr, this, IntVector.getCPtr(other), other);
  }

}
