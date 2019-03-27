/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.thenetcircle.services.faiss;

public class IndexIVFPQR extends IndexIVFPQ {
  private transient long swigCPtr;

  protected IndexIVFPQR(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.IndexIVFPQR_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexIVFPQR obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_IndexIVFPQR(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setRefine_pq(ProductQuantizer value) {
    swigfaissJNI.IndexIVFPQR_refine_pq_set(swigCPtr, this, ProductQuantizer.getCPtr(value), value);
  }

  public ProductQuantizer getRefine_pq() {
    long cPtr = swigfaissJNI.IndexIVFPQR_refine_pq_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ProductQuantizer(cPtr, false);
  }

  public void setRefine_codes(ByteVector value) {
    swigfaissJNI.IndexIVFPQR_refine_codes_set(swigCPtr, this, ByteVector.getCPtr(value), value);
  }

  public ByteVector getRefine_codes() {
    long cPtr = swigfaissJNI.IndexIVFPQR_refine_codes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ByteVector(cPtr, false);
  }

  public void setK_factor(float value) {
    swigfaissJNI.IndexIVFPQR_k_factor_set(swigCPtr, this, value);
  }

  public float getK_factor() {
    return swigfaissJNI.IndexIVFPQR_k_factor_get(swigCPtr, this);
  }

  public IndexIVFPQR(Index quantizer, long d, long nlist, long M, long nbits_per_idx, long M_refine, long nbits_per_idx_refine) {
    this(swigfaissJNI.new_IndexIVFPQR__SWIG_0(Index.getCPtr(quantizer), quantizer, d, nlist, M, nbits_per_idx, M_refine, nbits_per_idx_refine), true);
  }

  public void reset() {
    swigfaissJNI.IndexIVFPQR_reset(swigCPtr, this);
  }

  public int remove_ids(IDSelector sel) {
    return swigfaissJNI.IndexIVFPQR_remove_ids(swigCPtr, this, IDSelector.getCPtr(sel), sel);
  }

  public void train_residual(int n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexIVFPQR_train_residual(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void add_with_ids(int n, SWIGTYPE_p_float x, SWIGTYPE_p_long xids) {
    swigfaissJNI.IndexIVFPQR_add_with_ids(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_long.getCPtr(xids));
  }

  public void add_core(int n, SWIGTYPE_p_float x, SWIGTYPE_p_long xids, SWIGTYPE_p_long precomputed_idx) {
    swigfaissJNI.IndexIVFPQR_add_core__SWIG_0(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_long.getCPtr(xids), SWIGTYPE_p_long.getCPtr(precomputed_idx));
  }

  public void add_core(int n, SWIGTYPE_p_float x, SWIGTYPE_p_long xids) {
    swigfaissJNI.IndexIVFPQR_add_core__SWIG_1(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_long.getCPtr(xids));
  }

  public void reconstruct_from_offset(int list_no, int offset, SWIGTYPE_p_float recons) {
    swigfaissJNI.IndexIVFPQR_reconstruct_from_offset(swigCPtr, this, list_no, offset, SWIGTYPE_p_float.getCPtr(recons));
  }

  public void merge_from(IndexIVF other, int add_id) {
    swigfaissJNI.IndexIVFPQR_merge_from(swigCPtr, this, IndexIVF.getCPtr(other), other, add_id);
  }

  public void search_preassigned(int n, SWIGTYPE_p_float x, int k, SWIGTYPE_p_long assign, SWIGTYPE_p_float centroid_dis, SWIGTYPE_p_float distances, SWIGTYPE_p_long labels, boolean store_pairs, IVFSearchParameters params) {
    swigfaissJNI.IndexIVFPQR_search_preassigned__SWIG_0(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), k, SWIGTYPE_p_long.getCPtr(assign), SWIGTYPE_p_float.getCPtr(centroid_dis), SWIGTYPE_p_float.getCPtr(distances), SWIGTYPE_p_long.getCPtr(labels), store_pairs, IVFSearchParameters.getCPtr(params), params);
  }

  public void search_preassigned(int n, SWIGTYPE_p_float x, int k, SWIGTYPE_p_long assign, SWIGTYPE_p_float centroid_dis, SWIGTYPE_p_float distances, SWIGTYPE_p_long labels, boolean store_pairs) {
    swigfaissJNI.IndexIVFPQR_search_preassigned__SWIG_1(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), k, SWIGTYPE_p_long.getCPtr(assign), SWIGTYPE_p_float.getCPtr(centroid_dis), SWIGTYPE_p_float.getCPtr(distances), SWIGTYPE_p_long.getCPtr(labels), store_pairs);
  }

  public IndexIVFPQR() {
    this(swigfaissJNI.new_IndexIVFPQR__SWIG_1(), true);
  }

}
