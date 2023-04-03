package Microproject;
import java.time.LocalDate;

import Microproject.*;

public class Bill{
    double billAmount;
    String due_date;
    int unit;
    Customer customer;

    public double getBillAmount() {
        return billAmount;
    }
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    public void getDueDate(){
        LocalDate today = LocalDate.now();
        LocalDate lastdayprevMonth = LocalDate.of(today.getYear(),today.getMonthValue(), 1).minusDays(1);
        LocalDate dueDate = lastdayprevMonth.plusDays(21);
        due_date = dueDate.toString();
    }
    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Bill( Customer customer, int unit) {
        this.customer = customer;
        this.unit = unit;
    }

    public void calculateBill(){
        if(customer.getConnectionType().equalsIgnoreCase("residential")){
            if(unit >= 0 && unit <= 100) billAmount = unit*3.44;
            else if(unit >= 101 && unit <= 300) billAmount = unit*7.34;
            else if(unit>=301 && unit <= 500) billAmount = unit*10.36;
            else if(unit >= 500) billAmount = unit*11.82;
        }
        else if(customer.getConnectionType().equalsIgnoreCase("commercial")){
            billAmount = unit*12.5;
        }
        else if(customer.getConnectionType().equalsIgnoreCase("Agriculture")){
            billAmount = 500;
        }
    }

    @Override
    public String toString() {
        return "Customer Name: "+customer.getName()+"\n"+
        "Customer Address: "+customer.getAddress()+"\n"+
        "Customer connection type: "+customer.getConnectionType()+"\n"+
        "Customer Contact: "+ customer.getContact()+"\n"+
        "Customer Meter No: "+customer.getMeterNum()+"\n"+
        "Unit: "+ unit +"\n"+
        "Due Date: "+due_date+"\n"+
        "Bill Amount: "+billAmount;



    }
    
}