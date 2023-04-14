package Billingsystem;

import java.util.ArrayList;
import java.util.Scanner;

import Billingsystem.Customer;

public class EnergyBillingSystem {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Customer customer = null;
        int opt;
        do {
            System.out.print("Enter 1. Create new Customer 2.Get Customer Bill 3.Exit: ");
            opt = sc.nextInt();
            sc.nextLine();
            if (opt == 1) {
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
                System.out.println("Customer created successfully.");
                System.out.println("---------<>---------");
            } else if (opt == 2) {
                System.out.print("Enter Customer Meter Number: ");
                int meterNum = sc.nextInt();
                boolean isFound = false;
                while (!isFound) {
                    for (Customer c : customerList) {
                        if (c.getMeterNum() == meterNum) {
                            System.out.print("Enter Customer Unit: ");
                            Bill bill = new Bill(customer, sc.nextInt());
                            bill.calculateBill();
                            bill.getDueDate();
                            System.out.println("---------Customer Bill---------");
                            System.out.println(bill);
                            System.out.println("---------<>---------");
                            isFound = true;
                            break;
                        }
                    }
                    if (!isFound)
                        System.out.println("Unavailable Meter Number");
                }

            } else if (opt == 3)
                break;
            else
                System.out.println("Invalid option");

        } while (true);
    }
}
