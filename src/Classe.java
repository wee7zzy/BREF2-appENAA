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

        switch (choix){
            case 1:
                System.out.print("entrer id de classe :");
                int id= scanner.nextInt();
                System.out.print("entre nom de classe :");
                String nom=scanner.next();
                classes.add(new Classe(id,nom));
                System.out.println("classe ajouter avec succes");
                break;
            case 2:
                System.out.print("entrer l'id de classe a modifier :");
                id=scanner.nextInt();

                System.out.print("1-modifier nom\n"+
                        "2-modifier id\n"+
                        "---entrer choix:");
                choix= scanner.nextInt();

                for(Classe  classe : classes) {
                    if (classe.getId()== id) {
                        switch (choix) {
                            case 1:
                                System.out.print("entrer nouveau nom :");
                                classe.setNom(scanner.next());
                                System.out.println("Nom MODIFIER AVEC SUCCES ");
                                break;
                            case 2:
                                System.out.print("entrer nouvelle ID :");
                                classe.setId(scanner.nextInt());
                                System.out.println("ID MODIFIER AVEC SUCCES ");
                                break;
                        }
                    }
                }
                break;
            case 3:
                System.out.print("entrer l'id de classe a supprimer :");
                int idsp=scanner.nextInt();
                classes.removeIf(a->a.getId()==idsp);
                System.out.print("classe supprimer avec succes ");
                break;
            case 4:
                System.out.print("entrer id de classe choisie :");
                id= scanner.nextInt();
                Classe classe =classes.stream().filter(a->a.getId()==id).findFirst().orElse(null);
                if(classe!=null){
                    System.out.print("entrer id du formateur :");
                    int idFormateur= scanner.nextInt();
                    Formateur formateur=formateurs.stream().filter(a->a.getId()==idFormateur).findFirst().orElse(null);
                    if( formateur!=null){
                        classe.setFormateur(formateur);
                        System.out.println("formateur assigner a la classe avec succes");
                    }else {
                        System.out.println("formateur introuvelble");
                    }
                }else {
                    System.out.println("classe introuvable");
                }
                break;
            case 5:
                System.out.print("entrer l'id de la classe :");
                int idc= scanner.nextInt();
                Classe classe1=classes.stream().filter(c->c.getId()==idc).findFirst().orElse(null);
                if(classe1!=null){
                    System.out.print("entrer id apprenant :");
                    int idApp= scanner.nextInt();
                    Apprenant apprenant=apprenants.stream().filter(a->a.getId()==idApp).findFirst().orElse(null);
                    if(apprenant!=null){
                        classe1.setApprenants(apprenants);
                        System.out.println("apprenant ajouter a la classe avec succes");
                    }else {
                        System.out.println("apprenant introuvable");
                    }
                }else System.out.println("classe intouovable");
                break;



        }