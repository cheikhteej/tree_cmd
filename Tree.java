// import java.io.File;

// public class Tree {
    
//     public boolean gotPoint(String filename){
//         for(int i = 0; i < filename.length(); i++){
//             if(filename.charAt(i) == '.'){
//                 return true;
//             }
//         }
//         return false;
//     }

        
//     public void lister() throws Exception{
//         // String path = "C:\\Users\\dell E7470\\Desktop\\jlang\\comparaison\\tcmd";
//         String path = "./";
//         File f = new File(path);
//         File[] listeFichier = f.listFiles();

//         if(listeFichier == null){
//             throw new Exception("erreur path");
//         }
        
//         for(int i = 0 ; i < listeFichier.length; i++){
//             String nomFichier = listeFichier[i].getName();

//             String ext, filename;
//             String type;

//             Dossier d = new Dossier();

//             if(gotPoint(nomFichier) == true){
//                 Fichier f = new Fichier();

//                 ext = nomFichier.substring(nomFichier.lastIndexOf('.'), nomFichier.length());
//                 filename = nomFichier.substring(0,nomFichier.lastIndexOf('.'));
//                 type = "f";
//             }
//             else{
//                 filename = nomFichier;
//                 ext = "";
//                 type = "d";
//             }

//             if(type.equals("f")){

//             }

//             // System.out.println("toString(): "+caracteristique.toString());
//             // System.out.println(filename+ext);
//         }
//     }


//     public static void main(String[] args){

//     }


// }
