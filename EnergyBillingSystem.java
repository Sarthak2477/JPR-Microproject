package Microproject;
import java.util.Scanner;

import Microproject.*;

public class EnergyBillingSystem {
    public static void main(String[] args) {
        System.out.println("Enter Customer details: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Customer Address: ");
        String address = sc.nextLine();
        System.out.print("Customer Connection Type: ");
        String connectionType = sc.nextLine();
        System.out.print("Customer Contact: ");
        long contact = sc.nextLong();
        System.out.print("Customer Meter Number: ");
        int meterNum = sc.nextInt();
        Customer customer = new Customer(name, address, connectionType, contact, meterNum);
        System.out.print("Enter unit: ");
        Bill bill = new Bill(customer, sc.nextInt());
        bill.calculateBill();
        bill.getDueDate();
        System.out.println(bill);
        
    }
}
