/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.thenetcircle.services.faiss;

public class ParameterSpace {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ParameterSpace(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ParameterSpace obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_ParameterSpace(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParameter_ranges(SWIGTYPE_p_std__vectorT_faiss__ParameterRange_t value) {
    swigfaissJNI.ParameterSpace_parameter_ranges_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_faiss__ParameterRange_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_faiss__ParameterRange_t getParameter_ranges() {
    long cPtr = swigfaissJNI.ParameterSpace_parameter_ranges_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_faiss__ParameterRange_t(cPtr, false);
  }

  public void setVerbose(int value) {
    swigfaissJNI.ParameterSpace_verbose_set(swigCPtr, this, value);
  }

  public int getVerbose() {
    return swigfaissJNI.ParameterSpace_verbose_get(swigCPtr, this);
  }

  public void setN_experiments(int value) {
    swigfaissJNI.ParameterSpace_n_experiments_set(swigCPtr, this, value);
  }

  public int getN_experiments() {
    return swigfaissJNI.ParameterSpace_n_experiments_get(swigCPtr, this);
  }

  public void setBatchsize(long value) {
    swigfaissJNI.ParameterSpace_batchsize_set(swigCPtr, this, value);
  }

  public long getBatchsize() {
    return swigfaissJNI.ParameterSpace_batchsize_get(swigCPtr, this);
  }

  public void setThread_over_batches(boolean value) {
    swigfaissJNI.ParameterSpace_thread_over_batches_set(swigCPtr, this, value);
  }

  public boolean getThread_over_batches() {
    return swigfaissJNI.ParameterSpace_thread_over_batches_get(swigCPtr, this);
  }

  public void setMin_test_duration(double value) {
    swigfaissJNI.ParameterSpace_min_test_duration_set(swigCPtr, this, value);
  }

  public double getMin_test_duration() {
    return swigfaissJNI.ParameterSpace_min_test_duration_get(swigCPtr, this);
  }

  public ParameterSpace() {
    this(swigfaissJNI.new_ParameterSpace(), true);
  }

  public long n_combinations() {
    return swigfaissJNI.ParameterSpace_n_combinations(swigCPtr, this);
  }

  public boolean combination_ge(long c1, long c2) {
    return swigfaissJNI.ParameterSpace_combination_ge(swigCPtr, this, c1, c2);
  }

  public String combination_name(long cno) {
    return swigfaissJNI.ParameterSpace_combination_name(swigCPtr, this, cno);
  }

  public void display() {
    swigfaissJNI.ParameterSpace_display(swigCPtr, this);
  }

  public ParameterRange add_range(String name) {
    return new ParameterRange(swigfaissJNI.ParameterSpace_add_range(swigCPtr, this, name), false);
  }

  public void initialize(Index index) {
    swigfaissJNI.ParameterSpace_initialize(swigCPtr, this, Index.getCPtr(index), index);
  }

  public void set_index_parameters(Index index, long cno) {
    swigfaissJNI.ParameterSpace_set_index_parameters__SWIG_0(swigCPtr, this, Index.getCPtr(index), index, cno);
  }

  public void set_index_parameters(Index index, String param_string) {
    swigfaissJNI.ParameterSpace_set_index_parameters__SWIG_1(swigCPtr, this, Index.getCPtr(index), index, param_string);
  }

  public void set_index_parameter(Index index, String name, double val) {
    swigfaissJNI.ParameterSpace_set_index_parameter(swigCPtr, this, Index.getCPtr(index), index, name, val);
  }

  public void update_bounds(long cno, OperatingPoint op, SWIGTYPE_p_double upper_bound_perf, SWIGTYPE_p_double lower_bound_t) {
    swigfaissJNI.ParameterSpace_update_bounds(swigCPtr, this, cno, OperatingPoint.getCPtr(op), op, SWIGTYPE_p_double.getCPtr(upper_bound_perf), SWIGTYPE_p_double.getCPtr(lower_bound_t));
  }

  public void explore(Index index, long nq, SWIGTYPE_p_float xq, AutoTuneCriterion crit, OperatingPoints ops) {
    swigfaissJNI.ParameterSpace_explore(swigCPtr, this, Index.getCPtr(index), index, nq, SWIGTYPE_p_float.getCPtr(xq), AutoTuneCriterion.getCPtr(crit), crit, OperatingPoints.getCPtr(ops), ops);
  }

}
