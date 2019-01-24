public class Parent extends Person {

    public String humeur = "Slecht";
    public String child;

    public void praatje(){
        System.out.println("Ouders: Moeten wij ons zorgen maken?");
    }

    public void setChild (String Child){
        this.child = Child;
    }
    public String getChild(){
        return child;
    }

}