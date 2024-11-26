package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public static void main(String[] args) {

        //Utilizzeremo HASHSET per garantire l'unicità degli elementi!

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di parole");
        int n = scanner.nextInt();
        scanner.nextLine();

        //Set per memorizzare le parole
        Set<String> paroleUniche = new HashSet<>();

        //Set per memorizzare le parole duplicate
        Set<String> paroleDuplicate = new HashSet<>();

        System.out.println("Inserisci " + n + " parole:");
        for (int i = 0; i < n ; i++) {
          String parola = scanner.nextLine();

          //se la parola già esiste va nel Set paroleDuplicate, quindi con l'if controllo se viene accettata o meno dal set paroleUniche
            //qualora fosse un duplicato il risultato dell'if sarà true e quindi aggiungo la parolo nel set duplicate
            if(!paroleUniche.add(parola)){
                paroleDuplicate.add(parola);
            }
        }
    //stampo le parole duplicate (con il simil foreach)
        System.out.println("Parole duplicate: ");
        for (String parola: paroleDuplicate){
            System.out.println(parola);
        }

        //Stampo il NUMERO di parole distinte
        for(String parola: paroleUniche){
            System.out.println("Numero di parole uniche: " + paroleUniche.size());
        }

        //ora l'elenco delle parole distinte
        System.out.println("Parole distinte: ");
        for (String parola: paroleUniche){
            System.out.println(parola);
        }

        scanner.close();

    }
}
