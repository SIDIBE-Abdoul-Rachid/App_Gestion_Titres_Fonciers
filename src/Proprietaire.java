import java.util.ArrayList;
import java.util.List;

public class Proprietaire {
    private String nom;
    private String adresse;
    private List<Propriete> proprietes; // Liste des propriétés du propriétaire

    // Constructeur
    public Proprietaire(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        this.proprietes = new ArrayList<>(); // Initialisation de la liste des propriétés
    }

    // Méthode pour ajouter une propriété
    public void ajouterPropriete(Propriete propriete) {
        this.proprietes.add(propriete);
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Propriete> getProprietes() {
        return proprietes;
    }

    public void setProprietes(List<Propriete> proprietes) {
        this.proprietes = proprietes;
    }
}
