package pckAnalysisAndDesignPhase;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class StateDiagram extends DesignProduct
{
    public StateDiagram(){
        System.out.println("Ingresó a la medición del diagrama de estados");
    }
    
    public double measuringStates(String sFileName){
    	 System.out.println("\nMedición del total de elementos especificados");
    	 String testString = "value="+"\"element\"";
         String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sFileName+".xml";
         String strLine;
         int numRead=0;
         int iTotalElements=0;

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
             iTotalElements = numRead;

         }catch (Exception e){
         }
         System.out.println("El total de elementos especificados en el diagrama es: "+iTotalElements);
         return iTotalElements;
    }//fin total elements
    
    public double measuringTotalState(String sFileName2){
    	String testString = "UML:SimpleState";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sFileName2+".xml";
        String strLine;
        int numRead=0;
        int iTotalStates=0;

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
            iTotalStates = numRead/2;

        }catch (Exception e){
        }
        System.out.println("El total Estados especificados en el diagrama es: "+iTotalStates);
        return iTotalStates;
    }// fin Total States
    
    public double measuringTotalTransition(String sFilename3){
    	String testString = "value="+"\"StateFlow\"";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sFilename3+".xml";
        String strLine;
        int numRead=0;
        int iTotalTransitions=0;

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
            iTotalTransitions = numRead;

        }catch (Exception e){
        }
        System.out.println("El total de transicions especificadas en el diagrama es: "+iTotalTransitions);
        return iTotalTransitions;
    }// fin Total Transitions
    
    public double measuringTotalJoins(String sFileName4){
    	String testString = "kind="+"\"join\"";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sFileName4+".xml";
        String strLine;
        int numRead=0;
        int iTotalJoins=0;

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
            iTotalJoins = numRead;

        }catch (Exception e){
        }
        System.out.println("El total de elementos Join especificados en el diagrama es: "+iTotalJoins);
        return iTotalJoins;
    }//fin Total Joins
    
    public double measuringChoice(String sFilename5){
    	String testString = "name="+"\"Choice\"";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sFilename5+".xml";
        String strLine;
        int numRead=0;
        int iTotalChoice=0;

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
            iTotalChoice = numRead;

        }catch (Exception e){
        }
        System.out.println("El total de elementos de Decisión especificados en el diagrama es: "+iTotalChoice);
        return iTotalChoice;
    }// Fin Total Choice
    
    public double measuringInitial(String sFileName6){
    	String testString = "kind="+"\"initial\"";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sFileName6+".xml";
        String strLine;
        int numRead=0;
        int iTotalInitial=0;

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
            iTotalInitial = numRead;

        }catch (Exception e){
        }
        System.out.println("El total de elementos Iniciales especificados en el diagrama es: "+iTotalInitial);
        return iTotalInitial;
    }// Fin Total Initial
    
    public double measuringFinal(String sFileName7){
    	String testString = "kind="+"\"final\"";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sFileName7+".xml";
        String strLine;
        int numRead=0;
        int iTotalFinal=0;

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
            iTotalFinal = numRead;

        }catch (Exception e){
        }
        System.out.println("El total de elementos Finales especificados en el diagrama es: "+iTotalFinal);
        return iTotalFinal;

    }
    
    public void measurementsDesign(){
        measuringStates("filename");
        measuringTotalState("filename2");
        measuringTotalTransition("filename3");
        measuringTotalJoins("filename4");
        measuringChoice("filename5");
        measuringInitial("filename6");
        measuringFinal("filename7");
    }
}
