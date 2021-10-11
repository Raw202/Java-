public class Vanedannende extends Legemiddel{
  protected int styrke;

  Vanedannende(String navn, int pris, double virkestoff, int styrke){
    super(navn, pris, virkestoff);
    this.styrke = styrke;
  }

  public int hentVanedannendeStyrke(){
    return styrke;
  }
  public String toString(){
    return super.toString() + " styrken er " + styrke; 
  }
}
