/**
 * SavingsAccount - Compte d'épargne.
 * 
 * Hérite de BankAccount et ajoute un attribut supplémentaire :
 * - interestRate : le taux d'intérêt annuel du compte épargne
 * 
 * @author Etudiant
 * @version 1.0
 */
public class SavingsAccount extends BankAccount {

    // Attribut supplémentaire : taux d'intérêt annuel (en %)
    private double interestRate;

    /**
     * Constructeur de SavingsAccount.
     * 
     * @param account      Le numéro du compte
     * @param balance      Le solde initial
     * @param interestRate Le taux d'intérêt annuel
     */
    public SavingsAccount(String account, double balance, double interestRate) {
        // Appel du constructeur parent BankAccount
        super(account, balance);
        this.interestRate = interestRate;
    }

    // --- Getter et Setter pour interestRate ---

    /**
     * Retourne le taux d'intérêt.
     * @return interestRate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Définit le taux d'intérêt.
     * @param interestRate Le nouveau taux
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * Affiche les informations du compte épargne.
     */
    @Override
    public void displayInfo() {
        System.out.println("  Compte       : " + account);
        System.out.println("  Solde        : " + balance + " €");
        System.out.println("  Taux intérêt : " + interestRate + " %");
    }
}
