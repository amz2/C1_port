package PaqAlejandra;

import java.util.Arrays;

public class Hub2  extends Hub{
    private Hub h[]= new Hub[3];

    public Hub2(){
        super();
        h[0]= new Hub();
        h[1]= new Hub();
        h[2]= new Hub();
    }





    public void stack(Container x) {
        super.stack(x);
        if(h[0]!=null) h[1].stack(x);
        if(h[0]!=null && h[1]!=null) h[2].stack(x);
    }



}




