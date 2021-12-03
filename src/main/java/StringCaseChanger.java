public class StringCaseChanger implements StringTransformer{

    public void execute(StringDrink drink) {
        StringBuilder s = new StringBuilder(drink.getText());
        for(int i = 0; i < s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
                s.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            }
            else if(Character.isUpperCase(s.charAt(i))){
                s.setCharAt(i, Character.toLowerCase(s.charAt(i)));
            }

        }
        drink.setText(s.toString());
    }
    public void undo(StringDrink drink){
        execute(drink);
    }
}
