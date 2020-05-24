package pckIntegrationAndTestingPhase;

//import java.util.Scanner;

public class Testing extends IntegrationTestingProduct
{
    
	//Constructor
	public Testing(){
		System.out.println("\nIngres� a las mediciones de Testing");
		
    }
	
    
	public double metInsertValuesTestPassed(double dPruebasExitosas, double dPruebasEjecutadas){
		//System.out.println("\nMedici�n de Pruebas Exit�sas");
		
		//Scanner sc = new Scanner(System.in);
		
        double dRetorna=0;
        //double oValor1;
       // double oValor2;
        
        //System.out.println("\nIntroduzca el N�mero de pruebas exit�sas:");
       // oValor1=Double.parseDouble(dPruebasExitosas);
     //   oValor1=sc.nextDouble(dPruebasExitosas);
       

       // System.out.println("\nIntroduzca el N�mero de pruebas ejecutadas:");
       // oValor2=Double.parseDouble(dPruebasEjecutadas);
     //   oValor2=sc.nextDouble(dPruebasEjecutadas);
        
        
        dRetorna=((dPruebasExitosas/dPruebasEjecutadas)*100);
        
       // System.out.println("\nEl Porcentaje de casos de prueba exit�sos es: " +dRetorna);
        return dRetorna;
	}
	
  //Ingreso de valores para la medici�n de Pruebas Fallidos
    public double metInsertTestFailed(double dPruebasFallidas, double dPruebasEjecutadas){
		//System.out.println("\nMedici�n de Pruebas Fallidas");
		double dTotalPruebasFallidas=0;
		/*oValor12 = new Scanner(System.in);
		oValor22 = new Scanner(System.in);*/
		
        /*System.out.println("\nIntroduzca el N�mero de pruebas fallidas:");
        dPruebasFallidas = oValor12.nextInt();

        System.out.println("\nIntroduzca el N�mero de pruebas ejecutadas:");
        dPruebasEjecutadas = oValor22.nextInt();*/

        dTotalPruebasFallidas=((dPruebasFallidas/dPruebasEjecutadas)*100);

        //System.out.println("El Porcentaje de casos de prueba fallidos es: " +dTotalPruebasFallidas);
        return dTotalPruebasFallidas;
	}
    
    
  //Ingreso de valores para la medici�n de Pruebas Bloqueadas
    public double metInsertTestLocked(double dPruebasBloqueadas, double dPruebasEjecutadas){
		//System.out.println("\nMedici�n de Pruebas Bloqueadas");
        double dTotalPruebasBloqueadas=0;
        /*oValor13 = new Scanner(System.in);
		oValor23 = new Scanner(System.in);*/
        
       /* System.out.println("\nIntroduzca el N�mero de pruebas bloqueadas:");
        dPruebasBloqueadas = oValor13.nextInt();

        System.out.println("\nIntroduzca el N�mero de pruebas ejecutadas:");
        dPruebasEjecutadas = oValor23.nextInt();*/

        dTotalPruebasBloqueadas=((dPruebasBloqueadas/dPruebasEjecutadas)*100);

        //System.out.println("\nEl Porcentaje de casos de prueba bloqueados es: " +dTotalPruebasBloqueadas);
        
        return dTotalPruebasBloqueadas;
	}
      
    //Ingreso de valores para la medición de Requerimientos Cubiertos
    public double metInsertRequirementsCovered(double dRequerimientosCubiertos, double dTotalRequerimientos){
		//System.out.println("\nMedici�n del total de Requerimientos cubiertos");
        double dPorcentajeRequerimientosCubiertos=0;
        /*oValor14 = new Scanner(System.in);
		oValor24 = new Scanner(System.in);*/
        
        /*System.out.println("\nIntroduzca el N�mero de requerimientos cubiertos:");
        dRequerimientosCubiertos = oValor14.nextInt();
        
        System.out.println("\nIntroduzca el N�mero Total de requerimientos especificados:");
        dTotalRequerimientos = oValor24.nextInt();*/

        dPorcentajeRequerimientosCubiertos=((dRequerimientosCubiertos/dTotalRequerimientos)*100);

       // System.out.println("El Porcentaje de requerimientos cubiertos es: " +dPorcentajeRequerimientosCubiertos);
        
        return dPorcentajeRequerimientosCubiertos;
	}
    
    
  //Ingreso de valores para la medición de Pruebas Cubiertos
    public double metInsertTestCovered(double dPruebasRealizadas, double dTotalPruebas){
		//System.out.println("\nMedici�n del total de Pruebas cubiertas");
        double dPorcentajePruebasCubiertas=0;
        /*oValor15 = new Scanner(System.in);
		oValor25 = new Scanner(System.in);*/
        
       /* System.out.println("\nIntroduzca el N�mero de pruebas realizadas:");
        dPruebasRealizadas = oValor15.nextInt();*/

        /*System.out.println("\nIntroduzca el N�mero Total de pruebas:");
        dTotalPruebas = oValor25.nextInt();*/

        dPorcentajePruebasCubiertas=((dPruebasRealizadas/dTotalPruebas)*100);

       // System.out.println("\nEl Porcentaje de Pruebas cubiertas es: " +dPorcentajePruebasCubiertas);
        
        return dPorcentajePruebasCubiertas;
	}
     
    
    public void measuringTesting(){
    	metInsertValuesTestPassed(2,3);
    	metInsertTestFailed(1,2);
    	metInsertTestLocked(1,1);
    	metInsertRequirementsCovered(1,1);
    	metInsertTestCovered(1,1);
    }
}
