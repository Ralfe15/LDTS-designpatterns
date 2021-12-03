public class StringReplacer implements StringTransformer{
    char replacer;
    char replaced;
    StringReplacer(char replaced, char replacer){
        this.replaced=replaced;
        this.replacer=replacer;

    }
    public void execute(StringDrink drink) {
        StringBuilder s = new StringBuilder(drink.getText());
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == this.replaced) {
                s.setCharAt(i, replacer);
            }
            }
        drink.setText(s.toString());
        }
    public void undo(StringDrink drink){
        StringBuilder s = new StringBuilder(drink.getText());
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == this.replacer) {
                s.setCharAt(i, replaced);
            }
        }
        drink.setText(s.toString());
    }
}

