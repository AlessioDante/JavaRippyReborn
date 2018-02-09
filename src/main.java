
import java.util.Random;

public class main {

	///+-+-+-+-+-+-+-+-+-+-+-+-
	// Ale SandBox 
	///+-+-+-+-+-+-+-+-+-+-+-+-
	
	//+-+-+- Variabili -+-+-+//
	String[] sloganList = {"Ps Mangio biscotti gtfo","grrr puzzi", "1,2,3 cacca in culo a te", "Polep Fresser", "Dont mess with cnabo or get the stabbo", " hello there"};	
	
	public class Bp_Cnaby {
		private String nome;
		
		Bp_Cnaby saySomething(){
			Random rand = new Random();
			System.out.println("cnaby dice : " + sloganList[rand.nextInt(5)]);
			return this;
		}
		
		public void setNome(String nnome) {
			nome = nnome;
		}
		public String getNome() {
			return nome;
		}
	}
	
	public void ale_hello() {
		System.out.println("im ale");
	}

	///+-+-+-+-+-+-+-+-+-+-+-+-
	// Rik SandBox 
	///+-+-+-+-+-+-+-+-+-+-+-+-
	public void rik_hello() {
		System.out.println("im rik");
		System.out.println("switch from older commit");
	}
	
	//+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
	
	public static void main(String[] args) {
		
		Bp_Cnaby CnabyRik = new main().new Bp_Cnaby();
		CnabyRik.setNome("Bobi");
		System.out.println(CnabyRik.getNome());
		
		CnabyRik.saySomething().saySomething().saySomething().saySomething().saySomething();
	}
}
