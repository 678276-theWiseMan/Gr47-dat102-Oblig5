package oppgave2og3uke15;

public class Main {

	public static void main(String[] args) {
		BS_Tre<Integer> t = new BS_Tre<>();
		t.leggTil(5);
		t.leggTil(8);
		t.leggTil(3);
		t.leggTil(0);
		t.leggTil(1);
		t.leggTil(2);
		
		t.visInorden();
		
		t.skrivVerdier(1, 2);
		
		int x = t.getHogde();
		
		System.out.println("a" + x);
		

	}

}
