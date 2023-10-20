import java.util.Comparator;

public class Etudiant implements Comparable<Etudiant> {
    private int id;
    private String nom,prenom;
    public Etudiant (){

    }
    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }



    @Override
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null) return false;
        if(obj.getClass()!=this.getClass())
            return false;

        Etudiant etd=(Etudiant) obj;
        if(etd.id==id )
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public int compareTo(Etudiant o) {
        return this.id-o.getId();
    }
}
