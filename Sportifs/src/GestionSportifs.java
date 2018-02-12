import java.util.ArrayList;
import java.util.Date;

public class GestionSportifs {
  
  static ArrayList<Sportif> listeDeSportifs = new ArrayList<Sportif>();
  
  /**
   * Programme du module gestion sportifs.
   * 
   * @param args args de la fonction
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Sportif clementalleno = ajouterSportif("Alleno", "Clement","allenoclement",
        new Date(2000,03,25),Sport.Cyclisme);
    Sportif thomasalleno = new Sportif("Alleno", "Thomas","allenothomas",
        new Date(1998,05,10),Sport.Cyclisme);
    
    
    listeDeSportifs.add(clementalleno);
    listeDeSportifs.add(thomasalleno);
    
  }
  
  static Sportif ajouterSportif(String nom, String prenom, String pseudo, Date d, Sport s) {
    int result = 0;
    
    for(Sportif s1: listeDeSportifs) {
      if(s1.nom.equals(nom) && s1.prenom.equals(prenom) && s1.naissance.equals(d)) {
        System.out.println("Le sportif existe déjà \n");
        result = 1;
      }else if(s1.pseudo.equals(pseudo)) {
        System.out.println("L'identifiant est déjà utiliser \n");
        result = 1;
      }
    }
    
    nom = nom.toUpperCase();
    prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase();
    
    if(result == 0) {
      Sportif sp = new Sportif(nom, prenom,pseudo,d,s);
    }
    
    return result;
  }

}
