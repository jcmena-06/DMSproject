package pckAnalysisAndDesignPhase;

import java.io.*;
import java.util.*;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class AnalysisAndDesignDocument extends DesignDocumentProduct
{
    public AnalysisAndDesignDocument(){
        
        System.out.println("\nMidiendo Documento de Análisis y Diseño...");
    }
    
    public String measuringContent(String sArchivo){
    String fileName="";
    System.out.println("1. Measuring Content");
    
    System.out.println("1. Midiendo Contenido - Obteniendo contenido del documento");
    PDDocument pd;
    BufferedWriter wr;

    try {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Ingrese el nombre del archivo pdf a leer: ");
    	String archivo = sc.nextLine();
    	   
            System.out.println("\nIdentificando secciones del documento");
            //String nameFile="";
           // C:\Users\ph4rr3l\workspace\DMSver6WSDL
   	 	    File input = new File("C:/Users/ph4rr3l/workspace/DMSver6WSDL/"+archivo+".pdf");
   	 	   // File input = new File("C:/Users/ph4rr3l/workspace/DMSver6WSDL/doc2.pdf");
            File output = new File("C:/Users/ph4rr3l/workspace/DMSver6WSDL/parse.txt"); 
            pd = PDDocument.load(input);
            //System.out.println(pd.getNumberOfPages());
            //System.out.println(pd.isEncrypted());
            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setStartPage( 1 );
            stripper.setEndPage( 2 );
            wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output)));
            stripper.writeText(pd, wr);
            if (pd != null) {
                pd.close();
                //sc.close();
            }

           wr.close();
           sc.close();
    } catch (Exception e){
            e.printStackTrace();
           } 
    
    return fileName; 
    
    }//fin método measuringContent
    
    public void measuringStrings(){
    	try {
    	String stringSearch = "Estado del arte";
        String stringSearch2 = "Sección de comidas";
        // Open the file c:\test.txt as a buffered reader
        BufferedReader bf = new BufferedReader(new FileReader("C:/Users/ph4rr3l/workspace/DMSver6WSDL/parse.txt"));
        BufferedReader bf2 = new BufferedReader(new FileReader("C:/Users/ph4rr3l/workspace/DMSver6WSDL/parse.txt"));
        

        // Start a line count and declare a string to hold our current line.
        int linecount = 0;
            String line;

        // Let the user know what we are searching for
        System.out.println("Buscando la cadena :" + stringSearch + ": en el archivo...");
        System.out.println("Buscando la cadena :" + stringSearch2 + ": en el archivo...");

        // Loop through each line, stashing the line into our line variable.
        while (( line = bf.readLine()) != null){
            // Increment the count and find the index of the word
            linecount++;
            int indexfound = line.indexOf(stringSearch);

            // If greater than -1, means we found the word
            if (indexfound > -1) {
                System.out.println("\nLa cadena :" +stringSearch+ ": fue encontrada en la posición " + indexfound + " en la línea " + linecount);
            }
        }
        
        while (( line = bf2.readLine()) != null){
            // Increment the count and find the index of the word
            linecount++;
            int indexfound2 = line.indexOf(stringSearch2);

            // If greater than -1, means we found the word
            if (indexfound2 > -1) {
                System.out.println("\nLa cadena :" +stringSearch2+ ": fue encontrada en la posición " + indexfound2 + " en la línea " + linecount);
            }
        }

        // Close the file after done searching
        bf.close();
        bf2.close();
    	
    	}
        catch (IOException e) {
            System.out.println("IO Error Occurred: " + e.toString());
        }
    	
    	
    }// fin método Identificando Cadenas en txt
    
    private void measuringImages(){
    //System.out.println("3. Measuring Images");
    }
    
    private void measuringRequirements(){
   //System.out.println("4. Measuring Requirements");
    }
    
    public void measuringDocAnalysis(){
        measuringContent("archivo");
	    measuringStrings();
        measuringImages();
        measuringRequirements();
    }
    
}
