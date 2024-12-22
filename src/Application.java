import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        int choix;

        Scanner scanner=new Scanner(System.in);

        ArrayList<Apprenant> apprenant=new ArrayList<>();
        ArrayList<Formateur> formateur=new ArrayList<>();
        ArrayList<Classe> classe=new ArrayList<>();


        do{
            System.out.print("--------MENU PRINCIPALE -------\n"+
                    "1-GERER LES CLASSES \n"+
                    "2-GERER LES FORMATEURS\n"+
                    "3-GERER LES APPRENANTS\n"+
                    "4-QUITTER\n"+
                    "------ENTRER VOTRE CHOIX :");
            choix=scanner.nextInt();

            switch (choix){
                case 1:
                    Classe.menuclasse(classe,formateur,apprenant);
                    break;
                case 2:
                    Formateur.menuformateur(formateur);
                    break;
                case 3:
                    Apprenant.menuApprenant(apprenant);
                    break;
                case 4:
                    System.out.println("au revoir");
                    scanner.close();
                default:
                    System.out.println("choix invalide");
            }
        }while (choix !=4);
    }
}




