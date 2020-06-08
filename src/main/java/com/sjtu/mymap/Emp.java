package com.sjtu.mymap;

public class Emp implements Comparable<Emp>{

    int id;
    String name;
    double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{"+"id:" + id +
                ", name:'" + name +
                ", salary:" + salary+"}";
    }

    public int compareTo(Emp emp) {
        if(this.salary > emp.salary){
            return 1;
        }else if(this.salary < emp.salary){
            return -1;
        }else {
            if(this.id > emp.id){
                return 1;
            }else if(this.id < emp.id){
                return -1;
            }else {
                return 0;
            }
        }

    }
}
