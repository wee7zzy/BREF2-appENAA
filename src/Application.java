import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Apprenant> apprenants = new ArrayList<>();
        List<Formateur> formateurs = new ArrayList<>();
        List<Classe> classes = new ArrayList<>();

        while (true) {
            System.out.print("----------MENU------------\n"+
                               "1. Gérer les apprenants\n"+
                               "2. Gérer les formateurs\n"+
                               "3. Gérer les classes\n"+
                               "4. Quitter\n"+
                               "-----------ENTRER VOTRE CHOIX :");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrez le nom de l'apprenant: ");
                    String nomApprenant = scanner.next();
                    System.out.print("Entrez prenom de l' apprenant :");
                    String prenomApprenant = scanner.next();
                    System.out.print("Entrez email de l'appr :");
                    String emailApprenant = scanner.next();
                    System.out.print("Entrez ID de l'appr :");
                    int idApprenant = scanner.nextInt();
                    apprenants.add(new Apprenant(nomApprenant,prenomApprenant,emailApprenant,idApprenant));
                    System.out.println("Apprenant ajouté avec succès.");
                    break;

                case 2:
                    System.out.print("Entrez le nom du formateur: ");
                    String nomFormateur = scanner.next();
                    System.out.print("Entrez le prenom du formateur: ");
                    String prenomFormateur = scanner.next();
                    System.out.print("Entrez email du formateur :");
                    String emailFormateur = scanner.next();
                    System.out.print("Entrez ID du formateur :");
                    int idFormateur = scanner.nextInt();
                    System.out.print("Entrez specialite :");
                    String specialiteFormateur = scanner.next();
                    System.out.print("Entrez salaire :");
                    double salaireFormateur = scanner.nextDouble();

                    formateurs.add(new Formateur(nomFormateur,prenomFormateur,emailFormateur,idFormateur,specialiteFormateur,salaireFormateur));
                    System.out.println("Formateur ajouté avec succès.");
                    break;

                case 3: // Gérer les classes
                    System.out.print("1. Créer une classe\n"+
                                       "2. Associer un formateur à une classe\n"+
                                       "3. Ajouter un apprenant à une classe\n"+
                                       "4. Afficher les détails d'une classe\n"+
                                       "Choisissez une option: ");

                    int choixClasse = scanner.nextInt();

                    switch (choixClasse) {
                        case 1: // Créer une classe
                            System.out.print("Entrez le nom de la classe: ");
                            String nomClasse = scanner.next();
                            classes.add(new Classe(nomClasse));
                            System.out.println("Classe créée avec succès.");
                            break;

                        case 2: // Associer un formateur à une classe
                            if (classes.isEmpty() || formateurs.isEmpty()) {
                                System.out.println("pas disponibles.");
                                break;
                            }
                            System.out.println("Liste des classes disponibles:");
                            for (int i = 0; i < classes.size(); i++) {
                                System.out.println((i + 1) + ". " + classes.get(i).nomClasse);
                            }
                            System.out.print("Choisissez  classe : ");
                            int indexClasse = scanner.nextInt();

                            System.out.println("Liste des formateurs disponibles:");
                            for (int i = 0; i < formateurs.size(); i++) {
                                System.out.println((i + 1) + ". " + formateurs.get(i).getNom()+ "\t"+formateurs.get(i).getPrenom());
                            }
                            System.out.print("Choisissez formateur : ");
                            int indexFormateur = scanner.nextInt();

                            classes.get(indexClasse).setFormateur(formateurs.get(indexFormateur));
                            System.out.println("Formateur associé à la classe avec succès.");
                            break;

                        case 3: // Ajouter un apprenant à une classe
                            if (classes.isEmpty() || apprenants.isEmpty()) {
                                System.out.println("Aucun n'est disponibles.");
                                break;
                            }
                            System.out.println("Liste des classes disponibles:");
                            for (int i = 0; i < classes.size(); i++) {
                                System.out.println((i + 1) + ". " + classes.get(i).nomClasse);
                            }
                            System.out.print("Choisissez classe : ");
                            int indexClasseApprenant = scanner.nextInt();

                            System.out.println("Liste des apprenants disponibles:");
                            for (int i = 0; i < apprenants.size(); i++) {
                                System.out.println((i + 1) + ". " + apprenants.get(i).getNom()+"\t"+apprenants.get(i).getPrenom());
                            }
                            System.out.print("Choisissez apprenant : ");
                            int indexApprenant = scanner.nextInt();

                            classes.get(indexClasseApprenant).ajouterApprenant(apprenants.get(indexApprenant));
                            System.out.println("Apprenant ajouté à la classe avec succès.");
                            break;

                        case 4: // Afficher les détails d'une classe
                            if (classes.isEmpty()) {
                                System.out.println("Aucune classe disponible.");
                                break;
                            }
                            System.out.println("Liste des classes disponibles:");
                            for (int i = 0; i < classes.size(); i++) {
                                System.out.println((i + 1) + ". " + classes.get(i).nomClasse);
                            }
                            System.out.print("Choisissez classe : ");
                            int indexClasseDetails = scanner.nextInt();

                            classes.get(indexClasseDetails).afficherDetails();
                            break;

                        default:
                            System.out.println("choix invalide.");
                            break;
                    }
                    break;

                case 4: // Quitter
                    System.out.println("Merci Au revoir!");
                    scanner.close();

                default:
                    System.out.println("choix invalide.");
                    break;
            }
        }
    }
}
