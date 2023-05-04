package PaqAlejandra;

public class Main {

    public static void main(String[] args) {
        Port p= new Port();

        Container c= new Container(1, 230, "Spain", "yes", 1, "","","","" );
        Hub h= new Hub();
        System.out.println(h);
        h.stack(c);
        Container c2= new Container(2, 400, "France", "no", 2, "", "", "","");
        h.stack(c2);
        Container c3= new Container(3, 600, "France", "yes", 2, "", "", "","");
        h.stack(c3);
        System.out.println(h);
        h.display(1);
        h.display(2);
        h.display(3);
        h.countCountry("France");
        h.countCountry("Spain");
        Hub2 h2= new Hub2();
        h2.stack(c3);
        System.out.println(h2);




    }

}
