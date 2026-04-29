/**
 * COD - Certificat de Dépôt (Certificate of Deposit).
 * 
 * Hérite de BankAccount et ajoute un attribut supplémentaire :
 * - duration : la durée du certificat en mois
 * 
 * @author Etudiant
 * @version 1.0
 */
public class COD extends BankAccount {

    // Attribut supplémentaire : durée du certificat (en mois)
    private int duration;

    /**
     * Constructeur de COD.
     * 
     * @param account  Le numéro du compte
     * @param balance  Le montant déposé
     * @param duration La durée du certificat en mois
     */
    public COD(String account, double balance, int duration) {
        // Appel du constructeur parent BankAccount
        super(account, balance);
        this.duration = duration;
    }

    // --- Getter et Setter pour duration ---

    /**
     * Retourne la durée du certificat.
     * @return duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Définit la durée du certificat.
     * @param duration La nouvelle durée en mois
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Affiche les informations du certificat de dépôt.
     */
    @Override
    public void displayInfo() {
        System.out.println("  Compte   : " + account);
        System.out.println("  Montant  : " + balance + " €");
        System.out.println("  Durée    : " + duration + " mois");
    }
}
