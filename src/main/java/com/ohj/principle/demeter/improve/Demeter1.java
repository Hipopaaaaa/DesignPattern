package com.ohj.principle.demeter.improve;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demeter1 {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//学校总部的员工类
class Employee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学院的员工类
class CollegeEmployee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//管理学院员工的管理类
class CollegeManager{
    //返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) { //增加了10个员工到list
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id= "+i);
            list.add(emp);
        }
        return list;
    }
    //输出学院员工的信息
    public void printEmployee(){
        List<CollegeEmployee> collegeEmployees = this.getAllEmployee();
        System.out.println("=====学院员工=========");
        collegeEmployees.stream()
                .map(CollegeEmployee::getId)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

//方式二：

//学校总部的管理类
class SchoolManager{
    //返回学校总部的所有员工
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) { //增加了5个员工到list
            Employee emp = new Employee();
            emp.setId("学校总部员工id= "+i);
            list.add(emp);
        }
        return list;
    }

    //该方法完成输出学校总部和学院的员工信息(id)
    void printAllEmployee(CollegeManager sub){

        sub.printEmployee();

        List<Employee> employees = this.getAllEmployee();
        System.out.println("=====学校总部员工=========");
        employees.stream()
                .map(Employee::getId)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}