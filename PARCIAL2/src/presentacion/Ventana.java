package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import logicanegocio.Parcial;

public class Ventana extends JFrame implements ActionListener {

    JTextField txtA, txtB, txtC;
    JButton btnCalcular;
    JLabel lblResultado;

    public Ventana() {
        setTitle("Examen Alejandro Arevalo");
        setSize(380, 210);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel lblA = new JLabel("a:", JLabel.RIGHT);
        lblA.setBounds(130, 10, 50, 35);
        add(lblA);
        txtA = new JTextField();
        txtA.setBounds(190, 10, 170, 35);
        add(txtA);
        JLabel lblB = new JLabel("b:", JLabel.RIGHT);
        lblB.setBounds(130, 55, 50, 35);
        add(lblB);
        txtB = new JTextField();
        txtB.setBounds(190, 55, 170, 35);
        add(txtB);
        JLabel lblC = new JLabel("c:", JLabel.RIGHT);
        lblC.setBounds(130, 100, 50, 35);
        add(lblC);
        txtC = new JTextField();
        txtC.setBounds(190, 100, 170, 35);
        add(txtC);
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(0, 145, 180, 30);
        btnCalcular.addActionListener(this);
        add(btnCalcular);
        lblResultado = new JLabel("");
        lblResultado.setBounds(190, 145, 180, 30);
        add(lblResultado);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double c = Double.parseDouble(txtC.getText());

            Parcial parcial = new Parcial();
            lblResultado.setText(parcial.calcularRaices(a, b, c));

        } catch (NumberFormatException ex) {
            lblResultado.setText("Ingrese solo números");
        }
    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
    }
}