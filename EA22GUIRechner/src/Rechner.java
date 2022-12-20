import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rechner extends JFrame implements ActionListener {

    Double zahl1, zahl2, zahl3, summe;
    char operator;
    JTextArea text;
    JRadioButton on, off;
    JButton c, del, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, punkt, gleich, addition, multipilikation, subraktion, division, wurzel, quadrat, einsx;

    public Rechner() {

        text = new JTextArea();
        text.setBounds(15, 30, 255, 40);
        text.setEditable(false);

        on = new JRadioButton("on");
        on.setBounds(10, 80, 40, 30);
        on.setBackground(Color.BLACK);
        on.setForeground(Color.WHITE);
        on.setSelected(true);

        off = new JRadioButton("off");
        off.setBounds(10, 105, 40, 30);
        off.setBackground(Color.BLACK);
        off.setForeground(Color.WHITE);

        ButtonGroup bg = new ButtonGroup();
        bg.add(on);
        bg.add(off);

        c = new JButton("C");
        c.setBackground(Color.RED);
        c.setBounds(75, 90, 60, 40);
        c.setForeground(Color.WHITE);
        c.setFont(new Font("Arial", Font.BOLD, 13));

        del = new JButton("DEL");
        del.setBackground(Color.RED);
        del.setBounds(145, 90, 60, 40);
        del.setForeground(Color.WHITE);
        del.setFont(new Font("Arial", Font.BOLD, 13));

        division = new JButton("/");
        division.setBackground(Color.ORANGE);
        division.setBounds(215, 90, 60, 40);
        division.setFont(new Font("Arial", Font.BOLD, 16));

        wurzel = new JButton("√");
        wurzel.setBackground(Color.WHITE);
        wurzel.setBounds(6, 150, 60, 40);
        wurzel.setFont(new Font("Arial", Font.BOLD, 13));

        quadrat = new JButton("x²");
        quadrat.setBackground(Color.WHITE);
        quadrat.setBounds(75, 150, 60, 40);
        quadrat.setFont(new Font("Arial", Font.BOLD, 13));

        einsx = new JButton("1/x");
        einsx.setBackground(Color.WHITE);
        einsx.setBounds(145, 150, 60, 40);
        einsx.setFont(new Font("Arial", Font.BOLD, 13));

        subraktion = new JButton("-");
        subraktion.setBackground(Color.ORANGE);
        subraktion.setBounds(215, 150, 60, 40);
        subraktion.setFont(new Font("Arial", Font.BOLD, 16));

        b7 = new JButton("7");
        b7.setBackground(Color.WHITE);
        b7.setBounds(6, 200, 60, 40);
        b7.setFont(new Font("Arial", Font.BOLD, 13));

        b8 = new JButton("8");
        b8.setBackground(Color.WHITE);
        b8.setBounds(75, 200, 60, 40);
        b8.setFont(new Font("Arial", Font.BOLD, 13));

        b9 = new JButton("9");
        b9.setBackground(Color.WHITE);
        b9.setBounds(145, 200, 60, 40);
        b9.setFont(new Font("Arial", Font.BOLD, 13));

        multipilikation = new JButton("*");
        multipilikation.setBackground(Color.ORANGE);
        multipilikation.setBounds(215, 200, 60, 40);
        multipilikation.setFont(new Font("Arial", Font.BOLD, 16));

        b4 = new JButton("4");
        b4.setBackground(Color.WHITE);
        b4.setBounds(6, 250, 60, 40);
        b4.setFont(new Font("Arial", Font.BOLD, 13));

        b5 = new JButton("5");
        b5.setBackground(Color.WHITE);
        b5.setBounds(75, 250, 60, 40);
        b5.setFont(new Font("Arial", Font.BOLD, 13));

        b6 = new JButton("6");
        b6.setBackground(Color.WHITE);
        b6.setBounds(145, 250, 60, 40);
        b6.setFont(new Font("Arial", Font.BOLD, 13));

        b4 = new JButton("4");
        b4.setBackground(Color.WHITE);
        b4.setBounds(6, 250, 60, 40);
        b4.setFont(new Font("Arial", Font.BOLD, 13));

        b5 = new JButton("5");
        b5.setBackground(Color.WHITE);
        b5.setBounds(75, 250, 60, 40);
        b5.setFont(new Font("Arial", Font.BOLD, 13));

        b6 = new JButton("6");
        b6.setBackground(Color.WHITE);
        b6.setBounds(145, 250, 60, 40);
        b6.setFont(new Font("Arial", Font.BOLD, 13));

        addition = new JButton("+");
        addition.setBackground(Color.ORANGE);
        addition.setBounds(215, 250, 60, 40);
        addition.setFont(new Font("Arial", Font.BOLD, 16));

        b1 = new JButton("1");
        b1.setBackground(Color.WHITE);
        b1.setBounds(6, 300, 60, 40);
        b1.setFont(new Font("Arial", Font.BOLD, 13));

        b2 = new JButton("2");
        b2.setBackground(Color.WHITE);
        b2.setBounds(75, 300, 60, 40);
        b2.setFont(new Font("Arial", Font.BOLD, 13));

        b3 = new JButton("3");
        b3.setBackground(Color.WHITE);
        b3.setBounds(145, 300, 60, 40);
        b3.setFont(new Font("Arial", Font.BOLD, 13));

        b0 = new JButton("0");
        b0.setBackground(Color.WHITE);
        b0.setBounds(6, 350, 128, 40);
        b0.setFont(new Font("Arial", Font.BOLD, 13));

        punkt = new JButton(".");
        punkt.setBackground(Color.WHITE);
        punkt.setBounds(145, 350, 60, 40);
        punkt.setFont(new Font("Arial", Font.BOLD, 13));

        gleich = new JButton("=");
        gleich.setBackground(Color.ORANGE);
        gleich.setBounds(215, 300, 60, 90);
        gleich.setFont(new Font("Arial", Font.BOLD, 20));

        add(text);
        add(on);
        add(off);
        add(c);
        add(del);
        add(division);
        add(wurzel);
        add(quadrat);
        add(einsx);
        add(subraktion);
        add(b7);
        add(b8);
        add(b9);
        add(multipilikation);
        add(b4);
        add(b5);
        add(b6);
        add(addition);
        add(b1);
        add(b2);
        add(b3);
        add(b0);
        add(punkt);
        add(gleich);
        add(wurzel);
        add(quadrat);
        add(einsx);

        setTitle("Calculator");
        setSize(290, 430);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setDefaultCloseOperation(3);
        setVisible(true);
        setResizable(false);

        on.addActionListener(this);
        off.addActionListener(this);
        c.addActionListener(this);
        del.addActionListener(this);
        division.addActionListener(this);
        subraktion.addActionListener(this);
        addition.addActionListener(this);
        multipilikation.addActionListener(this);
        gleich.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        punkt.addActionListener(this);
        wurzel.addActionListener(this);
        quadrat.addActionListener(this);
        einsx.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == on) {
            enable();
        } else if (e.getSource() == off) {
            disable();
        } else if (e.getSource() == c) {
            text.setText("");
        } else if (e.getSource() == del) {

        } else if (e.getSource() == b1) {
            text.setText(text.getText() + b1.getText());
        } else if (e.getSource() == b2) {
            text.setText(text.getText() + b2.getText());
        } else if (e.getSource() == b3) {
            text.setText(text.getText() + b3.getText());
        } else if (e.getSource() == b4) {
            text.setText(text.getText() + b4.getText());
        } else if (e.getSource() == b5) {
            text.setText(text.getText() + b5.getText());
        } else if (e.getSource() == b6) {
            text.setText(text.getText() + b6.getText());
        } else if (e.getSource() == b7) {
            text.setText(text.getText() + b7.getText());
        } else if (e.getSource() == b8) {
            text.setText(text.getText() + b8.getText());
        } else if (e.getSource() == b9) {
            text.setText(text.getText() + b9.getText());
        } else if (e.getSource() == b0) {
            text.setText(text.getText() + b0.getText());
        } else if (e.getSource() == punkt) {
            text.setText(text.getText() + punkt.getText());
        } else if (e.getSource() == wurzel) {
            try {
                zahl1 = Double.parseDouble(text.getText());
                Double wurzel = Math.sqrt(zahl1);
                text.setText(String.valueOf(wurzel));
            } catch (Exception exception) {
            }
        } else if (e.getSource() == quadrat) {
            try {
                zahl1 = Double.parseDouble(text.getText());
                Double quadrat = Math.pow(zahl1, 2);
                text.setText(String.valueOf(quadrat));
            } catch (Exception exception) {
            }
        } else if (e.getSource() == einsx) {
            try {
                zahl1 = Double.parseDouble(text.getText());
                Double einsx = 1 / zahl1;
                text.setText(String.valueOf(einsx));
            } catch (Exception exception) {
            }
        } else if (e.getSource() == division) {
            try {
                zahl1 = Double.parseDouble(text.getText());
                text.setText("");
                operator = '/';
            } catch (Exception ignored) {
            }
        } else if (e.getSource() == subraktion) {
            try {
                zahl1 = Double.parseDouble(text.getText());
                text.setText("");
                operator = '-';
            } catch (Exception ignored) {
            }
        } else if (e.getSource() == addition) {
            try {
                zahl1 = Double.parseDouble(text.getText());
                text.setText("");
                operator = '+';
            } catch (Exception ignored) {
            }
        } else if (e.getSource() == multipilikation) {
            try {
                zahl1 = Double.parseDouble(text.getText());
                text.setText("");
                operator = '*';
            } catch (Exception ignored) {
            }
        } else if (e.getSource() == gleich) {
            switch (operator) {
                case '/':
                    zahl2 = Double.parseDouble(text.getText());
                    summe = zahl1 / zahl2;
                    text.setText(String.valueOf(summe));
                    break;
                case '-':
                    zahl2 = Double.parseDouble(text.getText());
                    summe = zahl1 - zahl2;
                    text.setText(String.valueOf(summe));
                    break;
                case '+':
                    zahl2 = Double.parseDouble(text.getText());
                    summe = zahl1 + Double.parseDouble(text.getText());
                    text.setText(String.valueOf(summe));
                    break;
                case '*':
                    zahl2 = Double.parseDouble(text.getText());
                    summe = zahl1 * zahl2;
                    text.setText(String.valueOf(summe));
                    break;
            }
        }
    }
}

