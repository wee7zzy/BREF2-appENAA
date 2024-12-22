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
            case 2:
                System.out.print("entrer l'id du formateur a supprimer :");
                id= scanner.nextInt();
                formateurs.removeIf(a->a.getId()==id);//expression lambda
                System.out.println("SUPPRESSION DU FORMATEUR AVEC SUCCES");
                break;
            case 3:
                System.out.print("entrer l'id du formateur a modifier :");
                id= scanner.nextInt();

                System.out.print("1-modifier nom\n"+
                        "2-modifier prenom\n"+
                        "3-modifier email\n"+
                        "4-modifier id\n"+
                        "5-modifier salaire\n"+
                        "---entrer choix:");
                choix= scanner.nextInt();
                for(Formateur formateur : formateurs){
                    if(formateur.getId()==id){
                        switch (choix){
                            case 1:
                                System.out.print("entrer nouveau nom :");
                                formateur.setNom(scanner.next());
                                System.out.println("Nom MODIFIER AVEC SUCCES ");
                                break;
                            case 2:
                                System.out.print("entrer nouveau prenom :");
                                formateur.setPrenom(scanner.next());
                                System.out.println("PRENom MODIFIER AVEC SUCCES ");
                                break;
                            case 3:
                                System.out.print("entrer nouveau email :");
                                formateur.setEmail(scanner.next());
                                System.out.println("email MODIFIER AVEC SUCCES ");
                                break;
                            case 4:
                                System.out.print("entrer nouvelle id :");
                                formateur.setId(scanner.nextInt());
                                System.out.println("ID MODIFIER AVEC SUCCES ");
                                break;
                            case 5:
                                System.out.print("entrer nouveau salaire :");
                                formateur.setSalaire(scanner.nextDouble());
                                System.out.println("salaire MODIFIER AVEC SUCCES ");
                                break;
                        }
                    }
                }break;
            case 4:
                System.out.println("------LISTE FORMATEUR------");
                for(Formateur formateur : formateurs){
                    System.out.println(formateur.getNom()+"\t"+formateur.getPrenom()+"\t"+formateur.getId()+"\t"+formateur.getEmail()+"\t"+ formateur.getSalaire());
                }
                break;

            default:
                System.out.println("choix invalide ressayer");
        }


    }


}
