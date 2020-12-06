package associationAggregationAndComposition17;

import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Start17 {

	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Creates Thermodynamics sphere */
        Thermodynamics17 thermodynamics = new Thermodynamics17();
        thermodynamics.name = "Phenomenological Thermodynamics";
       
        /* Creates Discoverers */
        Discoverer17 mendeleevclapeyron = new Discoverer17();
        mendeleevclapeyron.name = "Mendeleev - Clapeyron";
        Discoverer17 hess = new Discoverer17();
        hess.name = "Hess";
        Discoverer17 boltzmann = new Discoverer17();
        boltzmann.name = "Boltzmann";
        Discoverer17 gibbs = new Discoverer17();
        gibbs.name = "Gibbs";
        
        /* Creates Laws */
        ChemicalLaw17 law1 = new ChemicalLaw17();
        law1.discoverer = mendeleevclapeyron;
        law1.Formula = "p.V = n.R.T";
        ChemicalLaw17 law2 = new ChemicalLaw17();
        law2.discoverer = hess;
        law2.Formula = "ΔH = ΔH1 + ΔH2";
        ChemicalLaw17 law3 = new ChemicalLaw17();
        law3.discoverer = boltzmann;
        law3.Formula = "S = Kb.ln(w)";
        ChemicalLaw17 law4 = new ChemicalLaw17();
        law4.discoverer = gibbs;
        law4.Formula = "ΔG = ΔH - T.ΔS";
        
        mendeleevclapeyron.laws = new ArrayList<ChemicalLaw17>(Arrays.asList(law1)); // association
        hess.laws = new ArrayList<ChemicalLaw17>(Arrays.asList(law2)); // association
        boltzmann.laws = new ArrayList<ChemicalLaw17>(Arrays.asList(law3)); // association
        gibbs.laws = new ArrayList<ChemicalLaw17>(Arrays.asList(law4)); // association
        
        /* Put the laws in thermodynamics */
        thermodynamics.laws = new ArrayList<ChemicalLaw17>(Arrays.asList(law1, law2, law3, law4)); // aggregation
        /* Shows thermodynamics laws */
        System.out.println("Rules of: " + thermodynamics.name);
        for (ChemicalLaw17 law : thermodynamics.laws) {
            System.out.println(law.Formula + " " + law.discoverer.name);

        }
    }
}
