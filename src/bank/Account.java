package bank;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Capacitaciones
 */
public class Account {

    private int numberAccount;
    private double balance;
    private final int frozenBalance;
    private String state;

    public Account(int saldo) {
        this.frozenBalance = 10000;
        this.balance = saldo;
        this.numberAccount= generarNumeroAleatoreo();
        this.state="Activo";
      }
        
        
        public int generarNumeroAleatoreo(){
            
         Random rnd = new Random();
        Double numeroR =rnd.nextDouble() *10000000;
        return numeroR.intValue();  
       
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
       
}
