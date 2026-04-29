/**
 * BankAccount - Classe parent représentant un compte bancaire générique.
 * 
 * Contient les attributs de base communs à tous les types de comptes :
 * - account : le numéro ou nom du compte
 * - balance : le solde du compte
 * 
 * @author Etudiant
 * @version 1.0
 */
public class BankAccount {

    // Attribut représentant le numéro/nom du compte
    protected String account;

    // Attribut représentant le solde du compte
    protected double balance;

    /**
     * Constructeur de BankAccount.
     * 
     * @param account Le numéro ou nom du compte
     * @param balance Le solde initial du compte
     */
    public BankAccount(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    // --- Getters et Setters ---

    /**
     * Retourne le numéro du compte.
     * @return account
     */
    public String getAccount() {
        return account;
    }

    /**
     * Définit le numéro du compte.
     * @param account Le nouveau numéro de compte
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Retourne le solde du compte.
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Définit le solde du compte.
     * @param balance Le nouveau solde
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Affiche les informations de base du compte.
     */
    public void displayInfo() {
        System.out.println("  Compte   : " + account);
        System.out.println("  Solde    : " + balance + " €");
    }
}
