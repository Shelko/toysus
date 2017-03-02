/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toys.us;
import java.util.*;
/**
 *
 * @author marc
 */
public class Jugueta {
    // Atributs
    private Marca marca;
    private String nomJug;
    private String descripcio;
    private String tipus;
    private int quantitat;
    private String rangEdat;
    private final ArrayList<String> LLISTARANGS;
    
    // Constructor

    public Jugueta(Marca marca, String nomJug, String descripcio, String tipus, int quantitat, String rangEdat) {
        this.marca = marca;
        System.out.println(this.marca.getNomMarca());
        this.nomJug = nomJug;
        this.descripcio = descripcio;
        this.tipus = tipus;
        this.quantitat = quantitat;
        this.rangEdat = rangEdat;
        LLISTARANGS = new ArrayList<String>();

    }
    
    
    
    
}
