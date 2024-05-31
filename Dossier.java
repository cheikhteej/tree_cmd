import java.util.ArrayList;

public class Dossier extends Composant{
    ArrayList<Composant> fichiers = new ArrayList<Composant>();


    //constructeurs 
    public Dossier(String nom, int niveau){
        super(nom,niveau);
    }
    public Dossier(String nom, int niveau, String path){
        super(nom,niveau,path);
    }
    public Dossier(){
        // 
    }

    //get files

    public ArrayList<Composant> getFichiers(){
        return this.fichiers;
    }

    public void ajouterFichier(Composant fichier){
        this.fichiers.add(fichier);
    }

    

    @Override
    public void afficher(){
        for(int i = 0; i < this.getNiveau(); i++){
            System.out.printf("%c   ",'\u2502');
        }
        // System.out.printf("%c",'\u251C');
        System.out.printf("%c",'\u251C');
        for(int i = 0; i < 3; i++){
            System.out.print('\u2500');
        }
        System.out.println(" "+this.getNom());
        for(int i = 0; i < fichiers.size()-1; i++){
            fichiers.get(i).afficher();
        }
    }
    @Override
    public void afficherP(char deb){
        
        for(int i = 0; i < this.getNiveau(); i++){
            System.out.printf("%c%3c",'\u2502',' ');//barre vert+espace
        }
        
        System.out.printf("%c",'\u251C');

        for(int i = 0; i < 3; i++){
            System.out.print('\u2500');// tirets
        }
        
        System.out.println(" "+this.getNom());
        
        for(int i = 0; i < fichiers.size()-1; i++){
            fichiers.get(i).afficherP(deb);
        }

        fichiers.get(fichiers.size()-1).afficherP(deb);
    }
}