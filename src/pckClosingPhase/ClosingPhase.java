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
        
        System.out.println("Ingres� a la fase de Cierre");
        System.out.println("\n1. Medir documento Manual de Operaci�n");
        System.out.println("\nSeleccione un producto a medir: ");
        iProduct = oProduct.nextInt();
          
        ClosingMeasurementsManagement oClosingProduct = new ClosingMeasurementsManagement();
        
        switch (iProduct){
        
            case 1:
            ClosingProduct oOperationManual = new OperationManual();
            oClosingProduct.callMeasurinOperationManual(oOperationManual);
            break;
            
            default:
            System.out.println("\n No existe la opci�n");
            break;
        }//fin Switch
        return iProduct;
    }//fin método closingProduct
}//fin Class ClosingPhase
