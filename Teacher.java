package co.istad.generic;

import java.math.BigDecimal;


public class Teacher extends Person {
    private BigDecimal salary;

    @Override
    public String getName() {
        return super.getName();
    }

    public Teacher(String name, String gender, Float height) {
        super(name, gender, height);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public Float getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(Float height) {
        super.setHeight(height);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Teacher(String name, String gender, Float height, BigDecimal salary) {
        super(name, gender, height);
        this.salary = salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }



    public BigDecimal getSalary(){
        return salary;
    }
    public void setSalary(BigDecimal salary){
        this.salary = salary;
    }
    }

