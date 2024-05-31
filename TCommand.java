import java.io.File;;
public class TCommand {
    
    public static void getDirs(Dossier parent) throws Exception{
        File f = new File(parent.getPath());
        if(f.exists()){
            File[] listeFichier = f.listFiles();
            if(listeFichier == null){
                throw new Exception("erreur path");
            }
            // parent.afficher();
            for(int i = 0 ; i < listeFichier.length; i++){                
                String filename = listeFichier[i].getName();
                if(listeFichier[i].isDirectory()){  

                    Dossier dir = new Dossier(filename, parent.getNiveau()+1,parent.getPath()+"/"+listeFichier[i].getName());
                    parent.ajouterFichier(dir);
                    //le repertoire fils
                    getDirs(dir);
                }
                else {
                    Fichier file = new Fichier(filename, parent.getNiveau()+1);
                    parent.ajouterFichier(file);
                }
            }
        }
        else{
            throw new Exception("pas un repertoire");
        }
    }

    public static void main(String[] args) throws Exception{

        Dossier d = new Dossier(".",0,".");
        TCommand.getDirs(d);
        d.afficher();
        
    }
}
