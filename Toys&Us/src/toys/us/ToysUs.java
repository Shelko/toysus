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
public class ToysUs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Marca m1 = new Marca("Bizak", "Calle Undargarín nº 6");
        Marca m2 = new Marca("Air Rebound", "Calle Bond nº007");
        Marca m3 = new Marca("Bunchems", "Calle Matas nº8");
        Marca m4 = new Marca("ARTIST", "Calle Echenique nº2");
        Marca m5 = new Marca("Tomy", "Calle Montero nº2");
        Marca m6 = new Marca("Estilo Total", "Calle Sánchez nº39");
        Marca m7 = new Marca("TOYLAND", "Calle Suda nº51");
        Marca m8 = new Marca("Games", "Calle Carmena nº79");
        Marca m9 = new Marca("Illuminations", "Calle Aguirre nº67");
        Marca m10 = new Marca("Bakugan", "Calle Tugores nº69");
        Marca m11 = new Marca("Pokémon", "Calle Paleta nº2");
        Marca m12 = new Marca("Nintendo", "Calle Iwata nº1");
        Marca m13 = new Marca("Sony", "Calle Yoshida nº4");
        Marca m14 = new Marca("Microsoft", "Calle Specter nº6");
        
        Client c1 = new Client("Joan","a");
        Client c2 = new Client("Tomeu","b");
        Client c3 = new Client("Marga","c");
        Client c4 = new Client("Jordi","d");
        Client c5 = new Client("Ramon","e");
        Client c6 = new Client("Marc","f");
        Client c7 = new Client("Alex","g");
        Client c8 = new Client("Samy","h");
        Client c9 = new Client("Arturo","i");
        Client c10 = new Client("Comodin","j");
        
                 Date dataFinal;
                 Calendar cal = Calendar.getInstance(); 
                 cal.add(Calendar.DATE, 15);
                 dataFinal = cal.getTime();


        System.out.println(nuevaFecha);
    }
    
}
