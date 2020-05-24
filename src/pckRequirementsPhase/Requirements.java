package pckRequirementsPhase;



public class Requirements extends ProductRequirements
{
    public Requirements(){ 
        System.out.println("\nMeasuring Requirements...");
    }
    
    private void measuringVerbs(){
    System.out.println("1. Measuring Verbs");
    }
    
    private void measuringAdverbs(){
    System.out.println("2. Measuring Adverbs");
    }
    
    private void measuringNegativeWords(){
    System.out.println("3. Measuring Negative Words");
    }
    
    private void measuringRequirements(){
    System.out.println("4. Measuring Requirements");
    }
    
    
    public void measurementsRequirements(){
        measuringVerbs();
        measuringAdverbs();
        measuringNegativeWords();
        measuringRequirements();
    }
}
