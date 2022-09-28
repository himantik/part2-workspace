/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.billing;

/**
 * Domestic orders have a graduated tax scheme:
 *  The first $20.00 is tax-free.
 *  Amount over $20.00 is taxed at 10.0%.
 *  
 * TODO: implement this algorithm.
 */
public class USATax implements TaxCalculator {

  private static final double BASIC_RATE = 0.17;
  private static final double LUXURY_RATE = 0.25;
  private static final double LUXURY_THRESHOLD = 100;


  @Override
  public double taxAmount(double taxable) {
return BASIC_RATE * taxable
    + ((taxable > LUXURY_THRESHOLD) ? (LUXURY_RATE * (taxable - LUXURY_THRESHOLD)) :0);
    }
  }
}