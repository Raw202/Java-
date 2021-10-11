abstract class Legemiddel{
  static int idTeller = 0;
  protected int id;
  protected String navn;
  protected int pris;
  protected double virkestoff;

  Legemiddel(String navn, int pris, double virkestoff){
    this.navn = navn;
    this.pris = pris;
    this.virkestoff = virkestoff;
    idTeller++;
    this.id = idTeller;

  }

  public String hentNavn(){
    return navn;
  }

  public int hentPris(){
    return pris;
  }

  public double hentVirkestoff(){
    return virkestoff;
  }

  public int hentId(){
    return id;
  }

  public int settNyPris(int nyPris){
    pris = nyPris;
    return nyPris;
  }

  public String toString(){
    return "Navet på legemiddelen er " + navn + " Prisen er " + pris + "\nVirkestoffet er "  + virkestoff + " idTeller er " + id;
  }
}
