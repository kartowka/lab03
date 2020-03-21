package com.company;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee(100);
        Manager m1 = new Manager(200,20);
        SalesManager sm = new SalesManager(100,20,30);
        SalesEmployee se = new SalesEmployee(100,20);
        System.out.println(e1.getName()+" "+e1.ComputeSalary());
        System.out.println(m1.getName()+ " "+m1.ComputeSalary());
        System.out.println(sm.getName()+" "+sm.ComputeSalary());
        System.out.println(se.getName()+" "+se.ComputeSalary());

    }
}
