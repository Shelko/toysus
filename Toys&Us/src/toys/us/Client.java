/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toys.us;

/**
 *
 * @author marc
 */
public class Client {
    
    // Atributs
    private String nom;
    private String dades;

    // Setter Getter

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDades() {
        return dades;
    }

    public void setDades(String dades) {
        this.dades = dades;
    }
    
    // Constructor

    public Client(String nom, String dades) {
        this.nom = nom;
        this.dades = dades;
    }
    
    // toString (No segur de posar-lo)

    @Override
    public String toString() {
        return "Client{" + "nom=" + nom + ", dades=" + dades + '}';
    }
    
    
}
