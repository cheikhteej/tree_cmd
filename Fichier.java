public class Fichier extends Composant{
    // private String type;

    //constructeurs

    public Fichier(String nom){
        super(nom);
    }

    public Fichier(String nom, int niveau){
        super(nom, niveau);
    }
    

    @Override
    public void afficher(){
        for(int i = 0; i < this.getNiveau(); i++){
            System.out.printf("%c%3c",'\u2502',' ');
        }
        System.out.printf("%c",'\u251C');
        for(int i = 0; i < 3; i++){
            System.out.print('\u2500');
        }
        System.out.printf(" %s\n",this.getNom());
    }

    // caractere de debut '\u2502'
    @Override
    public void afficherP(char deb){
        for(int i = 0; i < this.getNiveau(); i++){
            System.out.printf("%c%3c",'\u2502',' ');
        }
        
        System.out.printf("%c",'\u251C');

        for(int i = 0; i < 3; i++){
            System.out.print('\u2500');
        }

        System.out.printf(" %s\n",this.getNom());
    }
}
