public class Employer {
    String FIO;
    String position;
    String mail;
    int phone_number;
    int salary;
    int age;

    public Employer(String FIO,String position,String mail,int phone_number,int salary,int age){
        this.FIO=FIO;
        this.position=position;
        this.mail=mail;
        this.phone_number=phone_number;
        this.salary=salary;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "FIO='" + FIO + '\'' +
                ", position='" + position + '\'' +
                ", mail='" + mail + '\'' +
                ", phone_number=" + phone_number +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
