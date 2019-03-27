/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.thenetcircle.services.faiss;

public class HammingComputerM4 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected HammingComputerM4(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HammingComputerM4 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_HammingComputerM4(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setA(SWIGTYPE_p_uint32_t value) {
    swigfaissJNI.HammingComputerM4_a_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getA() {
    long cPtr = swigfaissJNI.HammingComputerM4_a_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint32_t(cPtr, false);
  }

  public void setN(int value) {
    swigfaissJNI.HammingComputerM4_n_set(swigCPtr, this, value);
  }

  public int getN() {
    return swigfaissJNI.HammingComputerM4_n_get(swigCPtr, this);
  }

  public HammingComputerM4() {
    this(swigfaissJNI.new_HammingComputerM4__SWIG_0(), true);
  }

  public HammingComputerM4(SWIGTYPE_p_unsigned_char a4, int code_size) {
    this(swigfaissJNI.new_HammingComputerM4__SWIG_1(SWIGTYPE_p_unsigned_char.getCPtr(a4), code_size), true);
  }

  public void set(SWIGTYPE_p_unsigned_char a4, int code_size) {
    swigfaissJNI.HammingComputerM4_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(a4), code_size);
  }

  public int hamming(SWIGTYPE_p_unsigned_char b8) {
    return swigfaissJNI.HammingComputerM4_hamming(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(b8));
  }

}
