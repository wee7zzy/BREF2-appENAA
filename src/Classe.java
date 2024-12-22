import java.util.ArrayList;
import java.util.Scanner;

public class Classe {

    private int id;
    private String nom;
    private Formateur formateur;
    static ArrayList<Apprenant> apprenants;

    static Scanner scanner=new Scanner(System.in);

    public Classe(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public void setApprenants(ArrayList<Apprenant> apprenants) {
        this.apprenants = apprenants;
    }


}