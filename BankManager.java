/**
 * BankManager - Classe principale du gestionnaire de banque.
 * 
 * Crée une instance de chaque type de compte (CheckingAccount,
 * SavingsAccount, COD), définit et lit leurs attributs account et balance.
 * 
 * @author Etudiant
 * @version 1.0
 */
public class BankManager {

    public static void main(String[] args) {

        System.out.println("=== Gestionnaire de Banque - BankManager ===\n");

        // --- Création d'un compte courant (CheckingAccount) ---
        // account = "CC-001", balance = 1500.0, limit = 500.0
        CheckingAccount checking = new CheckingAccount("CC-001", 1500.0, 500.0);

        System.out.println(">> Compte Courant (CheckingAccount) :");
        checking.displayInfo();

        // Modifier et relire account et balance
        checking.setAccount("CC-001-MODIF");
        checking.setBalance(1800.0);
        System.out.println("  [Après modification]");
        System.out.println("  Compte : " + checking.getAccount());
        System.out.println("  Solde  : " + checking.getBalance() + " €\n");

        // --- Création d'un compte épargne (SavingsAccount) ---
        // account = "CE-002", balance = 5000.0, interestRate = 3.5%
        SavingsAccount savings = new SavingsAccount("CE-002", 5000.0, 3.5);

        System.out.println(">> Compte Épargne (SavingsAccount) :");
        savings.displayInfo();

        // Modifier et relire account et balance
        savings.setAccount("CE-002-MODIF");
        savings.setBalance(5500.0);
        System.out.println("  [Après modification]");
        System.out.println("  Compte : " + savings.getAccount());
        System.out.println("  Solde  : " + savings.getBalance() + " €\n");

        // --- Création d'un certificat de dépôt (COD) ---
        // account = "CD-003", balance = 10000.0, duration = 12 mois
        COD cod = new COD("CD-003", 10000.0, 12);

        System.out.println(">> Certificat de Dépôt (COD) :");
        cod.displayInfo();

        // Modifier et relire account et balance
        cod.setAccount("CD-003-MODIF");
        cod.setBalance(10500.0);
        System.out.println("  [Après modification]");
        System.out.println("  Compte : " + cod.getAccount());
        System.out.println("  Solde  : " + cod.getBalance() + " €\n");

        System.out.println("=== Fin du programme ===");
    }
}
