public class HumanClient implements Client{
    OrderingStrategy strat;
    HumanClient(OrderingStrategy s){
        this.strat=s;
    }
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strat.wants(drink,recipe,bar);
    }
    public void happyHourStarted(Bar bar) {
    }
    public void happyHourEnded(Bar bar) {

    }
}
