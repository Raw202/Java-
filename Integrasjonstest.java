public class Integrasjonstest {

	public static void main(String[] args) {
    //lager objekter til subklassene av Legemiddel klass
    Narkotisk n = new Narkotisk("paracet", 50, 1000, 20);
    Vanedannende v = new Vanedannende("Vitamin d", 90, 250, 4);
    Vanlig a = new Vanlig("Vitamin C", 70, 200);


    //objekter av klassen Lege

    Lege lege = new Lege("Dr. Sara");
    Spesialist speslege = new Spesialist("Dr. John", "3");

		// Lager objekter til  Resept klasse
    Militaerresept m = new Militaerresept(n, lege , 1, 2);
    Presept p = new Presept(v, speslege , 2, 1);
    Blaa b = new Blaa(a , speslege , 3, 4);
		Hvit h = new Hvit(a, lege ,4,1);



		// Bruker toString for aa skrive ut alle info
		System.out.println("Legen er: ");
		System.out.println(lege.toString());
		System.out.println(" ");



		System.out.println("Speisell legen og kontrollId er: ");
		System.out.println(speslege.toString());
		System.out.println(" ");


		System.out.println("Narkotisk legemiddel er: "); //info om Narkotisk
		System.out.println(n.toString());
		System.out.println(" ");

		System.out.println("Vanedannende legemiddel er: "); //info om Vanedannende
		System.out.println(v.toString());
		System.out.println(" ");


		System.out.println("Vanlig legemiddel er: ");  //info om Vanlig
		System.out.println(a.toString());
		System.out.println(" ");

		System.out.println("MilitaerResept er: "); //info om Militaerresept
		System.out.println(m.toString());
		System.out.println(" ");

		System.out.println("Blaaresepter : ");  //info om Blaaresepter
		System.out.println(b.toString());
		System.out.println(" ");

		System.out.println("PResept er : ");  //info om Presept
		System.out.println(p.toString());
		System.out.println(" ");

		System.out.println("HvitResept er : ");  //info om Hvit
		System.out.println(h.toString());

	}

}
