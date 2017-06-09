package Java.sandwich;

public class CheeseSandwich extends Sandwich {

    boolean customerWantsVegetables() {
        return false;
    }

    // This wont execute!!!!
    void addVeggie() {
        System.out.println("Add Veggies");
    }

    void addCheese() {
      System.out.println("Add Cheese");
    }

    void addSauce() {
        System.out.println("Add Sauce");
    }

}
