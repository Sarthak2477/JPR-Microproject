package Microproject;

import java.util.ArrayList;
import java.util.Scanner;

import Microproject.*;

public class EnergyBillingSystem {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Customer customer;
        System.out.println("Enter 1. Create new Customer 2.Get Customer Bill");
        int opt = sc.nextInt();
        if (opt == 1) {
            System.out.println("Enter Customer details: ");
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
            customer = new Customer(name, address, connectionType, contact, meterNum);
            customerList.add(customer);
        }
        System.out.print("Enter unit: ");
        Bill bill = new Bill(customer, sc.nextInt());
        bill.calculateBill();
        bill.getDueDate();
        System.out.println(bill);

    }
}
