package CalcInvest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtDepositoMensal;
	private JTextField txtNumMeses;
	private JTextField txtJurosMes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDepositoMensal = new JLabel("Depósito mensal R$:");
		lblDepositoMensal.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDepositoMensal.setBounds(62, 11, 105, 14);
		contentPane.add(lblDepositoMensal);
		
		txtDepositoMensal = new JTextField();
		txtDepositoMensal.setBounds(47, 27, 136, 14);
		contentPane.add(txtDepositoMensal);
		txtDepositoMensal.setColumns(10);
		
		JLabel lblNumMeses = new JLabel("Num. de meses:");
		lblNumMeses.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNumMeses.setBounds(79, 52, 86, 14);
		contentPane.add(lblNumMeses);
		
		txtNumMeses = new JTextField();
		txtNumMeses.setBounds(47, 66, 136, 14);
		contentPane.add(txtNumMeses);
		txtNumMeses.setColumns(10);
		
		JLabel lblJurosMes = new JLabel("Juros ao mês %:");
		lblJurosMes.setFont(new Font("Arial", Font.PLAIN, 11));
		lblJurosMes.setBounds(79, 91, 91, 14);
		contentPane.add(lblJurosMes);
		
		txtJurosMes = new JTextField();
		txtJurosMes.setBounds(47, 107, 136, 14);
		contentPane.add(txtJurosMes);
		txtJurosMes.setColumns(10);
		
		JLabel lblJurosInvestidos = new JLabel("Total investidos + juros R$:");
		lblJurosInvestidos.setFont(new Font("Arial", Font.PLAIN, 11));
		lblJurosInvestidos.setBounds(51, 147, 159, 14);
		contentPane.add(lblJurosInvestidos);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalcular.setBounds(76, 172, 89, 23);
		contentPane.add(btnCalcular);
	}
}
