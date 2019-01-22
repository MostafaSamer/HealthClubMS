package Main;

import java.util.Date;

public class Member extends Person {

    //Attribute
    public double height;
    public double weight;
    public Date subscriptionDate;

    //Setter
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setSubscriptionDate(Date subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    //Getter
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public Date getSubscriptionDate() {
        return subscriptionDate;
    }

    //Constructor
    public Member() {

    }
    public Member(String userName, int age, String gender, int id, String hint, String password, double height, double weight, Date subscriptionDate) {
        this.setUserName(userName);
        this.setAge(age);
        this.setGender(gender);
        this.setId(id);
        this.setHint(hint);
        this.setPassword(password);
        this.setHeight(height);
        this.setWeight(weight);
        this.setSubscriptionDate(subscriptionDate);
    }

}
