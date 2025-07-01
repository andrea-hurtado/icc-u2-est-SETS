import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Sets sets = new Sets();

        Set<String> ejemploHashSet = sets.construirLinkedHashSet();
        System.out.println("------ HashSet -------");
        System.out.println("Elementos del HashSet (no se garantiza orden):");
        for (String elemento : ejemploHashSet) {
            System.out.println(elemento);
        }

        Set<String> ejemploLinkedHashSet = sets.construirLinkedListHashSet();
        System.out.println("------ LinkedHashSet -------");
        System.out.println("Elementos del LinkedHashSet (orden xxxxx):");


        for (String elemento : ejemploLinkedHashSet) {
            System.out.println(elemento);
        }
        
        Set<String> ejemploTreeSet = sets.construirTreeSet();
        System.out.println("------ TreeSet -------");
        System.out.println("Elementos del TreeSet (orden inOrder):");
        for (String elemento : ejemploTreeSet) {

            System.out.println(elemento);
        }

        Set<String> ejemploTreeSetComparador = sets.contruirTreeSetConComparador();
        System.out.println("------ TreeSetComparador -------");
        System.out.println("Elementos del TreeSet (orden por longitud y luego alfabeticamente):");
        for (String elemento : ejemploTreeSetComparador) {

            System.out.println(elemento);
        }

        Set<String> ejemploTreeSetComparadorReves = sets.contruirTreeSetConComparadorReves();
        System.out.println("------ TreeSetComparadorReves -------");
        System.out.println("Elementos del TreeSet (orden por longitud y luego alfabeticamente):");
        for (String elemento : ejemploTreeSetComparadorReves) {

            System.out.println(elemento);
        }
    }

    public static void runHashSet(Sets sets) {
        sets.construirLinkedHashSet();
    }

    public static void runLinkedHashSet(Sets sets) {
        sets.construirLinkedListHashSet();
    }

    public static void runTreeSet(Sets sets) {
        sets.construirTreeSet();
    }

    public static void runTreeSetComparador(Sets sets) {
        sets.contruirTreeSetConComparador();
    }

    public static void runTreeSetComparadorReves(Sets sets) {
        sets.contruirTreeSetConComparadorReves();
    }

}