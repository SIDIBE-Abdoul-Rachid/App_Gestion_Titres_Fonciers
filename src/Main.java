import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Propriete> proprietes = new ArrayList<>();
        List<Transaction> transactions = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Menu simple pour gérer les propriétés et les transactions
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Ajouter une propriété");
            System.out.println("2. Afficher toutes les propriétés");
            System.out.println("3. Ajouter une transaction");
            System.out.println("4. Afficher toutes les transactions");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la ligne restante

            if (choix == 1) {
                // Créer une nouvelle propriété
                System.out.print("Entrez le numéro de titre : ");
                String numeroTitre = scanner.nextLine();
                System.out.print("Entrez la superficie : ");
                double superficie = scanner.nextDouble();
                scanner.nextLine(); // Consommer la ligne restante
                System.out.print("Entrez l'emplacement : ");
                String emplacement = scanner.nextLine();
                System.out.print("Entrez le nom du propriétaire : ");
                String nomProprietaire = scanner.nextLine();
                System.out.print("Entrez l'adresse du propriétaire : ");
                String adresseProprietaire = scanner.nextLine();

                Proprietaire proprietaire = new Proprietaire(nomProprietaire, adresseProprietaire);
                Propriete propriete = new Propriete(numeroTitre, superficie, emplacement, proprietaire);
                proprietes.add(propriete);
                System.out.println("Propriété ajoutée avec succès !");
            } else if (choix == 2) {
                // Afficher toutes les propriétés
                if (proprietes.isEmpty()) {
                    System.out.println("Aucune propriété enregistrée.");
                } else {
                    for (Propriete propriete : proprietes) {
                        System.out.println("Propriété " + propriete.getNumeroTitre() + " située à " + propriete.getEmplacement() + " avec une superficie de " + propriete.getSuperficie() + " m².");
                    }
                }
            } else if (choix == 3) {
                // Ajouter une transaction
                if (proprietes.isEmpty()) {
                    System.out.println("Aucune propriété disponible pour les transactions.");
                } else {
                    System.out.print("Entrez le numéro de titre de la propriété : ");
                    String numeroTitre = scanner.nextLine();
                    Propriete propriete = null;
                    for (Propriete p : proprietes) {
                        if (p.getNumeroTitre().equals(numeroTitre)) {
                            propriete = p;
                            break;
                        }
                    }
                    if (propriete != null) {
                        System.out.print("Entrez le type de transaction (vente, donation) : ");
                        String typeTransaction = scanner.nextLine();
                        System.out.print("Entrez la date de transaction (jj/mm/aaaa) : ");
                        String date = scanner.nextLine();
                        System.out.print("Entrez le prix de la transaction : ");
                        double prix = scanner.nextDouble();
                        scanner.nextLine(); // Consommer la ligne restante

                        Transaction transaction = new Transaction(typeTransaction, date, prix, propriete);
                        transactions.add(transaction);
                        System.out.println("Transaction ajoutée avec succès !");
                    } else {
                        System.out.println("Propriété non trouvée.");
                    }
                }
            } else if (choix == 4) {
                // Afficher toutes les transactions
                if (transactions.isEmpty()) {
                    System.out.println("Aucune transaction enregistrée.");
                } else {
                    for (Transaction transaction : transactions) {
                        System.out.println("Transaction de type " + transaction.getTypeTransaction() + " pour la propriété " + transaction.getPropriete().getNumeroTitre() + " effectuée le " + transaction.getDate() + " au prix de " + transaction.getPrix() + ".");
                    }
                }
            } else if (choix == 5) {
                System.out.println("Au revoir !");
                break;
            } else {
                System.out.println("Choix non valide, veuillez réessayer.");
            }
        }

        scanner.close();
    }
}
