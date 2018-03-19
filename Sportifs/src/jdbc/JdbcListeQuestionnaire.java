package jdbc;

import cda.ListeQuestionnaires;
import cda.Questionnaire;

public class JdbcListeQuestionnaire {
  
  private ListeQuestionnaires lqtnrs; 
  
  
  public JdbcListeQuestionnaire() {
    super();
  }

  public ListeQuestionnaires getLqtnrs() {
    return lqtnrs;
  }

  public void initialiserListeQuestionnaireJdbc() {
    this.lqtnrs.reinitialiser();
  }

  public Questionnaire retourneQuestionnaireJdbc(String object) {
    return null;
  }

}
