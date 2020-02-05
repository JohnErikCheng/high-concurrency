package com.cheng.erik.john.concurrency.chapter2.tax;

/**
 * @ClassName ：TaxCalculate
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/25 11:18
 * @Description: 税务计算案例。策略模式。
 */
public class TaxCalculate {
    private double salary;
    private double bonus;

    private TaxStrategy taxStrategy;

    public TaxCalculate(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    protected double calculateTax(TaxStrategy taxStrategy) {
        return taxStrategy.calculate(salary, bonus);
    }

    public double calculate() {
        return this.calculateTax(taxStrategy);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
