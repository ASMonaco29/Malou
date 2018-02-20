import java.sql.Date;

public class Programme {
  
  /**
   * Test unitaire du module Sportif.
   * 
   * @param args args de la fonction
   */
  @SuppressWarnings("deprecation")
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int creerStatut;
    
    ListeSportifs a = new ListeSportifs();
    Date dt1 = new Date(1997 - 1900, 8, 6);
    creerStatut = a.creerSportif("Alleno", "clement", "clementalleno", dt1, Sport.Cyclisme);
    if (creerStatut == 1) {
      System.out.println("Le sportif existe déjà \n");
    } else if (creerStatut == 2) {
      System.out.println("L'identifiant est déjà utilisé \n");
    } else {
      System.out.println("Le sportif est crée \n");
    }
    
    creerStatut = a.creerSportif("Alleno", "clement", "clementalleno", null, Sport.Cyclisme);
    if (creerStatut == 1) {
      System.out.println("Le sportif existe déjà \n");
    } else if (creerStatut == 2) {
      System.out.println("L'identifiant est déjà utilisé \n");
    } else {
      System.out.println("Le sportif est crée \n");
    }
    
    Date dt2 = new Date(2019 - 1900, 1, 2);
    creerStatut = a.creerSportif("Alleno", "thomas", "thomasalleno", dt2, Sport.Cyclisme);
    if (creerStatut == 1) {
      System.out.println("Le sportif existe déjà \n");
    } else if (creerStatut == 2) {
      System.out.println("L'identifiant est déjà utilisé \n");
    } else {
      System.out.println("Le sportif est crée \n");
    }
    
    int modifierStatut;
    
    modifierStatut = a.modifierSportif("roger", null, "clementalleno", null);
    if (modifierStatut == 0) {
      System.out.println("Le sportif n'existe pas \n");
    } else {
      System.out.println("Le sportif à été modifié \n");
    }
    
    System.out.println(a.toString());
  }

}
