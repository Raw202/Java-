public class Lege{
  protected String navn;

   Lege( String navn){
    this.navn = navn;
  }

  public String hentLege(){
    return navn;
  }

  public String toString(){
    return navn;
  }

}
