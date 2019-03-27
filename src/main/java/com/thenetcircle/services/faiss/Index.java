/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.thenetcircle.services.faiss;

public class Index {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Index(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Index obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_Index(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setD(int value) {
    swigfaissJNI.Index_d_set(swigCPtr, this, value);
  }

  public int getD() {
    return swigfaissJNI.Index_d_get(swigCPtr, this);
  }

  public void setNtotal(int value) {
    swigfaissJNI.Index_ntotal_set(swigCPtr, this, value);
  }

  public int getNtotal() {
    return swigfaissJNI.Index_ntotal_get(swigCPtr, this);
  }

  public void setVerbose(boolean value) {
    swigfaissJNI.Index_verbose_set(swigCPtr, this, value);
  }

  public boolean getVerbose() {
    return swigfaissJNI.Index_verbose_get(swigCPtr, this);
  }

  public void setIs_trained(boolean value) {
    swigfaissJNI.Index_is_trained_set(swigCPtr, this, value);
  }

  public boolean getIs_trained() {
    return swigfaissJNI.Index_is_trained_get(swigCPtr, this);
  }

  public void setMetric_type(MetricType value) {
    swigfaissJNI.Index_metric_type_set(swigCPtr, this, value.swigValue());
  }

  public MetricType getMetric_type() {
    return MetricType.swigToEnum(swigfaissJNI.Index_metric_type_get(swigCPtr, this));
  }

  public void train(int n, SWIGTYPE_p_float x) {
    swigfaissJNI.Index_train(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void add(int n, SWIGTYPE_p_float x) {
    swigfaissJNI.Index_add(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void add_with_ids(int n, SWIGTYPE_p_float x, SWIGTYPE_p_long xids) {
    swigfaissJNI.Index_add_with_ids(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_long.getCPtr(xids));
  }

  public void search(int n, SWIGTYPE_p_float x, int k, SWIGTYPE_p_float distances, SWIGTYPE_p_long labels) {
    swigfaissJNI.Index_search(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), k, SWIGTYPE_p_float.getCPtr(distances), SWIGTYPE_p_long.getCPtr(labels));
  }

  public void range_search(int n, SWIGTYPE_p_float x, float radius, RangeSearchResult result) {
    swigfaissJNI.Index_range_search(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), radius, RangeSearchResult.getCPtr(result), result);
  }

  public void assign(int n, SWIGTYPE_p_float x, SWIGTYPE_p_long labels, int k) {
    swigfaissJNI.Index_assign__SWIG_0(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_long.getCPtr(labels), k);
  }

  public void assign(int n, SWIGTYPE_p_float x, SWIGTYPE_p_long labels) {
    swigfaissJNI.Index_assign__SWIG_1(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_long.getCPtr(labels));
  }

  public void reset() {
    swigfaissJNI.Index_reset(swigCPtr, this);
  }

  public int remove_ids(IDSelector sel) {
    return swigfaissJNI.Index_remove_ids(swigCPtr, this, IDSelector.getCPtr(sel), sel);
  }

  public void reconstruct(int key, SWIGTYPE_p_float recons) {
    swigfaissJNI.Index_reconstruct(swigCPtr, this, key, SWIGTYPE_p_float.getCPtr(recons));
  }

  public void reconstruct_n(int i0, int ni, SWIGTYPE_p_float recons) {
    swigfaissJNI.Index_reconstruct_n(swigCPtr, this, i0, ni, SWIGTYPE_p_float.getCPtr(recons));
  }

  public void search_and_reconstruct(int n, SWIGTYPE_p_float x, int k, SWIGTYPE_p_float distances, SWIGTYPE_p_long labels, SWIGTYPE_p_float recons) {
    swigfaissJNI.Index_search_and_reconstruct(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), k, SWIGTYPE_p_float.getCPtr(distances), SWIGTYPE_p_long.getCPtr(labels), SWIGTYPE_p_float.getCPtr(recons));
  }

  public void compute_residual(SWIGTYPE_p_float x, SWIGTYPE_p_float residual, int key) {
    swigfaissJNI.Index_compute_residual(swigCPtr, this, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_float.getCPtr(residual), key);
  }

  public void display() {
    swigfaissJNI.Index_display(swigCPtr, this);
  }

}
