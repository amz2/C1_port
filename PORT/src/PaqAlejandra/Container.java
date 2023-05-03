package PaqAlejandra;

public class Container {
    private int id;
    private int weight,priority;
    private String countryO, companyS, companyR, description;
    private boolean inspected;


    //constructors
    public Container(int id){
        if(id<0) id=-id;
        this.id=id;
        this.priority=3;
    }

     public Container(int id, int weight, String countryO, String inspected, int priority, String description, String companyS, String companyR){
        this(id);
        this.setWeight(weight);
        this.setCountryO(countryO);
        this.setInspected(inspected);
        this.setPriority(priority);
        this.setDescription(description);
        this.setCompanyS(companyS);
        this.setCompanyR(companyR);
    }


//setter & getter

    public int getId(){
        return id;
    }
    public void setId(int id) {
        if(id<0) id=-id;
        this.id=id;}

    public void setWeight(int weight){ if(weight>0) this.weight=weight;}
    public int getWeight(){
        return weight;
    }

    public void setCountryO(String countryO){ this.countryO=countryO;}
    public String getCountryO(){ return countryO;}

    public void setInspected(String inspected){
        if(inspected=="yes")this.inspected=true;
        else if(inspected=="no")this.inspected=false;
    }
    public boolean isInspected(){return inspected;}

    public void setPriority(int priority){
        if(priority >=1   &&  priority <=3) this.priority=priority;}
    public int getPriority(){ return priority;}

    public void setDescription(String description){ if(description.length()<100)this.description=description;}
    public String getDescription(){ return description;}

    public void setCompanyS(String companyS){ if(companyS.length()<20)this.companyS=companyS;}
    public String getCompanyS(){return companyS;}

    public void setCompanyR(String companyR){ if(companyR.length()<20)this.companyR=companyR;}
    public String getCompanyR(){return companyR;}

    public String toString(){
        String s="";
        s+= "id: " +this.id +"\n";
        if(inspected){
            s+= "inspected\n";}
        else{
            s+= "No inspected\n";}
        return s;
    }

}
