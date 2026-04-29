/**
 * CheckingAccount - Compte courant.
 * 
 * Hérite de BankAccount et ajoute un attribut supplémentaire :
 * - limit : la limite de découvert autorisée
 * 
 * @author Etudiant
 * @version 1.0
 */
public class CheckingAccount extends BankAccount {

    // Attribut supplémentaire : limite de découvert
    private double limit;

    /**
     * Constructeur de CheckingAccount.
     * 
     * @param account Le numéro du compte
     * @param balance Le solde initial
     * @param limit   La limite de découvert autorisée
     */
    public CheckingAccount(String account, double balance, double limit) {
        // Appel du constructeur parent BankAccount
        super(account, balance);
        this.limit = limit;
    }

    // --- Getter et Setter pour limit ---

    /**
     * Retourne la limite de découvert.
     * @return limit
     */
    public double getLimit() {
        return limit;
    }

    /**
     * Définit la limite de découvert.
     * @param limit La nouvelle limite
     */
    public void setLimit(double limit) {
        this.limit = limit;
    }

    /**
     * Affiche les informations du compte courant.
     */
    @Override
    public void displayInfo() {
        System.out.println("  Compte   : " + account);
        System.out.println("  Solde    : " + balance + " €");
        System.out.println("  Limite   : " + limit + " €");
    }
}
