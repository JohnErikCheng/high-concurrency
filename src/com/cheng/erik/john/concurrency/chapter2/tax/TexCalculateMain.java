package com.cheng.erik.john.concurrency.chapter2.tax;

/**
 * @ClassName ：TexCalculateMain
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/25 11:21
 * @Description:
 */
public class TexCalculateMain {

    public static void main(String[] args) {
        /*TaxCalculate taxCalculate = new TaxCalculate(10000, 2000) {
            @Override
            public double calculate() {
                return this.getSalary() * 0.1 + this.getBonus() * 0.1;
            }
        };
        double tax = taxCalculate.calculate();
        System.out.println(tax);*/

        TaxStategyImpl taxStategy = new TaxStategyImpl();
        Double calculate = taxStategy.calculate(10000d, 2000d);
        System.out.println(calculate);
    }
}
