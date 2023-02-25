package Visitor_Design_Pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomerGroup implements IVisitable{
 private ArrayList<Customer> customers;
 public CustomerGroup(){
         customers = new ArrayList<Customer>();
        }
 public void accept(IVisitor visitor)
 {
         visitor.visit(this);
         for (Iterator<Customer> it = customers.iterator(); it.hasNext();)
            ((Customer)it.next()).accept(visitor);
         }
 public void addCustomer(Customer customer)
 {
         customers.add(customer);
         }}
