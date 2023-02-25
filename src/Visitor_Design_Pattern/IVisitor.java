package Visitor_Design_Pattern;

public interface IVisitor {
 public void visit(Customer customer);
public void visit(Order order);
 public void visit(Item item);
 public void visit(CustomerGroup group);
 }
