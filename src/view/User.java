package view;

import java.io.Serializable;

public class User implements Serializable{
    private String name;
    private String lastname;
    private String age;
    private String password;
    private String ae;
    private String cpf;
    

    
    public String getPassword() {
        return password;
    }
    
    private double balance;

    public User(String name, String lastname, String age, String password, String ae, String cpf, double balance) {
        this.name = name; 
        this.lastname = lastname;
        this.age = age;
        this.password = password;
        this.ae= ae;
        this.cpf = cpf;
        this.balance = balance;
    }
    
    public String getCpf() {
        return cpf;
    }   
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void deposit(double balance){
        this.balance += balance;
    }
    
    public void whitdraw(double amount){
        this.balance -= amount;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getage() {
        return age;
    }

    public void setage(String age) {
        this.age = age;
    }

    public String getAe() {
        return ae;
    }

    public void setAe(String ae) {
        this.ae = ae;
    }
    
}