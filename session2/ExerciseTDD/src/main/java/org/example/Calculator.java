package org.example;

public class Calculator {
    public boolean status = false;

    public boolean isOn() {
        return status;
    }

    public void turnOn() {
        status = true;
    }

    public void turnOff() {
        status = false;
    }

    public boolean isOff() {
        return !status;
    }

    public int add (int num1, int num2) {
        return num1 + num2;
    }

    public float add (float num1, float num2) {
        return num1 + num2;
    }

    public short add (short num1, short num2) {
        return (short) (num1 + num2);
    }

    public long add (long num1, long num2) {
        return (long) (num1 + num2);
    }

    public double add (double num1, double num2) {
        return num1 + num2;
    }


    public int minus (int num1, int num2) {
        return num1 - num2;
    }

    public float minus (float num1, float num2) {
        return num1 - num2;
    }

    public short minus (short num1, short num2) {
        return (short) (num1 - num2);
    }

    public long minus (long num1, long num2) {
        return (long) (num1 - num2);
    }

    public double minus (double num1, double num2) {
        return num1 - num2;
    }

    public int multiply (int num1, int num2) {
        return num1 * num2;
    }

    public float multiply (float num1, float num2) {
        return num1 * num2;
    }

    public short multiply (short num1, short num2) {
        return (short) (num1 * num2);
    }

    public long multiply (long num1, long num2) {
        return (long) (num1 * num2);
    }

    public double multiply (double num1, double num2) {
        return num1 * num2;
    }

    public int divide (int num1, int num2) {
        return num1 / num2;
    }

    public float divide (float num1, float num2) {
        return num1 / num2;
    }

    public short divide (short num1, short num2) {
        return (short) (num1 / num2);
    }

    public long divide (long num1, long num2) {
        return (long) (num1 / num2);
    }

    public double divide (double num1, double num2) {
        return num1 / num2;
    }

}
