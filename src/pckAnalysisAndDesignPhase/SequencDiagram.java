package pckAnalysisAndDesignPhase;

//import java.util.Scanner;
import java.io.*;

public class SequencDiagram extends DesignProduct
{
	
	
    public  SequencDiagram(){
        System.out.println("\nMeasuring Sequence Diagram...");
    }
    
    public int metNumActor(String sFileName){
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
    }
    
    public int metNumLifeLine(String sFileName2){
    //System.out.println("2. Metric NMRC");
    	String testString = "UML:ClassifierRole";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sFileName2+".xml";
        String strLine;
        int numRead=0;
        int iTotalLifeLine=0;

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
            iTotalLifeLine = numRead/2;

        }catch (Exception e){
        }
        System.out.println("El total de líneas de vida especificadas en el diagrama es: "+iTotalLifeLine);
        return iTotalLifeLine;
    }
    
    public int metNumMessage(String sFileName3){
    //System.out.println("3. Metric NDM");
    	String testString = "UML:Message";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sFileName3+".xml";
        String strLine;
        int numRead=0;
        int iTotalMessage=0;

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
            iTotalMessage = numRead/2;

        }catch (Exception e){
        }
        System.out.println("El total de mensajes existentes en el diagrama es: "+iTotalMessage);
        return iTotalMessage;

    }
    
    private void metNDM2(){
   // System.out.println("4. Metric NDM2");
    }
    
    
    public void measurementsDesign(){
        metNumActor("filename");
        metNumLifeLine("filename2");
        metNumMessage("filename3");
        metNDM2();
    }
}
