public class Hvit extends Resept{
  Hvit(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
    super(legemiddel,utskrivendeLege,pasientId,reit);
  }
  public String farge(){
    return "hvit";
  }

  public int prisAaBetale(){
    return legemiddel.hentPris();
  }
}
