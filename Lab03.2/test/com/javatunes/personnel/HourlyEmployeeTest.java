package com.javatunes.personnel;

import static org.junit.Assert.*;

import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class HourlyEmployeeTest {

  private HourlyEmployee emp;

  @Before
  public void setup() {
    emp = new HourlyEmployee("Omar", new Date(120, 2, 15), 25.0, 40.0);

  }

  @Test
  public void testPay() {
   assertEquals(1000, emp.pay(), 0.001);
  }

  @Test
  public void testPayTaxes() {
   /* double expected = 250;
    double actual = emp.payTaxes();
    assertEquals(expected, actual, 0.001); */
    assertEquals(250, emp.payTaxes(), 0.001);
  }
}