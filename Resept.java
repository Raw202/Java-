abstract class Resept{
  static int idTeller = 0;
  protected Legemiddel legemiddel;
  protected Lege utskrivendeLege;
  protected int pasientId;
  protected int reit;
  protected int id;

  Resept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
    this.legemiddel = legemiddel;
    this.utskrivendeLege = utskrivendeLege;
    this.pasientId = pasientId;
    this.reit = reit;
    idTeller++;
    this.id = idTeller;


  }

  public int hentId(){
    return id;
  }

  public Legemiddel hentLegemiddel(){
    return legemiddel;
  }

  public Lege hentLege(){
    return utskrivendeLege;
  }

  public int hentPasientId(){
    return pasientId;
  }
  public int hentReit(){
    return reit;
  }

  public boolean bruk(){
    if (reit > 0){
      reit = reit -1;
      return true;
    }
    else{
      return false;
    }
  }

  abstract public String farge();
  abstract public int prisAaBetale();

  public String toString(){
    return "ID nummer er " + id  + " " + legemiddel + " legen er " +
    utskrivendeLege + " reiten er " + reit + " pasient id er " + pasientId;
  }
}
