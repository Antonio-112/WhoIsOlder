package util;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.Persona;

public class Fechas {
	
	public void whoIsOlder(Persona persona1, Persona persona2) {
		try {
            SimpleDateFormat dateFormat = new 
                SimpleDateFormat ("yyyy/MM/dd");
            Date date1 = dateFormat.parse(persona1.getFechaNacimiento());
            Date date2 = dateFormat.parse(persona2.getFechaNacimiento());
            if(date1.before(date2)){
                System.out.println(persona1.getNombre() + " es mayor que " + persona2.getNombre());
            }else if (date1.equals(date2)) {
            	System.out.println(persona1.getNombre() + " tiene la misma edad que" + persona2.getNombre() );
            }else {
            	System.out.println(persona1.getNombre() + " es menor que " + persona2.getNombre());
            }
        } catch (Exception ex) {
        	System.err.println(ex);
        }
	}

}
