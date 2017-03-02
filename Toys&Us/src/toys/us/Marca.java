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
public class Marca {
    private String nomMarca;
    private String dadesContacte;
    
    // Setter i Getters

    public String getNomMarca() {
        return nomMarca;
    }

    public void setNomMarca(String nomMarca) {
        this.nomMarca = nomMarca;
    }

    public String getDadesContacte() {
        return dadesContacte;
    }

    public void setDadesContacte(String dadesContacte) {
        this.dadesContacte = dadesContacte;
    }
    
    // Constructor

    public Marca(String nomMarca, String dadesContacte) {
        this.nomMarca = nomMarca;
        this.dadesContacte = dadesContacte;
    }

    public Marca(String nomMarca) {
        this.nomMarca = nomMarca;
    }
    
    
}
