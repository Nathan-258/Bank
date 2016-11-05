package bank;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Capacitaciones
 */
public class Client {

    private String name;
    private String id;
    private String adress;
    private int phone;
    private String email;
    List<Account> accounts;

    public Client(String nombre, String identificador, String direccion, int telefono, String email) {
        this.name = nombre;
        this.id = identificador;
        this.adress = direccion;
        this.phone = telefono;
        this.email = email;
        this.accounts = new ArrayList<Account>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

}
