import java.util.Date;

public class Sportif { 
  private String nom;
  private String prenom;
  private String pseudo;
  private String motDePasse;
  private Date naissance;
  private Sport sport;

  /**
   * Constructeur sans paramétres de la classe sportif.
   */
  public Sportif() {
    // TODO Auto-generated constructor stub
    super();
    this.nom = null;
    this.prenom = null;
    this.pseudo = null;
    this.naissance = new Date(0);
    this.sport = null;
  }
  
  /**
   * Constructeur avec paramètres le sportif.
   * 
   * @param nom nom du sportif
   * @param prenom prénom du sportif
   * @param pseudo pseudo du sportif
   * @param date date de naissance du sportif
   * @param sport le sport du sportif
   */
  public Sportif(String nom, String prenom, String pseudo, Date date, Sport sport) {
    super();
    
    nom = nom.toUpperCase();
    prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase();
    
    this.nom = nom;
    this.prenom = prenom;
    this.pseudo = pseudo;
    this.naissance = date;
    this.sport = sport;
    this.motDePasse = "";
  }

  public String getNom() {
    return nom;
  }
  
  public void setNom(String nom) {
    nom = nom.toUpperCase();
    this.nom = nom;
  }
  
  public String getPrenom() {
    return prenom;
  }
  
  public void setPrenom(String prenom) {
    prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase();
    this.prenom = prenom;
  }

  public String getPseudo() {
    return pseudo;
  }
  
  public void setPseudo(String pseudo) {
    this.pseudo = pseudo;
  }

  public Date getNaissance() {
    return naissance;
  }

  public void setNaissance(Date naissance) {
    this.naissance = naissance;
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
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((motDePasse == null) ? 0 : motDePasse.hashCode());
    result = prime * result + ((naissance == null) ? 0 : naissance.hashCode());
    result = prime * result + ((nom == null) ? 0 : nom.hashCode());
    result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
    result = prime * result + ((pseudo == null) ? 0 : pseudo.hashCode());
    result = prime * result + ((sport == null) ? 0 : sport.hashCode());
    return result;
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
    if (motDePasse == null) {
      if (other.motDePasse != null) {
        return false;
      }
    } else if (!motDePasse.equals(other.motDePasse)) {
      return false;
    }
      
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
}