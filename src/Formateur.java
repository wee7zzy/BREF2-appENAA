import java.util.ArrayList;
import java.util.Scanner;

public class Formateur extends Personne{

    static Scanner scanner=new Scanner(System.in);


    private String specialite;
    private Double salaire;
    private Classe classe;

    public Formateur(String nom, String prenom, String email, int id, String specialite, Double salaire) {
        super(nom, prenom, email, id);
        this.specialite = specialite;
        this.salaire = salaire;
        this.classe = classe;
    }


    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }


}
