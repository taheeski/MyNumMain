package com.taha;
/**
* @author Taha Akbar
package penis;
/**
* A simple program demonstrating the use of custom number classes and interfaces.
* Author: TAHA
* Date: 09/12/2033
*/
public class MyNumMain {
  public static void main(String[] args) {
      // Creating instances of custom number classes
      MyNum a = new MyNum(60.5);
      MyWholeNum b = new MyWholeNum(70);
      MyWholeNum c = new MyWholeNum();
      MyWholePosNum d = new MyWholePosNum(-6);
      // Adding numbers
      MyNum sum1 = a.add(b);
      MyNum sum2 = d.add(c);
      // Printing the results
      System.out.println(sum1);
      System.out.println(sum2);
  }
}
/**
* Interface for basic arithmetic operations.
*/
interface Operand {
  /**
   * Adds the given number to this number.
   *
   * @param num The number to be added.
   * @return The result of the addition.
   */
  public MyNum add(MyNum num);
  /**
   * Subtracts the given number from this number.
   *
   * @param num The number to be subtracted.
   * @return The result of the subtraction.
   */
  public MyNum subtract(MyNum num);
  /**
   * Multiplies this number by the given number.
   *
   * @param num The number to be multiplied by.
   * @return The result of the multiplication.
   */
  public MyNum multiply(MyNum num);
  /**
   * Divides this number by the given number.
   *
   * @param num The number to divide by.
   * @return The result of the division.
   */
  public MyNum divide(MyNum num);
}
/**
* Parent class MyNum that implements Operand.
*/
class MyNum implements Operand {
  protected double value;
  /**
   * Constructs a MyNum object with a default value of 0.0.
   */
  public MyNum() {
      value = 0.0;
  }
  /**
   * Constructs a MyNum object with the given value.
   *
   * @param value The value of the number.
   */
  public MyNum(double value) {
      this.value = value;
  }
  @Override
  public MyNum add(MyNum num) {
      value += num.value;
      return this;
  }
  @Override
  public MyNum subtract(MyNum num) {
      value -= num.value;
      return this;
  }
  @Override
  public MyNum multiply(MyNum num) {
      value *= num.value;
      return this;
  }
  @Override
  public MyNum divide(MyNum num) {
      if (num.value != 0) {
          value /= num.value;
      } else {
          System.out.println("Cannot divide by zero!");
      }
      return this;
  }
  @Override
  public String toString() {
      return String.valueOf(value);
  }
}
/**
* Child class MyWholeNum that extends MyNum.
*/
class MyWholeNum extends MyNum {
  /**
   * Constructs a MyWholeNum object with the given integer value.
   *
   * @param value The integer value.
   */
  public MyWholeNum(int value) {
      super(value);
  }
  /**
   * Constructs a MyWholeNum object with a default value of 0.
   */
  public MyWholeNum() {
      super();
  }
  @Override
  public String toString() {
      // Convert the value in the parent class to an integer
      int val = (int) super.value;
      return String.valueOf(val);
  }
}
/**
* Child class MyWholePosNum that extends MyWholeNum.
*/
class MyWholePosNum extends MyWholeNum {
  /**
   * Constructs a MyWholePosNum object with the absolute value of the given integer.
   *
   * @param value The integer value.
   */
  public MyWholePosNum(int value) {
      super(Math.abs(value));
  }
  /**
   * Constructs a MyWholePosNum object with a default value of 0.
   */
  public MyWholePosNum() {
      super();
  }
}

