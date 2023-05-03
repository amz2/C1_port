package PaqAlejandra;

public class Hub {
    protected Container[][] c;

    public Hub(){
        this.c= new Container[10][12];
    }

    public Container[][] getC(){
        return c;
    }
    public void setC(Container[][] c){
        if(c!= null) this.c=c;
    }

    public void stack (Container x){
        if(x!= null){
            int pri=x.getPriority();
            if(pri==1 || pri== 2){
                int colum= pri-1;
                for (int i = c.length-1; i > 0 ; i--) {
                    if(c[i][colum] ==null){
                        c[i][colum]=x;
                        return;
                    }
                }
            }
            else{
                for (int j=2 ; j<c[0].length; j++) {
                    for (int i = c.length-1; i >=0 ; i--) {
                        if(c[i][j]==null){
                            c[i][j]=x;
                            return;
                        }
                    }
                }
            }
        }
    }

    public Container remove(int x){
        if(x<0 && x>=c[0].length) return null;

        for (int i = 0; i < c.length; i++) {
            if(c[i][x] != null){
                Container a= c[i][x];
                c[i][x]=null;
                return a;
            }
        } return null;
    }

    public String display(int id){

        for (int i = (c.length-1); i >=0 ; i--) {
            for (int j = 0; j < c[i].length; j++) {
                if (c[i][j]!=null) {
                    if (c[i][j].getId()==id){
                        System.out.println("\n"+ "Id: " + c[i][j].getId());
                        System.out.println("Weight: " + c[i][j].getWeight());
                        System.out.println("Country of origin: " + c[i][j].getCountryO());
                        System.out.println("Inspection: " + c[i][j].isInspected());
                        System.out.println("Priority: " + c[i][j].getPriority());
                        System.out.println("Description: " + c[i][j].getDescription());
                        System.out.println("Sending company: " + c[i][j].getCompanyS());
                        System.out.println("Receiving company: " + c[i][j].getCompanyR() + "\n");
                    }
                    else {
                        System.out.println("Container doesn't exist");
                    }
                }
            }
        }

        return null;
    }




    public String countCountry(String countryO){
        int co=0;
        for (int i = c.length-1; i>=0; i--) {
            for (int j = 0; j < c[i].length; j++) {
                if(c[i][j]!=null){
                if(c[i][j].getCountryO()==countryO){
                    co++;
            }}}
        }
        System.out.println("Number of containers from " +countryO +": " + co);
        return countryO;
    }

    public String toString(){
        String s= "";

        for (int i = 0; i <c.length ; i++) {
            for (int j = 0; j < c[i].length ;j++) {
                if(c[i][j]==null)
                    s+= "[ N ]";
                else
                    s+="[C."+ c[i][j].getId()+ "]";
            }
            s+= "\n";
        }
        s+= "\n";
        return s;
    }


}
