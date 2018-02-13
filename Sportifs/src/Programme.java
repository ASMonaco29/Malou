import java.sql.Date;

public class Programme {
  
  /**
   * Programme du logiciel
   * 
   * @param args args de la fonction
   */
  @SuppressWarnings("deprecation")
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int creerStatut;
    
    ListeSportifs a = new ListeSportifs();
    creerStatut = a.creerSportif("Alleno", "clement", "clementalleno", new Date(05,06,1997), Sport.Cyclisme);
    if(creerStatut == 1) {
      System.out.println("Le sportif existe déjà \n");
    }else if(creerStatut == 2) {
      System.out.println("L'identifiant est déjà utilisé \n");
    }else {
      System.out.println("Le sportif est crée \n");
    }
    
    creerStatut = a.creerSportif("Alleno", "clement", "clementalleno", new Date(05,06,1997), Sport.Cyclisme);
    if(creerStatut == 1) {
      System.out.println("Le sportif existe déjà \n");
    }else if(creerStatut == 2) {
      System.out.println("L'identifiant est déjà utilisé \n");
    }else {
      System.out.println("Le sportif est crée \n");
    }
    
    creerStatut = a.creerSportif("Alleno", "clement", "a5", new Date(05,06,1997), Sport.Cyclisme);
    if(creerStatut == 1) {
      System.out.println("Le sportif existe déjà \n");
    }else if(creerStatut == 2) {
      System.out.println("L'identifiant est déjà utilisé \n");
    }else {
      System.out.println("Le sportif est crée \n");
    }
  }

}
