/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.thenetcircle.services.faiss;

public class IndexScalarQuantizer extends Index {
  private transient long swigCPtr;

  protected IndexScalarQuantizer(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.IndexScalarQuantizer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexScalarQuantizer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_IndexScalarQuantizer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setSq(ScalarQuantizer value) {
    swigfaissJNI.IndexScalarQuantizer_sq_set(swigCPtr, this, ScalarQuantizer.getCPtr(value), value);
  }

  public ScalarQuantizer getSq() {
    long cPtr = swigfaissJNI.IndexScalarQuantizer_sq_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ScalarQuantizer(cPtr, false);
  }

  public void setCodes(ByteVector value) {
    swigfaissJNI.IndexScalarQuantizer_codes_set(swigCPtr, this, ByteVector.getCPtr(value), value);
  }

  public ByteVector getCodes() {
    long cPtr = swigfaissJNI.IndexScalarQuantizer_codes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ByteVector(cPtr, false);
  }

  public void setCode_size(long value) {
    swigfaissJNI.IndexScalarQuantizer_code_size_set(swigCPtr, this, value);
  }

  public long getCode_size() {
    return swigfaissJNI.IndexScalarQuantizer_code_size_get(swigCPtr, this);
  }

  public IndexScalarQuantizer(int d, ScalarQuantizer.QuantizerType qtype, MetricType metric) {
    this(swigfaissJNI.new_IndexScalarQuantizer__SWIG_0(d, qtype.swigValue(), metric.swigValue()), true);
  }

  public IndexScalarQuantizer(int d, ScalarQuantizer.QuantizerType qtype) {
    this(swigfaissJNI.new_IndexScalarQuantizer__SWIG_1(d, qtype.swigValue()), true);
  }

  public IndexScalarQuantizer() {
    this(swigfaissJNI.new_IndexScalarQuantizer__SWIG_2(), true);
  }

  public void train(int n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexScalarQuantizer_train(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void add(int n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexScalarQuantizer_add(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void search(int n, SWIGTYPE_p_float x, int k, SWIGTYPE_p_float distances, SWIGTYPE_p_long labels) {
    swigfaissJNI.IndexScalarQuantizer_search(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), k, SWIGTYPE_p_float.getCPtr(distances), SWIGTYPE_p_long.getCPtr(labels));
  }

  public void reset() {
    swigfaissJNI.IndexScalarQuantizer_reset(swigCPtr, this);
  }

  public void reconstruct_n(int i0, int ni, SWIGTYPE_p_float recons) {
    swigfaissJNI.IndexScalarQuantizer_reconstruct_n(swigCPtr, this, i0, ni, SWIGTYPE_p_float.getCPtr(recons));
  }

  public void reconstruct(int key, SWIGTYPE_p_float recons) {
    swigfaissJNI.IndexScalarQuantizer_reconstruct(swigCPtr, this, key, SWIGTYPE_p_float.getCPtr(recons));
  }

}
