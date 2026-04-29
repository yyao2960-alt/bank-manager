# 🏦 BankManager — Gestionnaire de Banque

## Description

Application Java illustrant le concept d'**héritage** en programmation orientée objet.  
Le projet modélise un système bancaire avec une classe parent `BankAccount` et trois classes enfants : `CheckingAccount`, `SavingsAccount` et `COD`.

Exercice réalisé dans le cadre du cours **UE Projet Informatique 2**.

---

## 🏗️ Architecture des classes

```
BankAccount  (classe parent)
│   - account : String
│   - balance : double
│
├── CheckingAccount  (compte courant)
│       - limit : double
│
├── SavingsAccount   (compte épargne)
│       - interestRate : double
│
└── COD              (certificat de dépôt)
        - duration : int
```

---

## 🚀 Fonctionnalités

- Classe parent `BankAccount` avec les attributs `account` et `balance`
- 3 classes enfants qui héritent de `BankAccount` via le mot-clé `extends`
- Chaque classe enfant ajoute un attribut spécifique
- Getters et setters pour lire et modifier les attributs
- Méthode `main` dans `BankManager` qui instancie chaque classe et accède aux attributs

---

## 📁 Structure du projet

```
bank-manager/
│
├── src/
│   ├── BankAccount.java       # Classe parent
│   ├── CheckingAccount.java   # Compte courant (hérite de BankAccount)
│   ├── SavingsAccount.java    # Compte épargne (hérite de BankAccount)
│   ├── COD.java               # Certificat de dépôt (hérite de BankAccount)
│   └── BankManager.java       # Classe principale (main)
│
└── README.md
```

---

## ⚙️ Compilation et exécution

### Prérequis
- Java JDK 8 ou supérieur
- Terminal / Invite de commandes

### Étapes

**1. Cloner le dépôt**
```bash
git clone https://github.com/yyao2960-alt/bank-manager.git
cd bank-manager
```

**2. Compiler tous les fichiers**
```bash
javac src/*.java -d out/
```

**3. Exécuter le programme**
```bash
java -cp out BankManager
```

---

## 🖥️ Résultat attendu

```
=== Gestionnaire de Banque - BankManager ===

>> Compte Courant (CheckingAccount) :
  Compte   : CC-001
  Solde    : 1500.0 €
  Limite   : 500.0 €
  [Après modification]
  Compte : CC-001-MODIF
  Solde  : 1800.0 €

>> Compte Épargne (SavingsAccount) :
  Compte       : CE-002
  Solde        : 5000.0 €
  Taux intérêt : 3.5 %
  [Après modification]
  Compte : CE-002-MODIF
  Solde  : 5500.0 €

>> Certificat de Dépôt (COD) :
  Compte   : CD-003
  Montant  : 10000.0 €
  Durée    : 12 mois
  [Après modification]
  Compte : CD-003-MODIF
  Solde  : 10500.0 €

=== Fin du programme ===
```

---

## 🔍 Concepts illustrés

| Concept | Exemple dans le code |
|---|---|
| Héritage | `CheckingAccount extends BankAccount` |
| Constructeur parent | `super(account, balance)` |
| Attribut supplémentaire | `limit`, `interestRate`, `duration` |
| Getter / Setter | `getAccount()`, `setBalance()`, etc. |
| Polymorphisme | `displayInfo()` redéfinie dans chaque classe |

---

## 👤 Auteur

- **Nom :** Votre Nom
- **Cours :** UE Projet Informatique 2
- **Année :** 2025–2026
