package CaseStudy1;

/**
 *
 * @author Kyro
 */
import java.util.Scanner;

public class ManageProgram {

    public static void main(String[] args) {
        String filename = "employees.txt";
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu(6);
        menu.add("Add new employee");
        menu.add("Remove an employee");
        menu.add("Promoting the employee's salary");
        menu.add("Print the list");
        menu.add("Save to files");
        menu.add("Quit");
        int userChoice;
        boolean changed = false;
        EmpList list = new EmpList();
        list.AddFromFile(filename);
        do {
            System.out.println("\n EMPLOYEE MANAGER");
            userChoice = menu.getChoice();
            switch (userChoice) {
                case 1:
                    list.addNewEmp();
                    changed = true;
                    break;
                case 2:
                    list.removeEmp();
                    changed = true;
                    break;
                case 3:
                    list.promote();
                    changed = true;
                    break;
                case 4:
                    list.print();
                    break;
                case 5:
                    list.saveToFile(filename);
                    changed = false;
                default:
                    if (changed) {
                        System.out.println("Save changes Y/N?");
                        String response = sc.nextLine().toUpperCase();
                        if (response.startsWith("Y")) {
                            list.saveToFile(filename);
                        }
                    }
            }
        } while (userChoice > 0 && userChoice < 6);
    }
}
