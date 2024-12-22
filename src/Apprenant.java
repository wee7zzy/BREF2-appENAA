
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


}
