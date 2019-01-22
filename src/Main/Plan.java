package Main;

public class Plan {

    public double caloriesNumber;
    public String mealDescription;
    public int mealNumber;
    public String number;
    //public int id;

    //Setter
    public void setCaloriesNumber(double caloriesNumber) {
        this.caloriesNumber = caloriesNumber;
    }
    public void setMealDescription(String mealDescription) {
        this.mealDescription = mealDescription;
    }
    public void setMealNumber(int mealNumber) {
        this.mealNumber = mealNumber;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    //Getter
    public double getCaloriesNumber() {
        return caloriesNumber;
    }

    public String getMealDescription() {
        return mealDescription;
    }

    public int getMealNumber() {
        return mealNumber;
    }
    public String getNumber() {
        return number;
    }

    //Constructor
    public Plan() {
    }
    public Plan(double caloriesNumber, String mealDescription, int mealNumber, String number) {
        this.caloriesNumber = caloriesNumber;
        this.mealDescription = mealDescription;
        this.mealNumber = mealNumber;
        this.number = number;
    }

}
