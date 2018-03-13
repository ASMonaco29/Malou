import java.util.ArrayList;
import java.util.Date;

public class Sportif { 
  private String nom;
  private String prenom;
  private String pseudo;
  private Date naissance;
  private Sport sport;
  private ArrayList<Questionnaire> listQ;

  
  public Sportif() {
    super();
    this.nom = null;
    this.prenom = null;
    this.pseudo = null;
    this.naissance = null;
    this.listQ = new ArrayList<Questionnaire>();
  }

  /**
   * Constructeur de la classe Sportif. Elle fait appel aux fonctions seteurs de la classe.
   * 
   * @param nom nom du sportif
   * @param prenom prénom du sportif
   * @param pseudo pseudo du sportif
   * @param date date de naissance du sportif
   * @param sport le sport du sportif
   */
  public static Sportif creerSportif(String nom, String prenom, String pseudo, Date date, Sport sport) {
    Sportif sp = new Sportif();
    
    if (!sp.setNom(nom)) {
      return null;
    }
    
    if (!sp.setPrenom(prenom)) {
      return null;
    }
    
    if(!sp.setPseudo(pseudo)) {
      return null;
    }
    
    if(!sp.setNaissance(date)) {
      return null;
    }
    
    sp.setSport(sport);
    sp.ajouterListQ(new ArrayList<Questionnaire>());
    
    return sp;
  }

  public String getNom() {
    return nom;
  }
  
  /**
   *  Fonction permettent de modifier le nom du Sportif en verifiant que le nouveau nom
   *  est bien un nom.
   * @param nom le nouveau nom du sportif
   * @return
   */
  public boolean setNom(String nom) {
    boolean result = false;
    
    if (verifierString(nom)) {
      nom = nom.toUpperCase();
      this.nom = nom;
      result = true;
    } else if (nom.equals(null)) {
      this.nom = null;
      result = true;
    }
    return result;
  }
  
  public String getPrenom() {
    return prenom;
  }
  
  /**
   * Fonction permettent de modifier le prenom du Sportif.
   * @param prenom le nouveau prenom du sportif
   * @return
   */
  public boolean setPrenom(String prenom) {
    boolean result = false;
    
    if (verifierString(prenom)) {
      prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase();
      this.prenom = prenom;
      result = true;
    } else if (prenom.equals(null)) {
      this.prenom = null;
    }
    return result;
  }

  public String getPseudo() {
    return pseudo;
  }
  
  public boolean setPseudo(String pseudo) {
    boolean result = false;
    
    if (verifierStringPseudo(pseudo)) {
      this.pseudo = pseudo;
      result = true;
    }else {
      result = false;
    }
    return result;
  }

  public Date getNaissance() {
    return naissance;
  }

  /**
   * Fonction de la classe sportifs permettent de modifier la date de naissance du sportif.
   * @param naissance la nouvelle date de naissance du sportif
   * @return 
   */
  @SuppressWarnings("deprecation")
  public boolean setNaissance(Date naissance) {
    boolean verifdate = true;
    Date date = new Date();
    
    if (naissance.getYear() < date.getYear()) {
      
      this.naissance = naissance;
      
    } else if (naissance.getYear() == date.getYear()) {
      
      if (naissance.getMonth() < date.getMonth()) {
        
        this.naissance = naissance;
        
      } else if (naissance.getMonth() == date.getMonth()) {
        if (naissance.getDay() < date.getDay()) {
          
          this.naissance = naissance;
          
        } else if (naissance.getDay() == date.getDay()) {
          this.naissance = naissance;
        }
      }
      
    } else {
      verifdate = false;
    }
    return verifdate;
  }

  public Sport getSport() {
    return sport;
  }

  public void setSport(Sport sport) {
    this.sport = sport;
  }

  @Override
  public String toString() {
    return "Sportifs [nom=" + nom + ", prenom=" + prenom + ", pseudo=" + pseudo + ", "
        + "naissance=" + naissance + ", sport=" + sport + "]";
  }

  @Override
  public boolean equals(Object obj) {
    
    if (this == obj) {
      return true;
    }
    
    if (obj == null) {
      return false;
    }
    
    if (getClass() != obj.getClass()) {
      return false;
    }
    
    Sportif other = (Sportif) obj;
      
    if (naissance == null) {
      if (other.naissance != null) {
        return false;
      }
    } else if (!naissance.equals(other.naissance)) {
      return false;
    }
       
    if (nom == null) {
      if (other.nom != null) {
        return false;
      }
    } else if (!nom.equals(other.nom)) {
      return false;
    }  
     
    if (prenom == null) {
      if (other.prenom != null) {
        return false;
      }
    } else if (!prenom.equals(other.prenom)) {
      return false;
    }
    
         
    if (pseudo == null) {
      if (other.pseudo != null) {
        return false;
      }
    } else if (!pseudo.equals(other.pseudo)) {
      return false;
    }
         
    if (sport != other.sport) {
      return false;
    }
    
    return true;
  }
  
  /**
   *  Fonction permettent de verifier qu'une chaine de caractère n'est pas composé
   *  de numerique ou de caractere spéciaux.
   * @param newString La chaine de caractère à verifier
   * @return
   */
  public boolean verifierString(String newString) {
    boolean result = true;
    for (int i = 0; i < newString.length();i++) {
      char chrNom = newString.charAt(i); //recup le cara
      if (Character.isLetter(chrNom) == true) { //test caractere
        result = true;
      }else if(Character.isSpaceChar(chrNom) == true) {
        result = true;
      }else {
        result = false;
      }
    }
      
    return result;
  }
  
  public boolean verifierStringPseudo(String newString) {
    boolean result = true;
    
    for (int i = 0; i < newString.length();i++) {
      char chrNom = newString.charAt(i); //recup le cara
      if(Character.isSpaceChar(chrNom) == true) {
        result = false;
      }
    }
    
    return result;
  }

  public ArrayList<Questionnaire> getListQ() {
    return listQ;
  }

  public void ajouterListQ(ArrayList<Questionnaire> listQu) {
    this.listQ = listQu;
  }
  
  public void ajouterQuestionnaire(Questionnaire q) {
    this.listQ.add(q);
  }
  
  public void supprimerQuestionnaire(Questionnaire q) {
    this.listQ.remove(q);
  }
  
}