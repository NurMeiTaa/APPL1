/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Firm;

/**
 *
 * @author dell
 */

public class Commission extends Hourly{
    private double totalSales;
    private final double commissionRate;
    public Commission(String eName, String eAddress, String ePhone, String 
            socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, commissionRate);
        this.commissionRate = commissionRate;
        totalSales = 0;
    }
    public void addSales(double totalSales){
        this.totalSales = this.totalSales + totalSales;
    }
    @Override
    public double pay(){
        double payment = super.pay() + (totalSales * commissionRate);
        totalSales = 0;
        return payment;
    }
    @Override
    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}