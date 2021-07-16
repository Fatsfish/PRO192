package CaseStudy2;

/**
 *
 * @author Kyro
 */
import java.util.Scanner;
import java.util.Vector;
import java.io.*;
import java.util.Collections;

public class NewItems extends Vector<Item> {

    Scanner sc = new Scanner(System.in);
    Vector<String> storedCodes = new Vector<String>();//stored codes in file

    public NewItems() {
        super();
    }

    //Load stored coded from a text file
    public void loadStoredCodes(String fName) {
        //Clear stored codes before loading codes
        if (storedCodes.size() > 0) {
            storedCodes.clear();
        }
        try {
            File f = new File(fName);
            if (!f.exists()) {
                return;
            }
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String code, name, priceStr;
            while ((code = bf.readLine()) != null
                    && (name = bf.readLine()) != null
                    && (priceStr = bf.readLine()) != null) {
                storedCodes.add(code);
            }
            bf.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private boolean valid(String aCode) {
        for (int i = 0; i < storedCodes.size(); i++) {
            if (aCode.equals(storedCodes.get(i))) {
                return false;
            }
        }
        for (int i = 0; i < this.size(); i++) {
            if (aCode.equals(this.get(i).getCode())) {
                return false;
            }
        }
        return true;
    }

    private int find(String aCode) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCode().equals(aCode)) {
                return i;
            } else {
                return -1;
            }
        }
        return -1;
    }

    public void appendToFile(String fName) {
        if (this.size() == 0) {
            System.out.println("Empty List");
            return;
        }
        try { //append new items to the file
            boolean append = true;
            File f = new File(fName);
            FileWriter fw = new FileWriter(f, append);//write()
            PrintWriter pw = new PrintWriter(fw);// println()
            for (Item x : this) {
                pw.println(x.getCode());
                pw.println(x.getName());
                pw.println(x.getPrice());
                pw.flush();
            }
            pw.close();
            fw.close();
            this.loadStoredCodes(fName);//reload stored codes
            this.clear(); //clear item list
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void addNewItem() {
        String newCode, newName;
        int price = 0;
        boolean duplicated = false, matched = true;
        System.out.println("Enter new item details: ");
        do {
            System.out.println("   code(format I000): ");
            newCode = sc.nextLine().toUpperCase();
            duplicated = !valid(newCode);
            matched = newCode.matches("^I\\d{3}$");// Pattern: I and 3 digits
            if (duplicated) {
                System.out.println(" The code is duplicated.");
            }
            if (!matched) {
                System.out.println("  The code: I and 3 digits.");
            }
        } while (duplicated || (!matched));
        System.out.print("    name: ");
        newName = sc.nextLine().toUpperCase();
        int i;
        do {
            try {
                System.out.print("   price: ");
                price = Integer.parseInt(sc.nextLine());
                if (price < 0) {
                    System.out.println("Wrong input, must be integer and >=0!");
                }
                i = 1;
            } catch (Exception e) {
                System.out.println("The price is invalid, please check again!");
                i = -1;
            }
        } while (i == -1 || price < 0);
        this.add(new Item(newCode, newName, price));
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
            int oldPrice = this.get(pos).getPrice();
            int newPrice = 0, i;
            do {
                try {
                    System.out.println("Old price: " + oldPrice + ", new price: ");
                    newPrice = Integer.parseInt(sc.nextLine());
                    if (newPrice < 0) {
                        System.out.println("Wrong input, must be integer and >=0!");
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
        System.out.println("\nItem LIST");
        System.out.println("----------------------------");
        for (Item x : this) {
            x.print();
        }
    }
}
