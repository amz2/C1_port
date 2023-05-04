package PaqAlejandra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Port extends JFrame {
    private JPanel Port;
    private JComboBox country;
    private JTextField id;
    private JTextField weight;
    private JTextField sender;
    private JTextField receiver;
    private JTextArea description;
    private JButton showContainerDescriptionButton;
    private JButton pile;
    private JButton unpile;
    private JButton numberOfContainersButton;
    private JRadioButton pri1;
    private JRadioButton pri2;
    private JRadioButton pri3;
    private JTextArea descriptionshow;
    private JComboBox country2;
    private JTextField columNumber;
    private JTextField numbercont;
    private JCheckBox inspected;
    private JTextArea state;
    private JButton Check;

    public Port() {
        setTitle("PORT");
        setSize(900,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(Port);
        final int[] ID = {0};
        final int[] w = { 0 };
        final int[] pri = { 0 };
        final String[] ct = {""};
        final String[] ins = { "" };
        final String[] desc = {""};
        String compS="";
        String compR="";
        String check="";
        Hub h= new Hub();

        pile.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                 ID[0] = Integer.parseInt(id.getText());
                w[0] = Integer.parseInt(weight.getText());
             ct[0] = (String) country.getSelectedItem();
                 if( inspected.isSelected()) ins[0] = "yes";
                else ins[0] = "no";
                pri[0] =3; if(pri1.isSelected()) pri[0] =1;
               else if(pri2.isSelected()) pri[0] =2;
               else if(pri3.isSelected()) pri[0] =3;
              if(desc[0].length()<100) desc[0] =description.getText();
             if(compS.length()<20) sender.getText();
              if(compR.length()<20) receiver.getText();

                Container c= new Container(ID[0], w[0], ct[0], ins[0], pri[0], desc[0],compS, compR,check);
               h.stack(c);
               state.setText(h.toString());


            }

        });

                showContainerDescriptionButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                       descriptionshow.setText(h.display( Integer.parseInt(id.getText())));
                    }
                });



                unpile.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        int y;y= Integer.parseInt(columNumber.getText());
                        h.remove(y-1);
                        state.setText(h.toString());
                    }
                });

                numberOfContainersButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String c0= (String) country2.getSelectedItem();
                        numbercont.setText(h.countCountry(c0));
                    }
                });

                Check.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int w; w= Integer.parseInt(weight.getText());

                        JOptionPane.showMessageDialog(null,h.check(w));}


                    }
                );


    }





}