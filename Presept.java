public class Presept extends Hvit{
  protected int rabatt = 108;
  Presept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
    super(legemiddel, utskrivendeLege, pasientId, 3);
  }

  public int prisAaBetale(){
    if (legemiddel.hentPris() >= 108 ){
      return legemiddel.hentPris()- rabatt;
    }
    else{
      return 0; 
    }
  }

}
