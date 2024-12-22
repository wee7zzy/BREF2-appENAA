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
    public static void menuclasse(ArrayList<Classe> classes,ArrayList<Formateur> formateurs,ArrayList<Apprenant> apprenants){
        System.out.print("--------MENU CLASSE---------\n"+
                "1-AJOUTER CLASSE \n"+
                "2-MODIFIER\n"+
                "3-SUPPRIMER CLASSE\n"+
                "4-ASSOCIER FORMATEUR A UNE CLASSE \n"+
                "5-ASSOCIER APPRENANT A UNE CLASSE \n"+
                "6-Afficher lES CLASSES \n"+
                "-------ENTRER VOTRE CHOIX:");
        int choix=scanner.nextInt();


}