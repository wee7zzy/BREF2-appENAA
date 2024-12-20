public class Formateur extends Personne{

    public String specialite;
    private Double salaire;

    public Formateur(String nom, String prenom, String email, int id, String specialite, Double salaire) {
        super(nom, prenom, email, id);
        this.specialite = specialite;
        this.salaire = salaire;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }


    @Override
    public String toString() {
        return  "Formateur : "+
                "Classe: "+getClass()+
                "Nom: " + super.getNom() +
                "Prenom: " + super.getPrenom() +
                "Email: "+super.getEmail()+
                "Id: "+super.getId()+
                "Salaire: "+getSalaire();
    }
}
