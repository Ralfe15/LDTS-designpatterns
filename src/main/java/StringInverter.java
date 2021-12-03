public class StringInverter implements StringTransformer{
    public void execute(StringDrink drink) {
        StringBuilder tmp = new StringBuilder(drink.getText());
        tmp.reverse();
        drink.setText(tmp.toString());
    }
    public void undo(StringDrink drink){
        execute(drink);
    }
}
