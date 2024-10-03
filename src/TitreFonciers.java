public class TitreFonciers {
    private String numeroTitre;
    private boolean validite;
    private String droitsAssocies;

    // Constructeur
    public TitreFonciers(String numeroTitre, boolean validite, String droitsAssocies) {
        this.numeroTitre = numeroTitre;
        this.validite = validite;
        this.droitsAssocies = droitsAssocies;
    }

    // Getters et Setters
    public String getNumeroTitre() {
        return numeroTitre;
    }

    public void setNumeroTitre(String numeroTitre) {
        this.numeroTitre = numeroTitre;
    }

    public boolean isValidite() {
        return validite;
    }

    public void setValidite(boolean validite) {
        this.validite = validite;
    }

    public String getDroitsAssocies() {
        return droitsAssocies;
    }

    public void setDroitsAssocies(String droitsAssocies) {
        this.droitsAssocies = droitsAssocies;
    }
}
