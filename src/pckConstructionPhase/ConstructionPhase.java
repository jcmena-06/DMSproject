package pckConstructionPhase;

import java.util.Scanner;

public class ConstructionPhase
{
    private Scanner oProduct;

	public ConstructionPhase(){
    }
    
    public int constructionProduct(int iProduct){
        
        oProduct = new Scanner(System.in);
        
        System.out.println("Ingresó a la fase de Construcción");
        
        System.out.println("\n1. Medir Clase");
        System.out.println("\n2. Medir Total de Clases .java");
        System.out.println("\nSeleccione un producto a medir: ");
        iProduct = oProduct.nextInt();
       
        ConstructionMeasurementsManagement oConstructionProduct = new ConstructionMeasurementsManagement();
        
        switch (iProduct) {
            
            case 1:
            ConstructionProduct oMeasuringClass = new MeasuringClass();
            oConstructionProduct.callMeasuringProduct(oMeasuringClass);
            break;
            
            /*case 2:
            ConstructionProduct oMeasuringTotalClass = new MeasuringClass();
            oConstructionProduct.callMeasuringProduct(oMeasuringTotalClass);
            break;*/
            
            default:
            System.out.println("\n No existe la opción");
            break;
        
        }//fin Switch
        
     return iProduct;
    }//fin mÃ©todo constructionProduct
    
}//fin class ConstructionPhase
