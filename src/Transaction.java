import java.util.Date;

public class Transaction {
    private String typeTransaction; // vente, donation, etc.
    private Date dateTransaction;
    private double prix;
    private Propriete propriete;
    private Proprietaire nouveauProprietaire;

    // Constructeur
    public Transaction(String typeTransaction, Date dateTransaction, double prix, Propriete propriete, Proprietaire nouveauProprietaire) {
        this.typeTransaction = typeTransaction;
        this.dateTransaction = dateTransaction;
        this.prix = prix;
        this.propriete = propriete;
        this.nouveauProprietaire = nouveauProprietaire;
    }

    // Getters et Setters
    public String getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(String typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

    public Date getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(Date dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Propriete getPropriete() {
        return propriete;
    }

    public void setPropriete(Propriete propriete) {
        this.propriete = propriete;
    }

    public Proprietaire getNouveauProprietaire() {
        return nouveauProprietaire;
    }

    public void setNouveauProprietaire(Proprietaire nouveauProprietaire) {
        this.nouveauProprietaire = nouveauProprietaire;
    }
}
