public class Transaction {
    private String typeTransaction;
    private String date;
    private double prix;
    private Propriete propriete;

    public Transaction(String typeTransaction, String date, double prix, Propriete propriete) {
        this.typeTransaction = typeTransaction;
        this.date = date;
        this.prix = prix;
        this.propriete = propriete;
    }

    public String getTypeTransaction() {
        return typeTransaction;
    }

    public String getDate() {
        return date;
    }

    public double getPrix() {
        return prix;
    }

    public Propriete getPropriete() {
        return propriete;
    }
}
