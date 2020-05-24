package pckClosingPhase;
//comentari de prueba en la Clase ClosingPhase
import java.util.Scanner;

public class ClosingPhase
{
   private Scanner oProduct;

public ClosingPhase(){
    }
    
    public int closingProduct(int iProduct){
        
        oProduct = new Scanner(System.in);
        
        System.out.println("Ingresó a la fase de Cierre");
        System.out.println("\n1. Medir documento Manual de Operación");
        System.out.println("\nSeleccione un producto a medir: ");
        iProduct = oProduct.nextInt();
          
        ClosingMeasurementsManagement oClosingProduct = new ClosingMeasurementsManagement();
        
        switch (iProduct){
        
            case 1:
            ClosingProduct oOperationManual = new OperationManual();
            oClosingProduct.callMeasurinOperationManual(oOperationManual);
            break;
            
            default:
            System.out.println("\n No existe la opción");
            break;
        }//fin Switch
        return iProduct;
    }//fin mÃ©todo closingProduct
}//fin Class ClosingPhase
