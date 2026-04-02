package studentdetails;

import java.util.*;

public class Operations {

    Scanner sc = new Scanner(System.in);

   
    public void add(Student s)
    {
        System.out.print("Enter ID: ");
        s.id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Marks: ");
        s.marks = sc.nextInt();
    }
    public void display(Student s) 
    {
        System.out.println(s.id+" "+s.name +" "+s.marks);
    }
    public void average(Student s[], int n)
    {
        int total = 0;

        for (int i = 0; i < n; i++) 
        {
            total += s[i].marks;
        }

        System.out.println("Average Marks: " +(total / n));
    }
}