public class Blaa extends Resept{
  protected double rabatt;
  Blaa(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
    super(legemiddel,utskrivendeLege,pasientId,reit);
  }
  public String farge(){
    return "Blaa";
  }

  public int prisAaBetale(){
    rabatt = legemiddel.hentPris() * 75/100;
    double pris = legemiddel.hentPris() - rabatt;
    return (int) pris; 
  }
}
