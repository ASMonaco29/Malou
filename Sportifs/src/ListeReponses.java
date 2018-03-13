import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ListeReponses {

  private ArrayList<Reponse> reponses;

  public ListeReponses(ArrayList<Reponse> reponses) {
    super();
    this.reponses = reponses;
  }

  public ArrayList<Reponse> getReponses() {
    return reponses;
  }

  public void setReponses(ArrayList<Reponse> reponses) {
    this.reponses = reponses;
  }
  
  public void ajouterReponse(Reponse r) {
    boolean existe = false;
    Dateweek a = new Dateweek();
    Dateweek b = new Dateweek();
    
    for (Reponse rep : this.reponses) {
      if (rep.getSportif().equals(r.getSportif())) {
        if (rep.getQuestionnaire().equals(r.getQuestionnaire())) {
          if (a.getNumweek(rep.getDate()).equals(b.getNumweek(r.getDate())) ) {
            if (a.getAnnee(rep.getDate()) == (b.getAnnee(r.getDate())) ) {
                existe = true;
            }
          }
        }
      }
    }
    
    if ( existe == true) {
      this.reponses.add(r);
    }
  }
  
  public void supprimerReponse(Reponse r) {
          this.reponses.remove(r);
  }
  
  
  /*
  public ListeReponses() {
    super();
    this.reponses = new ArrayList<Reponse>();
    this.questionnaire = new Questionnaire(null, null, null, null, null, null);
    this.sportif = new Sportif();
  }

  public void addListeReponses(Reponse reponse) {
    this.reponses.add(reponse);
  }
  
  public void removeListeReponses(Reponse reponse) {
    int i=0;
    for(Reponse reponse2 : reponses) {
      if(reponse2==reponse) {
        this.reponses.remove(i);
      }
      i++;
    }  
  }
  
  public Sportif getSportif() {
    return sportif;
  }

  public void setSportif(Sportif sportif) {
    this.sportif = sportif;
  }

  public Questionnaire getQuestionnaire() {
    return questionnaire;
  }

  public void setQuestionnaire(Questionnaire questionnaire) {
    this.questionnaire = questionnaire;
  }

  public ArrayList<Reponse> getReponses() {
    return reponses;
  }

  public void setReponses(ArrayList<Reponse> reponses) {
    this.reponses = reponses;
  }
  */
}
