import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    List<StringTransformer> tranformers;

    public StringTransformerGroup(List<StringTransformer> tranformers) {
        this.tranformers = tranformers;
    }
    public void execute(StringDrink drink){
        for(StringTransformer transformer: tranformers){
            transformer.execute(drink);
        }
    }
}
