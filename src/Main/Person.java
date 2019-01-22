package Main;

import java.util.Date;

public class Person implements ILogin{

    //Attribute
    private String userName;
    private int age;
    private String gender;
    private int id;
    private String hint;
    private String password;

    //Setter
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setHint(String hint) {
        this.hint = hint;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    //Getter
    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public String getHint() {
        return hint;
    }

    public String getPassword() {
        return password;
    }

    //Constructor
    public Person() {

    }
    public Person(String userName, int age, String gender, int id, String hint, String password) {
        this.setUserName(userName);
        this.setAge(age);
        this.setGender(gender);
        this.setId(id);
        this.setHint(hint);
        this.setPassword(password);
    }

    //Methods
    public boolean changePassword(String oldPass, String newPass) {
        if (this.getPassword().equals(oldPass)) {
            this.setPassword(newPass);
            return true;
        } return false;
    }

    @Override
    public boolean Login (int ID, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
