public class Teacher extends Person {
    private String subject;
    private String praatje = "teacher: yes";
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return this.subject;
    }
    public void Gesprek(){
        System.out.println(praatje);
    }

}