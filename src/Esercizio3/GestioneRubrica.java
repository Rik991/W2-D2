package Esercizio3;

public class GestioneRubrica {

    public static void main(String[] args) {
        Esericizio3Rubrica rubrica = new Esericizio3Rubrica();

        // Esempio di utilizzo
        Esericizio3Rubrica.aggiungiContatto("Mario", "123456");
        Esericizio3Rubrica.aggiungiContatto("Luigi", "789012");
        Esericizio3Rubrica.aggiungiContatto("Giovanni", "345678");

        System.out.println("Tutti i contatti:");
        Esericizio3Rubrica.stampaTuttiContatti();

        System.out.println("\nTelefono di Mario: " +
                Esericizio3Rubrica.trovaTelefonoDaNome("Mario"));

        System.out.println("Nome con telefono 345678: " +
                Esericizio3Rubrica.trovaNomeDaTelefono("345678"));

        Esericizio3Rubrica.rimuoviContatto("Luigi");

        System.out.println("\nContatti dopo rimozione:");
        Esericizio3Rubrica.stampaTuttiContatti();
    }

}
