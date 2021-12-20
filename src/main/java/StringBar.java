import java.util.ArrayList;

public class StringBar extends Bar{

    public StringBar(){
        inHappyHour = false;

        observers = new ArrayList<BarObserver>();
    }

    public boolean isHappyHour() { return inHappyHour; };

    public void startHappyHour() {
        inHappyHour = true;
        notifyObservers();
    };

    public void endHappyHour() {
        inHappyHour = false;
        notifyObservers();
    };

    public void order(StringDrink drink, StringRecipe recipe){
        recipe.mix(drink);
    }
}
