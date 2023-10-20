// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EspritArrayList espritArrayList = new EspritArrayList();
        Etudiant etd = new Etudiant(1,"zzz","abc");
        Etudiant etd2 = new Etudiant(2,"bbbb","abc");
        Etudiant etd3 = new Etudiant(3,"aaaa","abc");

        espritArrayList.ajouterEtudiant(etd);
        espritArrayList.ajouterEtudiant(etd2);
        espritArrayList.ajouterEtudiant(etd3);

        espritArrayList.displayEtudiants();
        System.out.println(espritArrayList.rechercherEtudiant(etd));

        espritArrayList.displayEtudiants();
        System.out.println(espritArrayList.rechercherEtudiant("zzz"));

        espritArrayList.supprimerEtudiant(etd3);
        espritArrayList.displayEtudiants();

        espritArrayList.trierEtudiantsParId();
        espritArrayList.displayEtudiants();

        espritArrayList.trierEtudiantsParNom();
        espritArrayList.displayEtudiants();




    }
}