// order
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.th_tuan3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    ArrayList<OrderDetail> lineItems;
    private int count;
    public void addLineItems(Product p, int x){
        lineItems.add(new OrderDetail(p,x));
    }
    
    public double calcTotalCharge(){
         count = 0;
        for(OrderDetail x: lineItems){
            count+=x.calcTotalPrice();
        }
        return count;
        
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", orderDate=" + orderDate + ", lineItems=" + lineItems + ", count=" + count + '}';
    }
    
    public Order(){
        lineItems = new ArrayList<OrderDetail>();
    }

    public LocalDate inNgay(){
        return LocalDate.now();    
    }

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public ArrayList<OrderDetail> getLineItems() {
        return lineItems;
    }



    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    
//    public void nhap(Scanner sc){
//        System.out.println("Nhap vào mã hóa đơn: ");
//        orderID=sc.nextInt();
//    }
//    
//    public void xuat(){
//        System.out.println("Mã hóa đơn: "+orderID);
//        System.out.println("Ngày xuất hóa đơn: "+orderDate);
//        System.out.println("Tổng tiền thanh toán: "+count);
//    }
    
}


// orderdetail
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.th_tuan3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class OrderDetail{
    private int quatity;
    private Product product;
    public double calcTotalPrice(){
        double thanhtien;
        thanhtien=quatity*product.getPrice();
        return thanhtien;
        
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "quatity=" + quatity + ", product=" + product + '}';
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public OrderDetail(Product product, int quatity) {
        this.quatity = quatity;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    
}
// product
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.th_tuan3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Product {
    private String description;
    private String productID;
    private double price;

    @Override
    public String toString() {
        return "Product{" + "description=" + description + ", productID=" + productID + ", price=" + price + '}';
    }

    public Product() {
    }

    public Product(String description, String productID, double price) {
        this.description = description;
        this.productID = productID;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
//    public void nhap(Scanner sc){
//        System.out.println("Nhap vào mô tả sp: ");
//        description=sc.nextLine();
//        System.out.println("Nhập vào mã sản phẩm: ");
//        productID=sc.nextLine();
//        System.out.println("Nhập vào giá sản phẩm: ");
//        price=sc.nextDouble();
//    }
//    public void xuat(Scanner sc){
//        System.out.println("Mô tả:"+description);
//        System.out.println("Mã SP:"+productID);
//        System.out.println("Giá:"+price);
//        
//    }
}



//test


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.th_tuan3;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Order order = new Order(1,LocalDate.now());
       order.lineItems = new ArrayList<>();
      
       System.out.println("Mã HD:"+order.getOrderID());
       System.out.println("Ngày lập hóa đơn:"+order.inNgay());
       Product p1= new Product("Nước tương","sp4",8000);
       Product p2= new Product("Gạo","sp1",18000);
       Product p3= new Product("Đường","sp3",10000);
       Product p4= new Product("Gạo","sp1",18000);
       Product p5= new Product("Nước tương","sp4",8000);
       Product p6= new Product("Nước tương","sp4",8000);
       Product p7= new Product("Nước tương","sp4",8000);
       OrderDetail op1= new OrderDetail(p1,10);
       OrderDetail op2= new OrderDetail(p2,10);
       OrderDetail op3= new OrderDetail(p3,10);
       OrderDetail op4= new OrderDetail(p4,10);
       OrderDetail op5= new OrderDetail(p5,10);
       OrderDetail op6= new OrderDetail(p6,10);
       OrderDetail op7= new OrderDetail(p7,10);
       
       System.out.format("%-10s %-15s %-15s %-15s %-15s",
               "STT",
               "|Mã SP",
               "|Mô tả",
               "|Đơn giá",
               "|Số lượng",
               "|Thành tiền");
              
       for(OrderDetail or: order.getLineItems()){
            System.out.format("%-5s -%10s %-30s %-30s %-30s %-15s", 
           lineItems().indexOf(or)index+1,
            "| "+or.getProduct().getProductID(),
            "| "+or.getProduct().getDescription(),
            "| "+or.getProduct().getPrice(),
            "| "+or.getQuatity(),
            "| "+or.calcTotalPrice()+"VND");
            

       }
       System.out.println("Tổng tiền thanh toán"+order.calcTotalCharge());
    }
    
}

