package pckAnalysisAndDesignPhase;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class UseCase extends DesignProduct
{
	
    public UseCase(){
        System.out.println("\nMeasuring Use Case Diagram...");
    }
    
    public double measuringActor(String sFileName){
    System.out.println("1. Measuring Actor");
    String testString = "UML:Actor";
    String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sFileName+".xml";
    String strLine;
    int numRead=0;
    int iTotalActors=0;

    try {
        FileInputStream fstream = new FileInputStream(filePath);
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        while ((strLine = br.readLine()) != null)   {
            strLine = strLine + " ";
            String [] strArry = strLine.split(testString);

            if (strArry.length > 1) {
                 numRead = numRead + strArry.length - 1;
            }
            else {
                 if (strLine == testString) {
                     numRead++;
                 }
            }
        }

        in.close();
        iTotalActors = numRead/2;

    }catch (Exception e){
    }
    System.out.println("El total de actores especificados en el diagrama es: "+iTotalActors);
    return iTotalActors;
   
    }//fin TotalActors
    
    public double measuringUseCase(String sFileName2){
    System.out.println("2. Measuring Use Cases");
    String testString = "UML:UseCase";
    String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sFileName2+".xml";
    String strLine;
    int numRead=0;
    int iTotalUseCases=0;

    try {
        FileInputStream fstream = new FileInputStream(filePath);
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        while ((strLine = br.readLine()) != null)   {
            strLine = strLine + " ";
            String [] strArry = strLine.split(testString);

            if (strArry.length > 1) {
                 numRead = numRead + strArry.length - 1;
            }
            else {
                 if (strLine == testString) {
                     numRead++;
                 }
            }
        }

        in.close();
        iTotalUseCases = numRead/2;

    }catch (Exception e){
    }
    System.out.println("El total de CU especificados en el diagrama es: "+iTotalUseCases);
    return iTotalUseCases;
    }//fin Use Cases
    
    public double measuringAssociation(String sFileName3){
    System.out.println("3. Measuring Association");
    String testString = "UML:Association";
    String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sFileName3+".xml";
    String strLine;
    int numRead=0;
    int iTotalAssociation=0;

    try {
        FileInputStream fstream = new FileInputStream(filePath);
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        while ((strLine = br.readLine()) != null)   {
            strLine = strLine + " ";
            String [] strArry = strLine.split(testString);

            if (strArry.length > 1) {
                 numRead = numRead + strArry.length - 1;
            }
            else {
                 if (strLine == testString) {
                     numRead++;
                 }
            }
        }

        in.close();
        iTotalAssociation = (numRead/2)/4;

    }catch (Exception e){
    }
    System.out.println("El total de asociaciones especificadas en el diagrama es: "+iTotalAssociation);
    return iTotalAssociation;
    }//fin Association
    
    public int measuringIncludes(String sFileName4){
    System.out.println("4. Measuring Total Includes Relations");
    	String testString = "name="+"\"include\"";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sFileName4+".xml";
        String strLine;
        int numRead=0;
        int iTotalIncludes=0;

        try {
            FileInputStream fstream = new FileInputStream(filePath);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            while ((strLine = br.readLine()) != null)   {
                strLine = strLine + " ";
                String [] strArry = strLine.split(testString);

                if (strArry.length > 1) {
                     numRead = numRead + strArry.length - 1;
                }
                else {
                     if (strLine == testString) {
                         numRead++;
                     }
                }
            }

            in.close();
            iTotalIncludes = numRead;

        }catch (Exception e){
        }
        System.out.println("El total de includes especificados en el diagrama es: "+iTotalIncludes);
        return iTotalIncludes;
    }//Fin met Includes
    
    public int measuringExtends(String sFileName5){
    	System.out.println("4. Measuring Total Extends Relations");
    	String testString = "name="+"\"extend\"";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sFileName5+".xml";
        String strLine;
        int numRead=0;
        int iTotalExtends=0;

        try {
            FileInputStream fstream = new FileInputStream(filePath);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            while ((strLine = br.readLine()) != null)   {
                strLine = strLine + " ";
                String [] strArry = strLine.split(testString);

                if (strArry.length > 1) {
                     numRead = numRead + strArry.length - 1;
                }
                else {
                     if (strLine == testString) {
                         numRead++;
                     }
                }
            }

            in.close();
            iTotalExtends = numRead;

        }catch (Exception e){
        }
        System.out.println("El total de extends especificados en el diagrama es: "+iTotalExtends);
        return iTotalExtends;
    	
    }//Fin met Extends
    
    public int measuringRelAssociation(String sFileName6){
    	System.out.println("4. Measuring Total Association Relations");
    	String testString = "value="+"\"Association\"";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sFileName6+".xml";
        String strLine;
        int numRead=0;
        int iTotalRelAssociation=0;

        try {
            FileInputStream fstream = new FileInputStream(filePath);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            while ((strLine = br.readLine()) != null)   {
                strLine = strLine + " ";
                String [] strArry = strLine.split(testString);

                if (strArry.length > 1) {
                     numRead = numRead + strArry.length - 1;
                }
                else {
                     if (strLine == testString) {
                         numRead++;
                     }
                }
            }

            in.close();
            iTotalRelAssociation = numRead;

        }catch (Exception e){
        }
        System.out.println("El total de relaciones tipo asociación especificados en el diagrama es: "+iTotalRelAssociation);
        return iTotalRelAssociation;
    	
    }//Fin Association Relation
    
    public void measurementsDesign(){
        measuringActor("filename");
        measuringUseCase("filename2");
        measuringAssociation("filename3");
        measuringIncludes("filename4");
        measuringExtends("filename5");
        measuringRelAssociation("filename6");
    }
}
