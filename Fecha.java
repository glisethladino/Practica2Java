package Clase2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha{

    private GregorianCalendar gregorianCalendar;
    public Fecha(){
    }

    public Fecha(int anio, int mes, int dia){
        this.gregorianCalendar = new GregorianCalendar();
    }
    @Override
    public String toString(){
        return this.gregorianCalendar.get(Calendar.YEAR) + "/"+
                this.gregorianCalendar.get(Calendar.MONTH) + "/"+
                this.gregorianCalendar.get(Calendar.DATE);
    }

    public boolean fechaCorrecta(){
        return this.gregorianCalendar.getTime().equals(Calendar.getInstance().getTime());
    }

    public void SumarDia(){
        getGregorianCalendar().add(Calendar.DATE, int amount:1);

    }

    public GregorianCalendar getGregorianCalendar() {
        return gregorianCalendar;
    }

    public void setGregorianCalendar(GregorianCalendar gregorianCalendar) {
        this.gregorianCalendar = gregorianCalendar;
    }
}
