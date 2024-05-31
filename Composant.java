public abstract class Composant {

    private String nom;
    private int niveau;
    private String path;

    public Composant(String nom){
        this.nom = nom;
    }
    public Composant(String nom, int niveau){
        this.nom = nom;
        setNiveau(niveau);
    }
    public Composant(String nom, int niveau , String path){
        this.nom = nom;
        setNiveau(niveau);
        this.path = path;
    }
    public Composant(){
        //
    }

    public abstract void afficher();
    public abstract void afficherP(char deb);
    
    //getters


    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public int getNiveau(){
        return this.niveau;
    }
    
    public void setNiveau(int niveau){
        if(niveau > 0){
            this.niveau = niveau;
        }
    }
    public String getPath(){
        return this.path;
    }
    public void setPath(String path){
        this.path = path;
    }

}
