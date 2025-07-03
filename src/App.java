import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import controllers.ContactoController;
import controllers.Ejercicios;
import controllers.Sets;
import controllers.*;

public class App {
    public static void main(String[] args) throws Exception {
        String texto = """
            La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?

            Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.

            En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.
            """;

        Ejercicios e = new Ejercicios();
        System.out.println("Palabras únicas: " + e.contarPalabrasUnicas(texto));

        Sets sets = new Sets();
        
        runHashSet(sets);
        runLinkedHashSet(sets);
        runTreeSet(sets);
        runTreeSetComparador(sets);
        runTreeSetComparadorReves(sets);

        ContactoController contactoController= new ContactoController();
        System.out.println(contactoController);
    }

    public static void runHashSet(Sets sets) {

        Set<String> ejemploHashSet = sets.construirLinkedHashSet();
        System.out.println("------ HashSet -------");
        System.out.println("Elementos del HashSet (no se garantiza orden):");
        for (String elemento : ejemploHashSet) {
            System.out.println(elemento);
        }

    }

    public static void runLinkedHashSet(Sets sets) {
        Set<String> ejemploLinkedHashSet = sets.construirLinkedListHashSet();
        System.out.println("------ LinkedHashSet -------");
        System.out.println("Elementos del LinkedHashSet (orden xxxxx):");

        for (String elemento : ejemploLinkedHashSet) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSet(Sets sets) {
        Set<String> ejemploTreeSet = sets.construirTreeSet();
        System.out.println("------ TreeSet -------");
        System.out.println("Elementos del TreeSet (orden inOrder):");
        for (String elemento : ejemploTreeSet) {

            System.out.println(elemento);
        }
    }

    public static void runTreeSetComparador(Sets sets) {
        Set<String> ejemploTreeSetComparador = sets.contruirTreeSetConComparador();
        System.out.println("------ TreeSetComparador -------");
        System.out.println("Elementos del TreeSet (orden por longitud y luego alfabeticamente):");
        for (String elemento : ejemploTreeSetComparador) {

            System.out.println(elemento);
        }
    }

    public static void runTreeSetComparadorReves(Sets sets) {
        Set<String> ejemploTreeSetComparadorReves = sets.contruirTreeSetConComparadorReves();
        System.out.println("------ TreeSetComparadorReves -------");
        System.out.println("Elementos del TreeSet (orden por longitud y luego alfabeticamente):");
        for (String elemento : ejemploTreeSetComparadorReves) {

            System.out.println(elemento);
        }

    }

    

}