package pckAnalysisAndDesignPhase;


import java.util.Scanner;

public class AnalysisAndDesignPhase
{
   private Scanner oProduct;

public AnalysisAndDesignPhase(){   
    }
    
    public int designProduct(int iProduct){
        
        oProduct = new Scanner(System.in);
        
        System.out.println("Ingreso a fase de Análisis y Diseño");
        
        System.out.println("\n1. Medir documento de Análisis y Diseño");
        System.out.println("2. Medir Casos de Uso");
        System.out.println("3. Medir Diagrama de Clases");
        System.out.println("4. Medir Diagrama de Secuencia");
        System.out.println("5. Medir Diagrama de Estado");
        System.out.println("\nSeleccione un producto a medir: ");
        iProduct = oProduct.nextInt();
        
        DesignMeasurementsManagement oDesignDocumentPhase = new DesignMeasurementsManagement();
        DesignMeasurementsManagement oDesign = new DesignMeasurementsManagement();
        
        switch (iProduct){
            
            case 1:
            DesignDocumentProduct oDesignDocument = new AnalysisAndDesignDocument();
            oDesignDocumentPhase.callMeasurementDocument(oDesignDocument);
            break;
            
            case 2: 
            DesignProduct oUseCase = new UseCase();
            oDesign.callMeasurementDesign(oUseCase);
            break;
            
            case 3:
            DesignProduct oClassDiagram = new ClassDiagram();
            oDesign.callMeasurementDesign(oClassDiagram);
            break;
            
            case 4:
            DesignProduct oSequencDiagram = new SequencDiagram();
            oDesign.callMeasurementDesign(oSequencDiagram);
            break;
            
            case 5:
            DesignProduct oStateDiagram = new StateDiagram();
            oDesign.callMeasurementDesign(oStateDiagram);
            
            default:
            System.out.println("\n No existe la opción");
            break;
        
        }//fin Switch
        
        return iProduct;
    }//fin mÃ©todo designProduct
}//fin Class AnalysisAndDesign
