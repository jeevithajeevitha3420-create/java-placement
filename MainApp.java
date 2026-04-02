package studentdetails;

import java.util.*;

public class MainApp {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Operations op = new Operations();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student s[] = new Student[n];
        for (int i = 0; i < n; i++)
        {
            s[i] = new Student();
        }
        int choice;
        do 
        {
            System.out.println("\n1. Add Students");
            System.out.println("2. Display Students");
            System.out.println("3. Average Marks");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nStudent " + (i + 1));
                        op.add(s[i]);
                    }
                    break;
                case 2:
                    System.out.println("\nStudent Details:");
                    for (int i = 0; i < n; i++) {
                        op.display(s[i]);
                    }
                    break;
                case 3:
                    op.average(s, n);
                    break;
                case 4:
                    System.out.println("Exit!..");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } 
        while (choice != 4);
    }
}