import java.util.ArrayList;
import java.util.Collections;

public class EspritArrayList implements University {

    private ArrayList <Etudiant> listeDesEtudiants ;
    public EspritArrayList(){
        listeDesEtudiants = new ArrayList<Etudiant>();
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {
        this.listeDesEtudiants.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return this.listeDesEtudiants.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant etd : listeDesEtudiants){
            if (etd.getNom().equals(nom)){
                return true;
            }
        }
        return false ;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        this.listeDesEtudiants.remove(e);
    }

    @Override
    public void displayEtudiants() {
        System.out.println(listeDesEtudiants);
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(listeDesEtudiants);
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(listeDesEtudiants,new TriEtudiantParNom());

    }
}
