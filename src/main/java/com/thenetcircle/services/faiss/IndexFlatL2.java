/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.thenetcircle.services.faiss;

public class IndexFlatL2 extends IndexFlat {
  private transient long swigCPtr;

  protected IndexFlatL2(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.IndexFlatL2_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexFlatL2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_IndexFlatL2(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IndexFlatL2(int d) {
    this(swigfaissJNI.new_IndexFlatL2__SWIG_0(d), true);
  }

  public IndexFlatL2() {
    this(swigfaissJNI.new_IndexFlatL2__SWIG_1(), true);
  }

}
