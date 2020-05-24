package pckRequirementsPhase;



public class MeasurementsManagement
{
    
   public void callUpon(Product product){
       product.measurements(); 
    }
    
    public void callRequirementsMetric(ProductRequirements productrequirements){
        productrequirements.measurementsRequirements();
    }
}
