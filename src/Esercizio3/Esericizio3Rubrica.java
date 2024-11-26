package Esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Esericizio3Rubrica {
    private static Map<String, String> contatti;


    public void Rubrica() {
        contatti = new HashMap<>();
    }

    // 1. Inserimento contatto
    public static void aggiungiContatto(String nome, String telefono) {
        contatti.put(nome, telefono);
    }

    // 2. Rimozione contatto per nome
    public static void rimuoviContatto(String nome) {
        contatti.remove(nome);
    }

    // 3. Ricerca persona per numero
    public static String trovaNomeDaTelefono(String telefono) {
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            if (entry.getValue().equals(telefono)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // 4. Ricerca telefono per nome
    public static String trovaTelefonoDaNome(String nome) {
        return contatti.get(nome);
    }

    // 5. Stampa tutti i contatti
    public static void stampaTuttiContatti() {
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            System.out.println("Nome: " + entry.getKey() +
                    ", Telefono: " + entry.getValue());
        }
    }

}
