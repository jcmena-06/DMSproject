package pckIntegrationAndTestingPhase;

import java.util.Scanner;

public class IntegrationAndTestingPhase
{
    private Scanner oProduct;

	public IntegrationAndTestingPhase(){
    }
    
    public int integrationAndTestingProduct(int iProduct){
        do {
        oProduct = new Scanner(System.in);
        
        System.out.println("Ingresó a la fase de Integración y Pruebas");
        System.out.println("\n1. Medir documento Manual de Mantenimiento");
        System.out.println("2. Medir Lista de Pruebas");
        System.out.println("\nSeleccione un producto a medir: ");
        iProduct = oProduct.nextInt();
        }while(iProduct<1 && iProduct>2);
       
        TestingMeasurementsManagement oTestingDocument = new TestingMeasurementsManagement();
        TestingMeasurementsManagement oTestingList = new TestingMeasurementsManagement();
        
        switch (iProduct){
        
            case 1: 
            IntegrationTestingDocument oMaintenanceManualDoc = new MaintenanceManual();
            oTestingDocument.callMeasuringMaintenanceManual(oMaintenanceManualDoc);
            break;
            
            case 2:
            IntegrationTestingProduct oTestList = new Testing();
            oTestingList.callMeasuringTest(oTestList);
            break;
            
            default:
            System.out.println("\n No existe la opción");
            break;
        }//fin Switch
        return iProduct;
    }//fin mÃ©todo integrationAndTestingProduct
}//fin Class IntegrationAndTestingPhase
