package Esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Esercizio2 {
    //Primo punto, generiamo lista di N interi casuali tra 0 e 100
    public static List<Integer> listaCasuale(int n){
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            //riempio lista di numeri random da 0 a 100 in base ad n (passato dall'utente)
            lista.add(random.nextInt(101));
        }
        return lista;
    }

    // Raddoppia la lista aggiungendo elementi in ordine inverso
    public static List<Integer> raddoppiaLista(List<Integer> originale) {
        List<Integer> nuovaLista = new ArrayList<>(originale);

        // Creo una copia invertita
        for (int i = originale.size() - 1; i >= 0; i--) {
            nuovaLista.add(originale.get(i));
        }

        return nuovaLista;
    }

    //stampiamo elementi in posizione pari o dispari
    public static void stampaElementiSelezionati(List<Integer> lista, boolean pari) {
        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0) {
                System.out.print(lista.get(i) + " ");
            } else if (!pari && i % 2 != 0) {
                System.out.print(lista.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> listaCasuale = listaCasuale(10);
        System.out.println("Lista originale:");
        System.out.println(listaCasuale);
        List<Integer> listaRaddoppiata = raddoppiaLista(listaCasuale);

        System.out.println("Lista raddoppiata:");
        System.out.println(listaRaddoppiata);

        System.out.println("Elementi in posizioni pari:");
        stampaElementiSelezionati(listaRaddoppiata, true);

        System.out.println("Elementi in posizioni dispari:");
        stampaElementiSelezionati(listaRaddoppiata, false);
    }

    }

