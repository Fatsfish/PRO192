
import java.util.Scanner;
import java.util.Vector;
import java.io.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class BookList extends Vector<Book> {

    Scanner sc = new Scanner(System.in);

    //Load stored coded from a text file
    public void loadBookFromFile(String fName) {
        //Clear stored codes before loading codes
        if (this.size() > 0) {
            this.clear();
        }
        try {
            File f = new File(fName);
            if (!f.exists()) {
                return;
            }
            FileInputStream fi = new FileInputStream(f);
            ObjectInputStream fo = new ObjectInputStream(fi);
            Book b;
            while ((b = (Book) (fo.readObject())) != null) {
                this.add(b);
            }
            fo.close();
            fi.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private boolean valid(String aCode) {
        for (int i = 0; i < this.size(); i++) {
            if (aCode.equals(this.get(i))) {
                return false;
            }
        }
        for (int i = 0; i < this.size(); i++) {
            if (aCode.equals(this.get(i).getTitle())) {
                return false;
            }
        }
        return true;
    }

    private int find(String aCode) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getTitle().equals(aCode)) {
                return i;
            } else {
                return -1;
            }
        }
        return -1;
    }

    public void saveToFile(String fName) {
        if (this.size() == 0) {
            System.out.println("Empty List");
            return;
        }
        try { //append new items to the file
            FileOutputStream f = new FileOutputStream(fName);
            ObjectOutputStream fo = new ObjectOutputStream(f);
            for (Book b : this) {
                fo.writeObject(b);
            }
            fo.close();
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void addNewBook() {
        String title;
        double price = 0;
        System.out.println("Enter new book details: ");
        do{
        System.out.print("    title: ");
        title = sc.nextLine().toUpperCase();}
        while (title.equals(""));
        int i;
        do {
            try {
                System.out.print("   price: ");
                price = Double.parseDouble(sc.nextLine());
                if (price < 0) {
                    System.out.println("Wrong input, must be a number and >=0!");
                }
                i = 1;
            } catch (Exception e) {
                System.out.println("The price is invalid, please check again!");
                i = -1;
            }
        } while (i == -1 || price < 0);
        this.add(new Book(price, title));
        System.out.println("New item has been addded");

    }

    //remove an items from new item list
    public void removeItem() {
        if (this.size() == 0) {
            System.out.println("Empty List.");
            return;
        }
        this.print();
        String code;
        System.out.println("Enter the code of removed item: ");
        code = sc.nextLine().toUpperCase();
        int pos = find(code);
        if (pos < 0) {
            System.out.println("This code does not exist.");
        } else {
            this.remove(pos);
            System.out.println("The item " + code + " has been removed.");

        }
    }

    public void updatePrice() {
        if (this.size() == 0) {
            System.out.println("Empty List.");
            return;
        }
        this.print();
        String code = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the code of updated item: ");
        code = sc.nextLine().toUpperCase();
        int pos = find(code);
        if (pos < 0) {
            System.out.println("This code does not exist.");
        } else {
            double oldPrice = this.get(pos).getPrice();
            double newPrice = 0;
            int i;
            do {
                try {
                    System.out.println("Old price: " + oldPrice + ", new price: ");
                    newPrice = Double.parseDouble(sc.nextLine());
                    if (newPrice < 0) {
                        System.out.println("Wrong input, must be a number and >=0!");
                    }
                    i = 1;
                } catch (NumberFormatException y) {
                    System.out.println("Wrong input, must be integer and >=0!");
                    i = -1;
                }
            } while (newPrice == oldPrice || i == -1 || newPrice < 0);
            this.get(pos).setPrice(newPrice);
            System.out.println("The item " + code + " has been updated.");
        }
    }

    public void print() {
        if (this.size() == 0) {
            System.out.println("Empty List.");
            return;
        }
        System.out.println("\nBOOK LIST");
        System.out.println("----------------------------");
        for (Book b : this) {
            b.output();
        }
    }

}
