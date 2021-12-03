import java.util.ArrayList;
import java.util.List;

public class StringRecipe {
    List<StringTransformer> transformers;
    public StringRecipe(List<StringTransformer> transformers) {
        this.transformers=transformers;
    }
    public void mix(StringDrink sd){
        for(StringTransformer transformer: transformers){
            transformer.execute(sd);
        }
    }
}

