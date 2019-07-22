package design.patterns.factory.abstraction.model;

import design.patterns.factory.abstraction.factories.HotDrinkFactory;
import org.javatuples.Pair;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HotDrinkMachine {

    private List<Pair<String, HotDrinkFactory>> namedFactories
            = new ArrayList<>();

    //instantiates list of HotDrinkFactory subtypes paired with the subtype's name minus "Factory"
    public HotDrinkMachine() throws Exception {
        Set<Class<? extends HotDrinkFactory>> types =
                new Reflections("design.patterns.factory.abstraction.factories")
                .getSubTypesOf(HotDrinkFactory.class);

        for (Class<? extends HotDrinkFactory> type : types){
            namedFactories.add(new Pair<>(
                    type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance()
            ));
        }
    }

    public HotDrink makeDrink() throws Exception {
        System.out.println("Available drinks: ");

        for(int i = 0; i < namedFactories.size(); i++) {
            Pair<String, HotDrinkFactory> drink = namedFactories.get(i);
            System.out.println("" + i + ": " + drink.getValue0());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String input;
            int i, amount;
            if((input = reader.readLine()) != null
            && (i = Integer.parseInt(input)) >= 0
            && i < namedFactories.size()) {
                System.out.println("Specify amount: ");
                input = reader.readLine();
                if(input != null && (amount = Integer.parseInt(input)) > 0) {
                    return namedFactories.get(i).getValue1().prepare(amount);
                }
            }
            System.out.println("Incorrect input, try again.");
        }
    }
}
