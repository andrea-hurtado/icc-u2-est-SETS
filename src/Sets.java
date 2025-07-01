import java.util.LinkedHashSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public Sets() {
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> palabras = new HashSet<>();//HashSet no deja que se repita

        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");

        return palabras;
    }

    public Set<String> construirLinkedListHashSet() {
        Set<String> palabraslinkeadas = new LinkedHashSet<>();

        palabraslinkeadas.add("Laptop");
        palabraslinkeadas.add("Manzana");
        palabraslinkeadas.add("Pera");
        palabraslinkeadas.add("Celular");
        palabraslinkeadas.add("Laptop");
        palabraslinkeadas.add("Pera");
        palabraslinkeadas.add("Laptop");


        return palabraslinkeadas;
    }

     public Set<String> construirTreeSet() {
        Set<String> palabrasTree = new TreeSet<>();

        palabrasTree.add("Laptop");
        palabrasTree.add("Manzana");
        palabrasTree.add("Pera");
        palabrasTree.add("Celular");
        palabrasTree.add("Laptop");
        palabrasTree.add("Pera");
        palabrasTree.add("Laptop");


        return palabrasTree;
    }

    public Set<String> contruirTreeSetConComparador() {
        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                //comparamos longitud
                int result = Integer.compare(s1.length(), s2.length());
                //si tienen la misma longitud, comparamos alfabeticamente
                if (result==0) {
                    return s1.compareTo(s2);
                }
                return result;
            }
        };
        Set<String> palabrasTree = new TreeSet<>(comparadorLongitud);

        palabrasTree.add("Laptop");
        palabrasTree.add("Manzana");
        palabrasTree.add("Pera");
        palabrasTree.add("Celular");
        palabrasTree.add("Laptop");
        palabrasTree.add("Pera");
        palabrasTree.add("Laptop");
        palabrasTree.add("Celulas");


        return palabrasTree;
    }

    public Set<String> contruirTreeSetConComparadorReves() {
        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                int result = Integer.compare(s1.length(), s2.length());
                if (result==0) {
                    return s2.compareTo(s1);
                }
                return result;
            }
        };
        Set<String> palabrasTree = new TreeSet<>(comparadorLongitud);

        palabrasTree.add("Laptop");
        palabrasTree.add("Manzana");
        palabrasTree.add("Pera");
        palabrasTree.add("Celular");
        palabrasTree.add("Laptop");
        palabrasTree.add("Pera");
        palabrasTree.add("Laptop");
        palabrasTree.add("Celulas");


        return palabrasTree;
    }
}