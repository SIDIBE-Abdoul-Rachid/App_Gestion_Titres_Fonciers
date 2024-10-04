// Import nécessaire pour gérer la date
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Variables pour simuler les propriétés et transactions
        Propriete propriete = null;
        Transaction transaction = null;

        boolean continuer = true;
        while (continuer) {
            System.out.println("\nMenu:");
            System.out.println("1. Ajouter une propriété");
            System.out.println("2. Afficher toutes les propriétés");
            System.out.println("3. Ajouter une transaction");
            System.out.println("4. Afficher toutes les transactions");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();
            scanner.nextLine();  // Consomme la ligne restante

            switch (choix) {
                case 1:
                    System.out.print("Entrez le numéro de titre : ");
                    String numeroTitre = scanner.nextLine();
                    System.out.print("Entrez la superficie : ");
                    double superficie = scanner.nextDouble();
                    scanner.nextLine(); // Consomme la ligne restante
                    System.out.print("Entrez l'emplacement : ");
                    String emplacement = scanner.nextLine();
                    System.out.print("Entrez le nom du propriétaire : ");
                    String nomProprietaire = scanner.nextLine();
                    System.out.print("Entrez l'adresse du propriétaire : ");
                    String adresseProprietaire = scanner.nextLine();

                    // Création du propriétaire
                    Proprietaire proprietaire = new Proprietaire(nomProprietaire, adresseProprietaire);

                    // Création de la propriété
                    propriete = new Propriete(numeroTitre, superficie, emplacement, proprietaire);
                    System.out.println("Propriété ajoutée avec succès !");
                    break;

                case 2:
                    if (propriete != null) {
                        System.out.println("Propriété " + propriete.getNumeroTitre() + " située à " + propriete.getEmplacement() +
                                " avec une superficie de " + propriete.getSuperficie() + " m².");
                    } else {
                        System.out.println("Aucune propriété enregistrée.");
                    }
                    break;

                case 3:
                    if (propriete == null) {
                        System.out.println("Vous devez d'abord ajouter une propriété.");
                        break;
                    }

                    System.out.print("Entrez le type de transaction (vente, donation) : ");
                    String typeTransaction = scanner.nextLine();
                    System.out.print("Entrez la date de transaction (jj/mm/aaaa) : ");
                    String dateTransactionStr = scanner.nextLine();
                    System.out.print("Entrez le prix de la transaction : ");
                    double prix = scanner.nextDouble();
                    scanner.nextLine();  // Consomme la ligne restante

                    try {
                        // Création de la transaction avec 5 paramètres
                        transaction = new Transaction(typeTransaction, dateFormat.parse(dateTransactionStr), prix, propriete, propriete.getProprietaire());
                        System.out.println("Transaction ajoutée avec succès !");
                    } catch (Exception e) {
                        System.out.println("Erreur lors de la création de la transaction : " + e.getMessage());
                    }
                    break;

                case 4:
                    if (transaction != null) {
                        System.out.println(transaction);
                    } else {
                        System.out.println("Aucune transaction enregistrée.");
                    }
                    break;

                case 5:
                    System.out.println("Au revoir !");
                    continuer = false;
                    break;

                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
        scanner.close();
    }
}
