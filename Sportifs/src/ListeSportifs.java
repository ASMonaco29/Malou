import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ListeSportifs {
  private ArrayList<Sportif> listeDeSportifs = new ArrayList<Sportif>();
  
  
  
  public ListeSportifs() {
    super();
    this.listeDeSportifs = new ArrayList<Sportif>();
  }

  public ArrayList<Sportif> getListeDeSportifs() {
    return listeDeSportifs;
  }



  public void setListeDeSportifs(ArrayList<Sportif> listeDeSportifs) {
    this.listeDeSportifs = listeDeSportifs;
  }



  /**
   * Méthode pour créer un sportif et l'ajouter à la liste des Sportifs. La méthode vérifie 
   * que le sportif n'existe pas déjà dans la Liste. 
   * @param nom Le nom du sportif
   * @param prenom Le prenom du sportif
   * @param pseudo Le pseudo du sportif
   * @param date La date de naissance du sportif
   * @param sport Le sport du sportif
   * @return
   */
  @SuppressWarnings("deprecation")
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
      SimpleDateFormat dateN = new SimpleDateFormat("dd/MM/yyyy");
      @SuppressWarnings("unused")
      Date d = null;
      sportif = new Sportif(nom,prenom,pseudo,date,sport);
      listeDeSportifs.add(sportif);
      try {
        d = dateN.parse(date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
      } catch (ParseException e) {
        // TODO Auto-generated catch block
        result = 3;
      }
    }
    
    return result;
  }
  
  /**
   * Fonction de la classe ListeSportifs qui permet de modifier les informations 
   * d'un sportif qui existe déjà.
   * @param nom     le nouveau nom du sportif
   * @param prenom  le nouveau prenom du sportif
   * @param pseudo  le pseudo du sportif (permet de retrouver le sportif à modifier)
   * @param sport   le nouveau sport du sportif
   * @return
   */
  int modifierSportif(String nom, String prenom, String pseudo, Sport sport) {
    int result = 0;
    Sportif sportif1 = null;
    
    for (Sportif s : listeDeSportifs) {
      if (s.getPseudo().equals(pseudo)) {
        sportif1 = s;
        result = 1;
      }
    }
    
    if (result == 1) {
      
      if (nom != null) {
        sportif1.setNom(nom);
      }
      
      if (prenom != null) {
        sportif1.setPrenom(prenom);
      }
      
      if (sport != null) {
        sportif1.setSport(sport);
      }
      
    }
    
    
    return result;
  }
  
  
  int supprimerSportif(String pseudo) {
    int result = 0;
    Sportif sportif1 = null;
    
    for (Sportif s : listeDeSportifs) {
      if (s.getPseudo().equals(pseudo)) {
        sportif1 = s;
      }
    }
    
    if (sportif1 != null) {
      listeDeSportifs.remove(sportif1);
      result = 1;
    }
    
    return result;
  }

  @Override
  public String toString() {
    return "ListeSportifs [listeDeSportifs=" + listeDeSportifs.toString() + "]";
  }
  
  
}
