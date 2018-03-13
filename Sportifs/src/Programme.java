import java.sql.Date;

public class Programme {
  
  /**
   * Test unitaire du module Sportif.
   * 
   * @param args args de la fonction
   */
  @SuppressWarnings("deprecation")
  public static void main(String[] args) {
    
    int creerStatut;
    
    ListeSportifs a = new ListeSportifs();
    creerStatut = a.creerSportif("alleno", "clement", "clement alleno", new Date( 1997 - 1900, 8, 6), Sport.Cyclisme);
    if (creerStatut == 1) {
      System.out.println("Le sportif existe déjà \n");
    } else if (creerStatut == 2) {
      System.out.println("L'identifiant est déjà utilisé \n");
    } else if ( creerStatut == 3 ){
      System.out.println("Le sportif ne peut pas etre crée. Le nom, le pseudo, le prenom ou la date n'est pas correct.");
    } else {
      System.out.println("Le sportif est crée \n");
    }
    
    /**creerStatut = a.creerSportif("Alleno", "clement", "clementalleno", null, Sport.Cyclisme);
    if (creerStatut == 1) {
      System.out.println("Le sportif existe déjà \n");
    } else if (creerStatut == 2) {
      System.out.println("L'identifiant est déjà utilisé \n");
    } else if ( creerStatut == 3 ){
      System.out.println("Le sportif ne peut pas etre crée, le nom, le prenom ou la date n'est pas correct.");
    } else {
      System.out.println("Le sportif est crée \n");
    }
    
    Date dt2 = new Date(2010  - 1900, 1, 2);
    creerStatut = a.creerSportif("alleno", "clement", "clementalleno", new Date( 2997 - 1900, 8, 6), Sport.Cyclisme);
    if (creerStatut == 1) {
      System.out.println("Le sportif existe déjà \n");
    } else if (creerStatut == 2) {
      System.out.println("L'identifiant est déjà utilisé \n");
    } else if ( creerStatut == 3 ){
      System.out.println("Le sportif ne peut pas etre crée, le nom, le prenom ou la date n'est pas correct.");
    } else {
      System.out.println("Le sportif est crée \n");
    }
    
    int modifierStatut;
    
    modifierStatut = a.modifierSportif("roger", null, "clementalleno", dt2, null);
    if (modifierStatut == 0) {
      System.out.println("Le sportif n'existe pas \n");
    } else {
      System.out.println("Le sportif à été modifié \n");
    }**/
    
    System.out.println(a.toString());
  }

}
