import java.util.ArrayList;
import java.util.List;

public class Classe {

    private int id;
    public String nomClasse;
    private Formateur formateur;
    private List<Apprenant> apprenants;

    public Classe(String nomClasse, Formateur formateur, List<Apprenant> apprenants) {
        this.nomClasse = nomClasse;
        this.formateur = formateur;
        this.apprenants = apprenants;
    }


    public Classe(String nomClasse) {
        this.nomClasse = nomClasse;
        this.apprenants = new ArrayList<>();
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public void ajouterApprenant(Apprenant apprenant) {
        apprenants.add(apprenant);
    }

    public void afficherDetails() {
        System.out.println("Classe: " + nomClasse);
        if (formateur != null) {
            System.out.println("Formateur: " + formateur.getNom()+"\t"+formateur.getPrenom());
        } else {
            System.out.println("Aucun formateur assigné.");
        }
        System.out.println("Liste des apprenants:");
        for (Apprenant apprenant : apprenants) {
            System.out.println("  - " + apprenant.getNom());
        }
    }
}