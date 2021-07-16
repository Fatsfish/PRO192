/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PESE1501PRO192;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author User
 */
public class Student151228 {

    private String code;
    private String name;
    private String gender;
    private int age;
    private double score;

    public Student151228(String c, String n, String g, int a, double s) {
        code = c;
        name = n;
        gender = g;
        age = a >= 0 ? a : 0;
        score = s >= 0 ? s : 0;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void print() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);

    }

}

class StudentList151228 extends Vector<Student151228> {

    Scanner sc = new Scanner(System.in);
    Vector<String> storedCodes = new Vector<String>();//stored codes in file

    public StudentList151228() {
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
            String code, name, gender, age, score;
            while ((code = bf.readLine()) != null
                    && (name = bf.readLine()) != null
                    && (gender = bf.readLine()) != null
                    && (age = bf.readLine()) != null
                    && (score = bf.readLine()) != null) {
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

    
    int find(String aCode) {
        for (int i = 0; i < this.size(); i++) {
            if (aCode.equals(this.get(i).getCode())) {
                return i;
            }
        }
        return -1;
    }

    public static int checkName(String name) {
        int cn = 0;
        if (!"".equals(name)) {
            for (int i = 0; i < name.length(); i++) {
                char NN = name.charAt(i);
                //Khai báo tên chỉ nhận ký tự chữ
                if (Character.isLetter(NN)) {
                    cn++;
                }
                if (NN == ' ') {
                    if (name.matches("\\W*")) {
                        cn--;
                    }
                    cn++;
                }
            }
            if (cn == name.length()) {
                return 1;
            }
        } else {
            return 0;
        }
        return 0;
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
            f.deleteOnExit();
            for (Student151228 x : this) {
                pw.flush();
                pw.println(x.getCode());
                pw.println(x.getName());
                pw.println(x.getGender());
                pw.println(x.getAge());
                pw.println(x.getScore());
                pw.flush();
            }
            pw.close();
            fw.close();
            this.loadStoredCodes(fName);//reload stored codes
            this.clear(); //clear item list
            System.out.println("The list has been saved!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addNewStudent() {
        String newCode, newName, newGender;
        int age = 0;
        int pos = -1;
        double score = 0;
        System.out.println("Enter new student details: ");
        do {
            System.out.println(" code: ");
            newCode = sc.nextLine().toUpperCase();
            pos = find(newCode);
            if (pos >= 0) {
                System.out.println("This code has been used, please try again!");
                this.print();
            }
            if ("".equals(newCode)) {
                System.out.println("There's nothing here, please try again!");

            }
        } while (pos >= 0 || "".equals(newCode));
        int N;//kiểm tra tên
        do {
            System.out.print(" name: ");
            newName = sc.nextLine().toUpperCase();
            N = checkName(newName);
            if (N == 1) {
                System.out.println(" valid!");
            }
            if (N == 0) {
                System.out.println("Not valid, please type again!");
            }
        } while (N == 0);
        do {
            System.out.print(" gender: ");
            newGender = sc.nextLine().toUpperCase();
            N = checkName(newGender);
            if (N == 1) {
                System.out.println(" valid!");
            }
            if (N == 0) {
                System.out.println("Not valid, please type again!");
            }
        } while (N == 0);
        int i;
        do {
            try {
                System.out.print("   age: ");
                age = Integer.parseInt(sc.nextLine());
                if (age < 0 || age > 90) {
                    System.out.println("Wrong input, must be integer, >=0 and <=90!");
                }
                i = 1;
            } catch (Exception e) {
                System.out.println("The age is invalid, please check again!");
                i = -1;
            }
        } while (i == -1 || age < 0 || age > 90);
        do {
            try {
                System.out.print(" score: ");
                score = Double.parseDouble(sc.nextLine());
                if (score < 0 || score > 10) {
                    System.out.println("Wrong input, must be double, >=0 and <=10!");
                }
                i = 1;
            } catch (Exception e) {
                System.out.println("The score is invalid, please check again!");
                i = -1;
            }
        } while (i == -1 || score < 0 || score > 10);
        this.add(new Student151228(newCode, newName, newGender, age, score));
        System.out.println("New student has been addded");

    }

    //remove an items from new item list
    public void removeStudent() {
        if (this.size() == 0) {
            System.out.println("Empty List.");
            return;
        }
        this.print();
        String code;
        System.out.println("Enter the code of removed student: ");
        code = sc.nextLine().toUpperCase();
        int pos = find(code);
        if (pos < 0) {
            System.out.println("This code does not exist.");
        } else {
            this.remove(pos);
            System.out.println("The student " + code + " has been removed.");

        }
    }

    public void update() {
        if (this.size() == 0) {
            System.out.println("Empty List.");
            return;
        }
        this.print();
        String code = null;
        String newName, newGender;
        int age = 0;
        double score = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the code of updated student: ");
        code = sc.nextLine().toUpperCase();
        int pos = find(code);
        if (pos < 0) {
            System.out.println("This code does not exist.");
        } else {
            int N;//kiểm tra tên
            do {
                System.out.print(" name: ");
                newName = sc.nextLine().toUpperCase();
                N = checkName(newName);
                if (N == 1) {
                    System.out.println(" valid!");
                }
                if (N == 0) {
                    System.out.println("Not valid, please type again!");
                }
            } while (N == 0);
            do {
                System.out.print(" gender: ");
                newGender = sc.nextLine().toUpperCase();
                N = checkName(newGender);
                if (N == 1) {
                    System.out.println(" valid!");
                }
                if (N == 0) {
                    System.out.println("Not valid, please type again!");
                }
            } while (N == 0);
            int i;
            do {
                try {
                    System.out.print("   age: ");
                    age = Integer.parseInt(sc.nextLine());
                    if (age < 0 || age > 90) {
                        System.out.println("Wrong input, must be integer, >=0 and <=90!");
                    }
                    i = 1;
                } catch (Exception e) {
                    System.out.println("The age is invalid, please check again!");
                    i = -1;
                }
            } while (i == -1 || age < 0 || age > 90);
            do {
                try {
                    System.out.print(" score: ");
                    score = Double.parseDouble(sc.nextLine());
                    if (score < 0 || score > 10) {
                        System.out.println("Wrong input, must be double, >=0 and <=10!");
                    }
                    i = 1;
                } catch (Exception e) {
                    System.out.println("The score is invalid, please check again!");
                    i = -1;
                }
            } while (i == -1 || score < 0 || score > 10);
            this.get(pos).setName(newName);
            this.get(pos).setGender(newGender);
            this.get(pos).setAge(age);
            this.get(pos).setScore(score);
            System.out.println("The student " + code + " has been updated.");
        }
    }

    public void print() {
        if (this.size() == 0) {
            System.out.println("Empty List.");
            return;
        }
        System.out.println("\nSTUDENT LIST");
        System.out.println("----------------------------");
        for (Student151228 x : this) {
            x.print();
        }
    }
}

class Menu151228 {

    String[] hints;
    int n = 0; // current numbers of hints
    // create a menu with size elements

    public Menu151228(int size) {
        if (size < 1) {
            size = 10;
        }
        hints = new String[size];
    }

    // add a hint
    public void add(String aHint) {
        if (n < hints.length) {
            hints[n++] = aHint;
        }
    }

    //get user choice
    public int getChoice() {
        int result = 0;
        if (n > 0) {
            //print out hints
            for (int i = 0; i < n; i++) {
                System.out.println((i + 1) + "-" + hints[i]);
            }
//Create Exception error while choosing the menu input.
            while (true) {
                try {
                    do {
                        System.out.print("Please select an operation: ");
                        Scanner sc = new Scanner(System.in);
                        result = Integer.parseInt(sc.nextLine());
                        if ((result < 1) | (result > 6)) {
                            System.out.println("Invalid number! Please try again");
                        }
                    } while ((result < 1) | (result > 6));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong input format! Please try again");
                }
            }
        }
        return result;
    }
}

class Manager151228 {

    public static void main(String[] args) {
        String filename = "inputData.txt";
        Scanner sc = new Scanner(System.in);
        Menu151228 menu = new Menu151228(6);
        menu.add("Add new student");
        menu.add("Remove a student");
        menu.add("Update student's information");
        menu.add("Print the list");
        menu.add("Save to file");
        menu.add("Quit");
        int userChoice;
        StudentList151228 list = new StudentList151228();
        list.loadStoredCodes(filename);
        do {
            System.out.println("\nSTUDENT MANAGER");
            userChoice = menu.getChoice();
            switch (userChoice) {
                case 1:
                    list.addNewStudent();
                    break;
                case 2:
                    list.removeStudent();
                    break;
                case 3:
                    list.update();
                    break;
                case 4:
                    list.print();
                    break;
                case 5:
                    list.appendToFile(filename);
                    break;
                default:
                    if (list.size() > 0) {
                        System.out.println("Save changes Y/N? ");
                        String response = sc.nextLine().toUpperCase();
                        if (response.startsWith("Y")) {
                            list.appendToFile(filename);
                        }
                    }
            }
        } while (userChoice > 0 && userChoice < 6);
    }
}
