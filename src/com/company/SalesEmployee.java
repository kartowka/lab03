package com.company;

public class SalesEmployee extends Employee implements Sale  {
    private float commis;
    public SalesEmployee(float salary,float commis){
        super(salary);
        this.commis=commis;
    }
    public float ComputeSalary(){
        return super.ComputeSalary()*(1+commis/100);
    }
    public float getCom(){
        return this.commis;
    }
    public String getSaleName(){
        return "SalesEmployee";
    }
}
