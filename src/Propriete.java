public class Propriete {
    private String numeroTitre;
    private double superficie;
    private String emplacement;
    private Proprietaire proprietaire; // Référence vers un propriétaire

    // Constructeur
    public Propriete(String numeroTitre, double superficie, String emplacement, Proprietaire proprietaire) {
        this.numeroTitre = numeroTitre;
        this.superficie = superficie;
        this.emplacement = emplacement;
        this.proprietaire = proprietaire;
    }

    // Getters et Setters
    public String getNumeroTitre() {
        return numeroTitre;
    }

    public void setNumeroTitre(String numeroTitre) {
        this.numeroTitre = numeroTitre;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }
}
