/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import bank.Client;
import java.util.HashMap;
import utils.exceptions.NoClientFoundException;

/**
 *
 * @author Capacitaciones
 */
public class ControllerClient {

    private static ControllerClient instance;
    private HashMap<String, Client> baseClient;

    private ControllerClient() {
        baseClient = new HashMap<String, Client>();

        Client andres = new Client("Andres", "123456789", "avenida 7 n67", 311247585, "Andres@hotmail.com");
        baseClient.put(andres.getId(), andres);
        Client jonathan = new Client("jonathan", "1110466979", "calle 123", 312365835, "jonathan.triana@payulatam.com");
        baseClient.put(jonathan.getId(), jonathan);
        Client edgar = new Client("edgar", "987654321", "calle 123", 310490954, "Edgar@gmail.com");
        baseClient.put(edgar.getId(), edgar);

    }

    public static ControllerClient getInstance() {
        if (instance == null) {
            return new ControllerClient();
        }
        return instance;

    }

    public Client getClientePorId(String Id) throws NoClientFoundException {
        Client cliente = baseClient.get(Id);
        if (cliente == null) {
            throw new NoClientFoundException("No client found" + Id);

        }
        return cliente;

    }
}
