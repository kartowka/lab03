package com.company;

public class SalesManager extends Manager implements Sale{
    public float commis;
    public SalesManager(float salary,float kmult,float commis){
        super(salary,kmult);
        this.commis = commis;
    }
    public float ComputeSalary(){
        return super.ComputeSalary() * (1+this.commis/100);
    }
    public float getCom(){
        return this.commis;
    }
    public String getSaleName(){
        return "SalesManager";
    }
}
