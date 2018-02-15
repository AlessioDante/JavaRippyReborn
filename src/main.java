
import java.util.Random;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class main extends Application{

	///+-+-+-+-+-+-+-+-+-+-+-+-
	// Ale SandBox 
	///+-+-+-+-+-+-+-+-+-+-+-+-
	public class Bp_Cnaby {
	//+-+-+- Variabili
		private String m_nome;
		private String[] m_sloganList = {
				"Ps Mangio biscotti gtfo",
				"grrr puzzi", 
				"1,2,3 cacca in culo a te", 
				"Popel Fresser", 
				"Dont mess with cnabo or get the stabbo", 
				" hello there"};	
	//+-+-+- Eventi 	
		Bp_Cnaby saySomething(){
			Random rand = new Random();
			System.out.println("cnaby dice : " + m_sloganList[rand.nextInt(5)]);
			return this;
		}		
		public void setNome(String nome) {
			m_nome = nome;
		}
		public String getNome() {
			return m_nome;
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
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		Canvas canvas = new Canvas(700, 700);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		Bear bear = new Bear();
        bear.draw(gc);
        
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
	}
	
	//+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
	
	public static void main(String[] args) {
		
		Bp_Cnaby CnabyRik = new main().new Bp_Cnaby();
		CnabyRik.setNome("Bobi");
		System.out.println(CnabyRik.getNome());
		
		CnabyRik.saySomething().saySomething().saySomething().saySomething().saySomething();
		
		launch(args);
	}
}
