class Joueur{
    int jid;// identifiant du Joueur egale a 1 ou 2
    int nbPions;// nombre de pions qu'il possède et peut donc mettre sur le plateau
    int score;// score du joueur qui sera calculé au fur et a mesure

  public Joueur(int jid, int nbPions){
      this.jid = jid;
      this.nbPions = nbPions;
      this.score = 0;
  }
  
}
