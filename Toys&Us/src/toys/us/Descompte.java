/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toys.us;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author marc
 */
public class Descompte {
    private Calendar dataInici;
    private int descompte;
    private Calendar dataFinal = dataInici.add(Calendar.DATE, 30);
    

    public Date getDataInici() {
        return dataInici;
    }

    public void setDataInici(Date dataInici) {
        this.dataInici = dataInici;
    }

    public int getDescompte() {
        return descompte;
    }

    public void setDescompte(int descompte) {
        this.descompte = descompte;
    }

    public Descompte(Date dataInici, int descompte) {
        this.dataInici = dataInici;
        this.descompte = descompte;
    }

    
}
