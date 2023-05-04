package PaqAlejandra;

import javax.swing.*;
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

    public Port() {
        setTitle("PORT");
        setSize(900,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(Port);


        pile.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int ID; ID= Integer.parseInt(id.getText());
                int w; w= Integer.parseInt(weight.getText());
                String ct; ct= (String) country.getSelectedItem();
                String ins; if( inspected.isSelected())ins= "yes";
                else ins= "no";
               int pri=3; if(pri1.isSelected()) pri=1;
               else if(pri2.isSelected()) pri=2;
               else if(pri3.isSelected()) pri=3;
               String desc=""; if(desc.length()<100) desc=description.getText();
               String compS=""; if(compS.length()<20) sender.getText();
               String compR=""; if(compR.length()<20) receiver.getText();
               String check="";
               Container c= new Container(ID, w, ct, ins, pri,desc,compS, compR,check);
               Hub h= new Hub();
               h.stack(c);
               state.setText(h.toString());




                showContainerDescriptionButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int x; x= Integer.parseInt(id.getText());
                       descriptionshow.setText(h.display(x));
                    }
                });



                unpile.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        int y;y= Integer.parseInt(columNumber.getText());
                        h.remove(y);
                        state.setText(h.toString());
                    }
                });

                country2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String ct2; ct2= (String) country2.getSelectedItem();
                        numbercont.setText(h.countCountry(ct2));

                    }
                });


            }
        });



    }





}