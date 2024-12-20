import java.util.ArrayList;

public class Apprenant extends Personne{

    Classe classe;
    private ArrayList<Double> notes;

    public Apprenant(String nom, String prenom, String email, int id) {
        super(nom, prenom, email, id);
       // this.classe = classe;
       // this.notes = notes;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public ArrayList<Double> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Double> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return  "Apprenant : "+
                "Classe: "+super.getClass()+
                "Nom: " + super.getNom() +
                "Prenom: " + super.getPrenom() +
                "Email: "+super.getEmail()+
                "Id: "+super.getId()+
                "Notes: "+getNotes();
    }
}
