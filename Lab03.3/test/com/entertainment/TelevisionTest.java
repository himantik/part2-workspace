package com.entertainment;

import static org.junit.Assert.*;

import org.junit.Test;

public class TelevisionTest {

  private final Television tv1 = new Television("Samsung", 0, DisplayType.OLED);


  @Test
  public void setVolume() {
  }

  @Test
  public void testSetVolume() {

  }


  @Test
  public void changeChannel() {
  }

  @Test
  public void compareTo() {
  }

  @Test
  public void testHashCode() {
    Television tv2 = new Television("Samsung", 0, DisplayType.OLED);
    assertEquals(tv1.hashCode(), tv2, hashCode());
    Television tv3 = new Television(tv1.hashCode(), tv3.hashCode());

  }

  @Test
  public void testEquals() {
    Television tv2 = new Television("Samsung", 0, DisplayType.OLED);
    assertEquals(tv1, tv2);
    Television tv3 = new Television("Samsung", 0, DisplayType.LCD);
    assertNotEquals(tv1, tv3);

  }
}