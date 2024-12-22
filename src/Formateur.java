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

    public static void menuformateur(ArrayList<Formateur> formateurs){
        System.out.print("----MENU FORMATEUR-----\n"+
                "1-AJOUTER FORMATEUR\n"+
                "2-SUPPRIMER\n"+
                "3-MODIFIER \n"+
                "4-AFFICHER TOUS\n"+
                "-----entrer votre choix:");
        int choix = scanner.nextInt();

        switch (choix){
            case 1:
                System.out.print("entrer nom formateur :");
                String nom= scanner.next();
                System.out.print("entrer prenom formateur :");
                String prenom= scanner.next();
                System.out.print("entrer email formateur :");
                String email= scanner.next();
                System.out.print("entrer ID formateur :");
                int id= scanner.nextInt();
                System.out.print("entrer salaire formateur :");
                double salaire= scanner.nextDouble();
                System.out.print("entrer spcialite :");
                String specialite=scanner.next();
                formateurs.add(new Formateur(nom,prenom,email,id,specialite,salaire));
                System.out.println("FORMATEUR AJOUTER AVEC SUCCES");
                break;


}
