public class Spesialist extends Lege implements Godkjenningsfritak{
  protected String kontrollId;

  Spesialist(String navn, String kontrollId){
    super(navn);
    this.kontrollId = kontrollId;
  }
    public String hentKontrollID() {
      return kontrollId;
  }

  public String toString(){
    return navn + " KontrolID er: " + kontrollId;
  }
}
