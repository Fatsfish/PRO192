package CaseStudy1;

import java.io.*;
import java.util.StringTokenizer; // for splitting string
import java.util.Vector; // list of items
import java.util.Scanner; // for input
import java.util.Collection; //get the sort[...] method

/**
 *
 * @author Kyro - FF
 */
public class EmpList extends Vector<Employee> {

    Scanner sc = new Scanner(System.in);

    public EmpList() {
        super();
    }

    // Add employee from a text file
    public void AddFromFile(String fName) {
        try {
            File f = new File(fName);
            if (!f.exists()) {
                return;
            }
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String details;
            while ((details = bf.readLine()) != null) {
                StringTokenizer stk = new StringTokenizer(details, ",");
                String code = stk.nextToken().toUpperCase();
                String name = stk.nextToken().toUpperCase();
                int salary = Integer.parseInt(stk.nextToken());
                //Create an employee
                Employee emp = new Employee(code, name, salary);
                this.add(emp);
            }
            bf.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void saveToFile(String fName) {
        if (this.size() == 0) {
            System.out.println("Empty List");
            return;
        }
        try {
            File f = new File(fName);
            FileWriter fw = new FileWriter(f);//write
            PrintWriter pw = new PrintWriter(fw);//println()
            for (Employee x : this) {
                pw.println(x.getCode() + "," + x.getName() + "," + x.getSalary());

            }
            pw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //Find an employee code
    private int find(String aCode) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCode().equals(aCode)) {
                return i;
            }
        }
        return -1;
    }

    //add a new employee
    public void addNewEmp() {
        String newCode, newName;
        int salary = 0, pos;
        boolean valid = true;
        System.out.println("Enter new employee details: ");
        do {
            System.out.println("   code E000:");
            newCode = sc.nextLine().toUpperCase();
            pos = find(newCode);
            valid = newCode.matches("^E\\d{3}$");// Pattern: E and 3 digits
            if (pos >= 0) {
                System.out.println("The code is duplicated.");
            }
            if (!valid) {
                System.out.println("The code: E and 3 digits.");
            }
        } while (pos >= 0 || (!valid));
        System.out.println("  name:");
        newName = sc.nextLine().toUpperCase();
        int i;
        do {
            try {
                System.out.print("  salary: ");
                salary = Integer.parseInt(sc.nextLine());
                if (salary < 0) {
                    System.out.println("Wrong input, must be integer and >=0!");
                }
                i = 1;
            } catch (Exception e) {
                System.out.println("The price is invalid, please check again!");
                i = -1;
            }
        } while (i == -1 || salary < 0);
        this.add(new Employee(newCode, newName, salary));
        System.out.println("New employee has been added.");
    }

    public void removeEmp() {

        if (this.size() == 0) {
            System.out.println("Empty List.");
            return;
        }
        this.print();
        String code;
        System.out.println("Enter the code of removed employee: ");
        code = sc.nextLine().toUpperCase();
        int pos = find(code);
        if (pos < 0) {
            System.out.println("This code does not exist.");
        } else {
            this.remove(pos);
            System.out.println("The employee " + code + " has been removed.");

        }
    }

    public void promote() {
        if (this.size() == 0) {
            System.out.println("Empty List.");
            return;
        }
        this.print();
        String code;
        System.out.print("Enter the code of promoted employee: ");
        code = sc.nextLine().toUpperCase();
        int pos = find(code);
        if (pos < 0) {
            System.out.println("This code does not exist.");
        } else {
            int oldSalary = this.get(pos).getSalary();
            int newSalary = 0, i;
            do {
                try {
                    System.out.println("Old salary: " + oldSalary + ", new salary: ");
                    newSalary = Integer.parseInt(sc.nextLine());
                    if (newSalary < 0) {
                        System.out.println("Wrong input, must be integer and >=0!");
                    }
                    i = 1;
                } catch (NumberFormatException y) {
                    System.out.println("Wrong input, must be integer and >=0!");
                    i = -1;
                }

            } while (newSalary == oldSalary || i == -1 || newSalary < 0);
            this.get(pos).setSalary(newSalary);
            System.out.println("The employee " + code + " has been updated.");
        }
    }

    public void print() {
        if (this.size() == 0) {
            System.out.println("Empty List.");
            return;
        }

        System.out.println("\nEMPLOYEE LIST");
        System.out.println("----------------------------");
        for (Employee x : this) {
            x.print();
        }
    }
}
