import javax.swing.*;


public class Main {

	public static void main(String[] args) {
	
		JFrame janela = new JFrame("Meu primeiro frame");
		Panel myPanel = new Panel();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.add(myPanel);
		janela.setSize(250, 350);
		janela.setVisible(true);

	}

}
