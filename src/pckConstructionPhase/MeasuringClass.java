package pckConstructionPhase;

import java.lang.reflect.*;
//import java.util.Scanner;
import java.io.*;

public class MeasuringClass extends ConstructionProduct
{
    private LineNumberReader lnr;

	public MeasuringClass(){
        System.out.println("\n Measuring Class...");
    }
    
    public double metricCountLines(String sProject, String sPackage, String sClass){
        System.out.println("\nAplicando métrica Midiendo total de líneas de código");
        double dCodeLines=0;
        /*Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese el nombre del Proyecto: ");
        String sProjectName = sc.nextLine();
        System.out.println("\nIngrese el nombre del Paquete: ");
        String sPackageName = sc.nextLine();
        System.out.println("\nIngrese el nombre de la clase sin la extensión .java: ");
        String sClassName = sc.nextLine();*/
        
        File oFile = new File("C:/Users/ph4rr3l/workspace/"+sProject+"/src/"+sPackage+"/"+sClass+".java");
       // File oFile = new File("C:/Users/ph4rr3l/workspace/"+sProjectName+"/src/"+sPackageName+"/"+sClassName+".java");
       // File oFile = new File(Ruta);
		try{
			FileReader fr = new FileReader(oFile);
			lnr = new LineNumberReader(fr);
			lnr.skip(Long.MAX_VALUE);
			//System.out.println("El número total de líneas de código en la clase "+sClassName+".java es: " + lnr.getLineNumber());
			//dCodeLines=lnr.getLineNumber();
		}catch (IOException e){
			e.printStackTrace();
		}
		dCodeLines = lnr.getLineNumber();
		//sc.close();
		return dCodeLines;
    }//cierre método countLines
    
    public double metricCountMethods(String sPackage, String sClass) {
    	
        System.out.println("\nAplicando métrica Midiendo total de métodos declarados");
        
       /* Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese el nombre del Paquete: ");
        String sPackageName = sc.nextLine();
        System.out.println("\nIngrese el nombre de la clase sin la extensión .java: ");
        String sClassName = sc.nextLine();*/
        
        int Mcount=0,MthdLen=0;
         try {
        	// Class<?> cls = Class.forName(sPackageName+"."+sClassName);
        	 Class<?> cls = Class.forName(sPackage+"."+sClass);
          // Class<?> cls = Class.forName("pckFacadeDms.DMS");
        Method methlist[]= cls.getDeclaredMethods();
            for (int i = 0; i < methlist.length;i++)
            {  
               Method m = methlist[i];
               Mcount = Mcount + 1;
               MthdLen=MthdLen+(m.getName().length());
            }
         }
         catch (Throwable e) {
            System.err.println(e);
         }
       //  sc.close();
      //  System.out.println("El total de métodos declarados en la clase es: " + Mcount);
        return Mcount;
    }//cierre método CountMethods
    
    private void metricClass3(){
       //System.out.println("\nAplicando métrica 3 - Conteo de clases Java");
    	
    	
    }
    
    public void measuringConstructionProduct(){
        metricCountLines("project","package","class");
        metricCountMethods("package", "class");
        metricClass3();
    }
}
