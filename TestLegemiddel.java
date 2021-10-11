public class TestLegemiddel {
  public static void main (String[] args){
    Narkotisk n = new Narkotisk("paracet", 50, 1000, 20); //faktiske resultater

    System.out.println("Navnet på legemiddelen er " + n.hentNavn());
    System.out.println("Prisen er " + n.hentPris());
    System.out.println("Virkestoffet er " + n.hentVirkestoff());
    System.out.println("Styrken er " + n.hentNarkotiskStyrke());
    System.out.println("Ny pris er " + n.settNyPris(60));
    System.out.println("idTeller er " + n.hentId());

    //forventninger som gir false fordi det er ikke det samme
    System.out.println(testNavn(n.hentNavn(),"Nei"));
    System.out.println(testPris(n.hentPris(),50));
    System.out.println(testVirkestoff(n.hentVirkestoff(),100));
    System.out.println(testStyrke(n.hentNarkotiskStyrke(),10));
    System.out.println(testId(n.hentId(),1));  //gir true



    Vanedannende v = new Vanedannende("Vitamin d", 90, 250, 4); //faktiske resultater

    System.out.println("Navnet på legemiddelen er " + v.hentNavn());
    System.out.println("Prisen er " + v.hentPris());
    System.out.println("Virkestoffet er " + v.hentVirkestoff());
    System.out.println("Styrken er " + v.hentVanedannendeStyrke());
    System.out.println("Ny pris er " + v.settNyPris(100));
    System.out.println("idTeller er " + v.hentId());

    //forventninger som gir true
    System.out.println(testNavn(v.hentNavn(),"Vitamin d"));
    System.out.println(testPris(v.hentPris(),100));
    System.out.println(testVirkestoff(v.hentVirkestoff(),250));
    System.out.println(testStyrke(v.hentVanedannendeStyrke(),4));
    System.out.println(testId(v.hentId(),2));

    Vanlig a = new Vanlig("Vitamin C", 70, 200);  //faktiske resultater

    System.out.println("Navnet på legemiddelen er " + a.hentNavn());
    System.out.println("Prisen er " + a.hentPris());
    System.out.println("Virkestoffet er " + a.hentVirkestoff());
    System.out.println("Ny pris er " + a.settNyPris(80));
    System.out.println("idTeller er " + a.hentId());

//forventninger, prøvde tall som gir både true og false
    System.out.println(testNavn(a.hentNavn(),"Vitamin d"));
    System.out.println(testPris(a.hentPris(),80));
    System.out.println(testVirkestoff(a.hentVirkestoff(),200));
    System.out.println(testId(a.hentId(),3)); //gir true 

    //tester toString metode
    System.out.println(n.toString());
  }




  //her skjekker jeg om faktiske resultater skal gi samme resultater som forventet
  public static boolean testNavn(String realNavn, String forventetNavn){
    return realNavn == forventetNavn;
  }

  public static boolean testPris(int realPris, int forventetPris){
    return realPris == forventetPris;
  }
  public static boolean testVirkestoff(double realVirkestoff, double forventetVirkestoff){
    return realVirkestoff == forventetVirkestoff;
  }
  public static boolean testId(int realId, int forventetId){
    return realId == forventetId;
  }
  public static boolean testStyrke(int realStyrke, int forventetStyrke){
    return realStyrke == forventetStyrke;
  }
}
