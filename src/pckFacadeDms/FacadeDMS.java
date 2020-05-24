package pckFacadeDms;

import java.util.Scanner;

//import pckRequirementsPhase.RequirementsPhase;
public class FacadeDMS
{
	private Scanner oPhase;
	
    private pckRequirementsPhase.RequirementsPhase requirements;
    private pckAnalysisAndDesignPhase.AnalysisAndDesignPhase analysisAnddesign;
    private pckConstructionPhase.ConstructionPhase construction;
    private pckIntegrationAndTestingPhase.IntegrationAndTestingPhase integrationAndtesting;
    private pckClosingPhase.ClosingPhase closing;
	//private Scanner oPhase;
    
    public FacadeDMS(){
        this.requirements = new pckRequirementsPhase.RequirementsPhase();
        this.analysisAnddesign = new pckAnalysisAndDesignPhase.AnalysisAndDesignPhase();
        this.construction = new pckConstructionPhase.ConstructionPhase();
        this.integrationAndtesting = new pckIntegrationAndTestingPhase.IntegrationAndTestingPhase();
        this.closing = new pckClosingPhase.ClosingPhase();
    }
    
    
    public int selectPhase(int iSelectPhase){
    	oPhase = new Scanner(System.in);
    	
        System.out.println("1. Fase de Requerimientos" +
        				 "\n2. Fase de Análisis y Diseño" +
        				 "\n3. Fase de Construcción" + 
        				 "\n4. Fase de Integración y Pruebas" +
        				 "\n5. Fase de Cierre" + 
        			     "\n\n Seleccione la fase a la que desee ingresar: ");
        				  iSelectPhase = oPhase.nextInt();
             
        switch (iSelectPhase){
        
            case 1:
            requirements.requirementsProduct(1);
            break;
            
            case 2:
            analysisAnddesign.designProduct(2);
            break;
            
            case 3:
            construction.constructionProduct(3);
            break;
            
            case 4:
            integrationAndtesting.integrationAndTestingProduct(4);
            break;
            
            case 5:
            closing.closingProduct(5);
            break;
            
            default:
            System.out.println("Incorrect Phase");
            break;
            
            
        }//fin Switch
        
        return iSelectPhase;
    }//fin método iSelectPhase
}//fin Class
