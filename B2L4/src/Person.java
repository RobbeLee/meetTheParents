import java.util.ArrayList;
import java.util.Date;

public class Person {
    private String name;
    private Date birthdate;
    private int iq;
    private ArrayList<String> diplomas;
    private String School;
    public Person(){
        diplomas = new ArrayList<String>();
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public Date getBirthdate() {
        return birthdate;
    }
    public void setIq(int iq) {
        this.iq = iq;
    }
    public int getIq() {
        return iq;
    }
    public void addDiploma(String diploma) {
        diplomas.add(diploma);
    }
    public ArrayList<String> getDiplomas() {
        return diplomas;
    }
    public void setSchool( String School){
        this.School = School;
    }
    public String getSchool(){
        return this.School;
    }
}
