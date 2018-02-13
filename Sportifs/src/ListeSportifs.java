import java.util.ArrayList;
import java.util.Date;

public class ListeSportifs {
  private ArrayList<Sportif> listeDeSportifs = new ArrayList<Sportif>();
  
  
  
  public ListeSportifs() {
    super();
    this.listeDeSportifs = new ArrayList<Sportif>();
  }

  int creerSportif(String nom, String prenom, String pseudo, Date date, Sport sport) {
    int result = 0;
    Sportif sportif;
    
    for (Sportif s1: listeDeSportifs) {
      
      if (s1.getNom().equals(nom) && s1.getPrenom().equals(prenom) 
          && s1.getNaissance().equals(date)) {
        
        result = 1;
      } else if (s1.getPseudo().equals(pseudo)) {
        
        result = 2;
      }
    }
    
    if (result == 0) {
      
      sportif = new Sportif(nom,prenom,pseudo,date,sport);
      listeDeSportifs.add(sportif);
    }
    
    return result;
  }
  
  int modifierSportif(String nom, String prenom, String pseudo, Date date, Sport sport) {
    int result = 0;
    
    
    
    return result;
  }
}
