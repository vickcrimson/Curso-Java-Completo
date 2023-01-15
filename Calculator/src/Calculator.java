import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener {
	
	JFrame frame; // Declarando janela
	JTextField textField; // Declarando campo de texto
	JButton[] numberButtons = new JButton[10]; // Declarando botões numéricos
	JButton[] functionButtons = new JButton[9]; // Declarando botões de operações
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, eqButton, delButton, clrButton, negButton;
	JPanel panel;
	
	Font myFont = new Font("Verdana", Font.BOLD,15);
	
	double num1=0,num2=0,result=0;
	char operator;
	
	Calculator(){ // Construtor
		
		frame = new JFrame("Calculadora"); // Criando a janela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Metódo para fechar a janela
		frame.setSize(420, 550); // Tamanho da janela
		frame.setLayout(null); // Sem layout pré definido
		
		textField = new JTextField(); // Chamando um campo de texto
		textField.setBounds(50, 25, 300, 50);
		textField.setFont(myFont);
		textField.setEditable(false); // Proibir que a caixa de texto seja digitável
		
		// \/ Declarando os botões de operadores
		addButton = new JButton ("+");
		subButton = new JButton ("-");
		mulButton = new JButton ("*");
		divButton = new JButton ("/");
		decButton = new JButton (".");
		clrButton = new JButton ("Clear");
		delButton = new JButton ("Del");
		eqButton = new JButton ("=");
		negButton = new JButton ("+/-");
		
		// Chamando os botões de operadores
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = eqButton;
		functionButtons[6] = clrButton;
		functionButtons[7] = delButton;
		functionButtons[8] = negButton;
		
	
		for (int i=0; i < 9; i++) {
			functionButtons[i].addActionListener(this); 
			functionButtons[i].setFont(myFont); // colocando a fonte desejada
			functionButtons[i].setFocusable(false); // tirando o sombreamento do cursor 
		}
		
		
		for (int j=0; j < 10; j++) {
			numberButtons[j] = new JButton(String.valueOf(j));
			numberButtons[j].addActionListener(this);
			numberButtons[j].setFont(myFont);
			numberButtons[j].setFocusable(false);
		}
		
		negButton.setBounds(160,90,80,50);
		delButton.setBounds(50, 90, 80,50);
		clrButton.setBounds(270, 90, 80,50);
		
		panel = new JPanel();
		panel.setBounds(50, 150, 300, 300);
		panel.setLayout(new GridLayout(4,4,10,10));
		panel.setBackground(Color.white);
		
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(divButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(mulButton);
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(subButton);
		panel.add(decButton);
		panel.add(numberButtons[0]);
		panel.add(eqButton);
		panel.add(addButton);
		
			
		// adicionando os botões à janela:
		frame.add(panel);
		frame.add(negButton);
		frame.add(clrButton);
		frame.add(delButton);
		frame.add(textField); // Adicionando o campo de texto à janela 
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 10; i++) {
			if(e.getSource() == numberButtons[i]) {
				textField.setText(textField.getText().concat(String.valueOf(i)));
			}
		}
			
			if(e.getSource() == decButton) {
				textField.setText(textField.getText().concat("."));
			}
			
			if(e.getSource() == addButton) {
				num1 = Double.parseDouble(textField.getText());
				operator = '+';
				textField.setText("");
			}
			
			if(e.getSource() == subButton) {
				num1 = Double.parseDouble(textField.getText());
				operator = '-';
				textField.setText("");
			}
			
			if(e.getSource() == mulButton) {
				num1 = Double.parseDouble(textField.getText());
				operator = '*';
				textField.setText("");
			}
			
			if(e.getSource() == divButton) {
				num1 = Double.parseDouble(textField.getText());
				operator = '/';
				textField.setText("");
			}
			
			if (e.getSource() == eqButton) {
				num2 = Double.parseDouble(textField.getText());
				
				switch(operator) {
				case'+':
					result = num1 + num2;
					break;
					
				case'-':
					result = num1 - num2;
					break;
					
				case'*':
					result = num1 * num2;
					break;
					
				case'/':
					result = num1 / num2;
					break;
				}
				
				textField.setText(String.valueOf(result));
				num1 = result;
			}
			
			if(e.getSource() == clrButton) {
				textField.setText("");
			}
			
			if(e.getSource() == delButton) {
				String delete = textField.getText();
				textField.setText("");
				for(int d = 0; d < delete.length()-1; d++) {
					textField.setText(textField.getText()+delete.charAt(d));
				}
			}
			
			if(e.getSource() == negButton) {
				double temp = Double.parseDouble(textField.getText());
				temp*=-1;
				textField.setText(String.valueOf(temp));
				
			}
		}
	}


