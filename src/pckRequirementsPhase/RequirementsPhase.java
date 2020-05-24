package pckRequirementsPhase;

import java.util.Scanner;

public class RequirementsPhase
{
    private Scanner oProduct;

	public RequirementsPhase(){   
    }
    
        public int requirementsProduct(int iProduct){
        
        oProduct = new Scanner(System.in);
        
            
        System.out.println("\nIngresó a la fase de Requerimientos"); 
        
        System.out.println("\n1. Medir documento DER");
        System.out.println("2. Medir documento Manual de Usuario");
        System.out.println("3. Medir documento Plan de Pruebas");
        System.out.println("4. Medir Especificación de requerimiento");
        System.out.println("\nSeleccione un producto a medir: ");
        iProduct = oProduct.nextInt();
            
        MeasurementsManagement oDocument = new MeasurementsManagement();
        MeasurementsManagement oRequirements = new MeasurementsManagement();
        
        switch (iProduct) {
        
        case 1:    
        Product oDER = new DocumentSRS();
        oDocument.callUpon(oDER);
        break;
        
        case 2:
        Product oUserManual = new UserManual();
        oDocument.callUpon(oUserManual); 
        break;
        
        case 3:
        Product oTestPlan = new TestPlan();
        oDocument.callUpon(oTestPlan);
        break;
        
        case 4:
        ProductRequirements oRequirementsSpecification = new Requirements();
        oRequirements.callRequirementsMetric(oRequirementsSpecification);
        break;
        
        default:
        System.out.println("\n No existe la opción");
        break;
        
    }//fin Swtich
    
    return iProduct;
    }//fin mÃ©todo requirementsProduct
    
    
}//fin Class RequierementsPhase
