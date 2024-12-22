
import java.util.ArrayList;
import java.util.Scanner;
public class Apprenant extends Personne{

    static Scanner scanner=new Scanner(System.in);

    private double notes;
    public ArrayList<Apprenant> apprenants;


    public Apprenant(String nom, String prenom, String email, int id, double notes) {
        super(nom, prenom, email, id);
        this.notes = notes;
    }

    public void setNotes(double notes) {
        this.notes = notes;
    }

    static void menu(){
        System.out.print("----MENU APPRENANT-----\n"+

                "1-AJOUTER\n"+
                "2-SUPPRIMER\n"+
                "3-MODIFIER \n"+
                "4-AFFICHER TOUS\n"+
                "-----entrer votre choix:");
    }
    public static void menuApprenant(ArrayList<Apprenant> apprenants){

        menu();
        int choix = scanner.nextInt();

        switch (choix){
            case 1:
                System.out.print("entrer nom d'apprenant :");
                String nom= scanner.next();
                System.out.print("entrer prenom d'apprenant :");
                String prenom= scanner.next();
                System.out.print("entrer email d'apprenant :");
                String email= scanner.next();
                System.out.print("entrer id d'apprenant :");
                int id= scanner.nextInt();
                System.out.print("entrer note :");
                double note= scanner.nextDouble();
                apprenants.add(new Apprenant(nom,prenom,email,id,note));
                System.out.println("APPRENANT AJOUTER AVEC SUCCES");
                break;
            case 2:
                System.out.print("entrer l ' ID de l'apprenant a supprimer :");
                id=scanner.nextInt();
                apprenants.removeIf(a->a.getId()==id);//expression lambda
                System.out.println("APPRENANT SUPPRIMER AVEC SUCCES");
                break;
            case 3:
                System.out.print("entrer l'id de l'apprenant a modifier :");
                id=scanner.nextInt();

                System.out.print("1-modifier nom\n"+
                        "2-modifier prenom\n"+
                        "3-modifier email\n"+
                        "4-modifier id\n"+
                        "5-modifier note\n"+
                        "---entrer choix:");
                choix= scanner.nextInt();

                for(Apprenant  apprenant : apprenants){
                    if(apprenant.getId()==id){
                        switch (choix){
                            case 1:
                                System.out.print("entrer nouveau nom :");
                                apprenant.setNom(scanner.next());
                                System.out.println("Nom MODIFIER AVEC SUCCES ");
                                break;
                            case 2:
                                System.out.print("entrer nouveau prenom :");
                                apprenant.setPrenom(scanner.next());
                                System.out.println("PRENom MODIFIER AVEC SUCCES ");
                                break;
                            case 3:
                                System.out.print("entrer nouveau email :");
                                apprenant.setEmail(scanner.next());
                                System.out.println("email MODIFIER AVEC SUCCES ");
                                break;
                            case 4:
                                System.out.print("entrer nouvelle id :");
                                apprenant.setId(scanner.nextInt());
                                System.out.println("ID MODIFIER AVEC SUCCES ");
                                break;
                            case 5:
                                System.out.print("entrer nouvelle note :");
                                apprenant.setNotes(scanner.nextDouble());
                                System.out.println("Note MODIFIER AVEC SUCCES ");
                                break;
                        }
                    }
                }break;


        }
