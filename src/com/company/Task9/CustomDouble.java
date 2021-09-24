package com.company.Task9;

public class CustomDouble
{
    private int a;
    private double b;

    public CustomDouble(int a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public CustomDouble(double res)
    {
        this.a = (int) res;
        this.b = res - a;
    }

    public CustomDouble sum(double second) {
        return this.sum(new CustomDouble(second));
    }
    public CustomDouble sum(CustomDouble second) {
        double res = this.toDouble() + second.toDouble();
        return new CustomDouble(res);
    }

    public CustomDouble subtraction(double second) {
        return this.sum(new CustomDouble(second));
    }
    public CustomDouble subtraction(CustomDouble second) {
        double res = this.toDouble() - second.toDouble();

        return new CustomDouble(res);
    }

    public CustomDouble multiplication(double second) {
        return this.sum(new CustomDouble(second));
    }
    public CustomDouble multiplication(CustomDouble second) {
        double res =  a * second.a + a * second.b + b * second.a + b * second.b;
        return new CustomDouble(res);
    }

    public CustomDouble division(double second) {
        return this.sum(new CustomDouble(second));
    }
    public CustomDouble division(CustomDouble second) {
        double res = this.toDouble() / second.toDouble();
        return new CustomDouble(res);
    }

    public void comparisons(CustomDouble second)
    {
        double res = this.toDouble() - second.toDouble();
        if(res > 0)
        {
            System.out.println("Перше число > за друге");
        } else if (res == 0){
            System.out.println("Числа рівні");
        } else
        {
            System.out.println("Друге число > за перше");
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomDouble that = (CustomDouble) o;

        if (a != that.a) return false;
        return Double.compare(that.b, b) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = a;
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double toDouble() {
        return (double) this.a + this.b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return this.toDouble() + "";
    }
}
