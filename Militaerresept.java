public class Militaerresept extends Hvit{

  Militaerresept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
    super(legemiddel, utskrivendeLege, pasientId, reit);
  }

  public int prisAaBetale(){
    return 0;
  }

}
