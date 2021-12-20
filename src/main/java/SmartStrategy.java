import java.util.ArrayList;

public class SmartStrategy implements OrderingStrategy{
    ArrayList<StringDrink> drinkList;
    ArrayList<StringRecipe> recipeList;
    SmartStrategy(){
        drinkList=new ArrayList<StringDrink>();
        recipeList = new ArrayList<StringRecipe>();
    }
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if(bar.isHappyHour()){
            bar.order(drink,recipe);
        }
        else{
            drinkList.add(drink);
            recipeList.add(recipe);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for(int i = 0 ; i<recipeList.size();i++){
            bar.order(drinkList.get(i), recipeList.get(i));
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
