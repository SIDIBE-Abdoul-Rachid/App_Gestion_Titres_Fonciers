import java.util.Date;

public class Transaction {
    private String type;
    private Date date;
    private double prix;
    private Propriete propriete;
    private Proprietaire proprietaire;

    // Constructeur avec 5 paramètres
    public Transaction(String type, Date date, double prix, Propriete propriete, Proprietaire proprietaire) {
        this.type = type;
        this.date = date;
        this.prix = prix;
        this.propriete = propriete;
        this.proprietaire = proprietaire;  // Nouveau paramètre pour le propriétaire
    }

    // Getters et setters
    public String getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }

    public double getPrix() {
        return prix;
    }

    public Propriete getPropriete() {
        return propriete;
    }

    public Proprietaire getProprietaire() {
        return proprietaire; // Getter pour le propriétaire
    }

    @Override
    public String toString() {
        return "Transaction de type " + type + " pour la propriété " + propriete.getNumeroTitre() +
                " effectuée le " + date + " au prix de " + prix + ".";
    }
}
