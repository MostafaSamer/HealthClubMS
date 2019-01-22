package Main;

public class Coach extends Person{

    public double salary;

    //setter
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Getter
    public double getSalary() {
        return salary;
    }

    //Constructor
    public Coach() {

    }
    public Coach(String userName, int age, String gender, int id, String hint, String password, double salary) {
        this.setUserName(userName);
        this.setAge(age);
        this.setGender(gender);
        this.setId(id);
        this.setHint(hint);
        this.setPassword(password);
        this.setSalary(salary);
    }
}
