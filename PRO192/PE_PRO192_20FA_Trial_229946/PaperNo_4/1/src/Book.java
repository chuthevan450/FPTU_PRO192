
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chuth
 */
public class Book {
    String title;
    int price;

    public Book() {
    }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title.toUpperCase();
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void enterBook(String title, int price){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        title = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextInt();
    }
    public void updatePrice(int price){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new price: ");
        price = sc.nextInt();
    }
}
