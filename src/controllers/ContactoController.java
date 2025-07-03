package controllers;
import java.util.Set;
import java.util.TreeSet;
import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorConNumero;

public class ContactoController {

    public ContactoController(){
        runTreeContacto();
        runTreeContactoConNumero();
    }

    private void runTreeContacto(){

        System.out.println("----Contactos orden alfabetico apellido - nombre ----");
        Set<Contacto> contactos = new TreeSet<>(new ContactoComparator());  

        // Agregamos algunos contactos
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));

        for(Contacto contacto : contactos){
            System.out.println(contacto);
        }
    }

    private void runTreeContactoConNumero(){

        System.out.println("--Contactos orden alfabetico apellido - nombre - telefono(descendente)--");
        Set<Contacto> contactos = new TreeSet<>(new ContactoComparatorConNumero());  

        // Agregamos algunos contactos
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));

        for(Contacto contacto : contactos){
            System.out.println(contacto);
        }
    }



}