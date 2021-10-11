public class TestResept {
  public static void main (String[] args){
    Militaerresept m = new Militaerresept(new Narkotisk("Aclasta", 100, 5, 7), new Lege("Dr. Sara") , 1, 2); //faktiske resultater
    Presept p = new Presept(new Vanedannende("Actos", 150, 30, 4), new Lege("Dr. Josh") , 2, 1);
    Blaa b = new Blaa(new Vanlig("Afipran", 150, 5), new Lege("Dr. Anne") , 3, 4);
    Hvit h = new Hvit(new Narkotisk("etlegemiddel", 70, 1,4), new Lege ("Dr. Mo"),4,1);

    //tester
    System.out.println(testFarge(m.farge(), "hvit"));
    System.out.println(testFarge(p.farge(), "hvit"));
    System.out.println(testFarge(b.farge(), "Blaa"));
    //tester pris
    System.out.println(testPris(m.prisAaBetale(), 0)); // true siden 100% rabatt
    System.out.println(testPris(p.prisAaBetale(), 42)); //true siden pris - 108
    System.out.println(testPris(b.prisAaBetale(), 38)); //true siden 75% rabatt
    //tester ID
    System.out.println(testId(m.hentId(),1));
    System.out.println(testId(p.hentId(),2));
    System.out.println(testId(b.hentId(),3));
    System.out.println(testId(h.hentId(),4));




  }


  public static boolean testFarge(String faktiskFarge, String forventetFarge){
    return faktiskFarge == forventetFarge;
  }
  public static boolean testPris(int faktiskPris, int forventetPris){
    return faktiskPris == forventetPris;
  }
  public static boolean testId(int realId, int forventetId){
    return realId == forventetId;
  }

}
