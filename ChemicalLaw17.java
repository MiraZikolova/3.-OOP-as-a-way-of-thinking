package associationAggregationAndComposition17;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author User
 */
class ChemicalLaw17 {
    String Formula;
    Discoverer17 discoverer;
 
    ArrayList<Consequences17> consequences;


    ChemicalLaw17() {
        consequences = new ArrayList<Consequences17>(Arrays.asList(
            new Consequences17(1),
            new Consequences17(2),
            new Consequences17(3)));
    }
}

// like book