package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto>{

    @Override
    public int compare(Contacto c1, Contacto c2) {
        //primero el apellido orden alfabetico 
        int comparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());

        if (comparacionApellido!=0) {
           return comparacionApellido;
        }

        //segundo si son iguales comparo por el nombre orden alfabetico
        int comparacionNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());

        if (comparacionApellido!=0) {
            return comparacionNombre;
        }
        return comparacionNombre;

    }


}