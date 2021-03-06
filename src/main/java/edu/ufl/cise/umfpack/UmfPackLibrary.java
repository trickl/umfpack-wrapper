package edu.ufl.cise.umfpack;

import com.ochafik.lang.jnaerator.runtime.LibraryExtractor;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import java.nio.DoubleBuffer;

/**
 * JNA Wrapper for library <b>UmfPack</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public interface UmfPackLibrary extends Library {
   
   public static final String JNA_LIBRARY_NAME = LibraryExtractor.getLibraryPath("umfpack", true, UmfPackLibrary.class);
   public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(UmfPackLibrary.JNA_LIBRARY_NAME, com.ochafik.lang.jnaerator.runtime.MangledFunctionMapper.DEFAULT_OPTIONS);
   public static final UmfPackLibrary INSTANCE = (UmfPackLibrary) Native.loadLibrary(UmfPackLibrary.JNA_LIBRARY_NAME, UmfPackLibrary.class, com.ochafik.lang.jnaerator.runtime.MangledFunctionMapper.DEFAULT_OPTIONS);

   /**
    * Original signature : <code>int umfpack_di_symbolic(int, int, const int[], const int[], const double[], void**, const double[UMFPACK_CONTROL], double[UMFPACK_INFO])</code><br>
    * <i>native declaration : umfpack_symbolic.h:11</i>
    */
   int umfpack_di_symbolic(int n_row, int n_col, int Ap[], int Ai[], double Ax[], PointerByReference Symbolic, double Control[], DoubleBuffer Info);

   /**
    * Original signature : <code>int umfpack_zi_symbolic(int, int, const int[], const int[], const double[], const double[], void**, const double[UMFPACK_CONTROL], double[UMFPACK_INFO])</code><br>
    * <i>native declaration : umfpack_symbolic.h:35</i>
    */
   int umfpack_zi_symbolic(int n_row, int n_col, int Ap[], int Ai[], double Ax[], double Az[], PointerByReference Symbolic, double Control[], DoubleBuffer Info);

   /**
    * Original signature : <code>void umfpack_di_free_symbolic(void**)</code><br>
    * <i>native declaration : umfpack_free_symbolic.h:11</i>
    */
   void umfpack_di_free_symbolic(PointerByReference Symbolic);

   /**
    * Original signature : <code>void umfpack_zi_free_symbolic(void**)</code><br>
    * <i>native declaration : umfpack_free_symbolic.h:21</i>
    */
   void umfpack_zi_free_symbolic(PointerByReference Symbolic);

   /**
    * Original signature : <code>int umfpack_di_numeric(const int[], const int[], const double[], void*, void**, const double[UMFPACK_CONTROL], double[UMFPACK_INFO])</code><br>
    * <i>native declaration : umfpack_numeric.h:11</i>
    */
   int umfpack_di_numeric(int Ap[], int Ai[], double Ax[], Pointer Symbolic, PointerByReference Numeric, double Control[], DoubleBuffer Info);

   /**
    * Original signature : <code>int umfpack_zi_numeric(const int[], const int[], const double[], const double[], void*, void**, const double[UMFPACK_CONTROL], double[UMFPACK_INFO])</code><br>
    * <i>native declaration : umfpack_numeric.h:33</i>
    */
   int umfpack_zi_numeric(int Ap[], int Ai[], double Ax[], double Az[], Pointer Symbolic, PointerByReference Numeric, double Control[], DoubleBuffer Info);

   /**
    * Original signature : <code>void umfpack_di_free_numeric(void**)</code><br>
    * <i>native declaration : umfpack_free_numeric.h:11</i>
    */
   void umfpack_di_free_numeric(PointerByReference Numeric);

   /**
    * Original signature : <code>void umfpack_zi_free_numeric(void**)</code><br>
    * <i>native declaration : umfpack_free_numeric.h:21</i>
    */
   void umfpack_zi_free_numeric(PointerByReference Numeric);

   /**
    * Original signature : <code>int umfpack_di_solve(int, const int[], const int[], const double[], double[], const double[], void*, const double[UMFPACK_CONTROL], double[UMFPACK_INFO])</code><br>
    * <i>native declaration : umfpack_solve.h:11</i>
    */
   int umfpack_di_solve(int sys, int Ap[], int Ai[], double Ax[], DoubleBuffer X, double B[], Pointer Numeric, double Control[], DoubleBuffer Info);

   /**
    * <i>native declaration : umfpack_solve.h:24</i><br>
    * Conversion Error : UF_long
    */
   /**
    * Original signature : <code>int umfpack_zi_solve(int, const int[], const int[], const double[], const double[], double[], double[], const double[], const double[], void*, const double[UMFPACK_CONTROL], double[UMFPACK_INFO])</code><br>
    * <i>native declaration : umfpack_solve.h:37</i>
    */
   int umfpack_zi_solve(int sys, int Ap[], int Ai[], double Ax[], double Az[], DoubleBuffer Xx, DoubleBuffer Xz, double Bx[], double Bz[], Pointer Numeric, double Control[], DoubleBuffer Info);
   /**
    * <i>native declaration : umfpack_solve.h:50</i><br>
    * Conversion Error : UF_long
    */
}
