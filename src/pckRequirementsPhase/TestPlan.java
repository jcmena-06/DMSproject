package pckRequirementsPhase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
//import java.util.Scanner;
import java.util.ArrayList;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class TestPlan extends Product
{
    //private static final ArrayList<String> ListValues = null;

	public TestPlan(){
        System.out.println("\nMidiendo Documento de Plan de Pruebas...");   
    }
    
    public void measuringContent(String sArchivo){
    	//String fileName;
        System.out.println("1. Measuring Content");
        
        System.out.println("1. Midiendo Contenido - Obteniendo contenido del documento");
        PDDocument pd;
        BufferedWriter wr;

        try {
        	/*Scanner sc = new Scanner(System.in);
        	System.out.println("Ingrese el nombre del archivo pdf a leer: ");
        	String archivo = sc.nextLine();*/
        	   
                //System.out.println("\nIdentificando secciones del documento "+sArchivo);
                //String nameFile="";
               // C:\Users\ph4rr3l\workspace\DMSver6WSDL
       	 	    //File input = new File("/Users/jcmm/Documents/DMSversionFinal/DMSver6WSDL/"+sArchivo+".pdf");
        	    File input = new File("/Users/jcmm/Documents/DMSversionFinal/DMSver6WSDL/PlanDePruebas.pdf");
       	 	   // File input = new File("C:/Users/ph4rr3l/workspace/DMSver6WSDL/doc2.pdf");
                File output = new File("/Users/jcmm/Documents/DMSversionFinal/DMSver6WSDL/parse.txt"); 
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
               //sc.close();
        } catch (Exception e){
                e.printStackTrace();
               } 
       // String fileName=sArchivo;
        
       // return fileName;
    }//fin método measuringContent
    
    public ArrayList<String> measuringStrings(){
    System.out.println("\n2. Measuring Strings");
    
    ArrayList<String> listavalores = new ArrayList<String>();
    
    try {
    	String stringSearch = "Introducción";
        String stringSearch2 = "Pruebas";
        
        // Open the file c:\test.txt as a buffered reader
        BufferedReader bf = new BufferedReader(new FileReader("/Users/jcmm/Documents/DMSversionFinal/DMSver6WSDL/parse.txt"));
       // BufferedReader bf2 = new BufferedReader(new FileReader("C:/Users/ph4rr3l/workspace/DMSver6WSDL/parse.txt"));
        

        // Start a line count and declare a string to hold our current line.
        int linecount = 0;
        //int linecount2 = 0;
            String line;
           // String line2;
            

        // Let the user know what we are searching for
        System.out.println("\nBuscando la cadena :" + stringSearch + ": en el archivo...");
       // System.out.println("Buscando la cadena :" + stringSearch2 + ": en el archivo...");

        // Loop through each line, stashing the line into our line variable.
        while (( line = bf.readLine()) != null){
            // Increment the count and find the index of the word
            linecount++;
           // linecount2++;
            int indexfound = line.indexOf(stringSearch);

            // If greater than -1, means we found the word
            if (indexfound > -1) {
                System.out.println("La cadena :" +stringSearch+ ": fue encontrada en la posición " + indexfound + " en la línea " + linecount);
                //boolean Validar = true;
                //if()
            }
        }
        bf.close();
        
        BufferedReader bf2 = new BufferedReader(new FileReader("/Users/jcmm/Documents/DMSversionFinal/DMSver6WSDL/parse.txt"));
        int linecount2 = 0;
        String line2;
        System.out.println("\nBuscando la cadena :" + stringSearch2 + ": en el archivo...");
        
        while (( line2 = bf2.readLine()) != null){
            // Increment the count and find the index of the word
            //linecount++;
            linecount2++;
            int indexfound2 = line2.indexOf(stringSearch2);

            // If greater than -1, means we found the word
            if (indexfound2 > -1) {
                System.out.println("La cadena :" +stringSearch2+ ": fue encontrada en la posición " + indexfound2 + " en la línea " + linecount2);
            }
        }
        bf2.close();
        
        String stringSearch3 = "Especificación de las pruebas";
        BufferedReader bf3 = new BufferedReader(new FileReader("/Users/jcmm/Documents/DMSversionFinal/DMSver6WSDL/parse.txt"));
        int linecount3 = 0;
        String line3;
        System.out.println("\nBuscando la cadena :" + stringSearch3 + ": en el archivo...");
        
        while (( line3 = bf3.readLine()) != null){
            // Increment the count and find the index of the word
            //linecount++;
            linecount3++;
            int indexfound3 = line3.indexOf(stringSearch3);

            // If greater than -1, means we found the word
            if (indexfound3 > -1) {
                System.out.println("La cadena :" +stringSearch3+ ": fue encontrada en la posición " + indexfound3 + " en la línea " + linecount3);
            }
        }
        bf3.close();
        
        String stringSearch4 = "Resultados de las pruebas";
        BufferedReader bf4 = new BufferedReader(new FileReader("/Users/jcmm/Documents/DMSversionFinal/DMSver6WSDL/parse.txt"));
        int linecount4 = 0;
        String line4;
        System.out.println("\nBuscando la cadena :" + stringSearch4 + ": en el archivo...");
        
        while (( line4 = bf4.readLine()) != null){
            // Increment the count and find the index of the word
            //linecount++;
            linecount4++;
            int indexfound4 = line4.indexOf(stringSearch4);

            // If greater than -1, means we found the word
            if (indexfound4 > -1) {
                System.out.println("La cadena :" +stringSearch4+ ": fue encontrada en la posición " + indexfound4 + " en la línea " + linecount4);
            }
        }
        bf4.close();
        
        String stringSearch5 = "Conclusiones de las pruebas";
        BufferedReader bf5 = new BufferedReader(new FileReader("/Users/jcmm/Documents/DMSversionFinal/DMSver6WSDL/parse.txt"));
        int linecount5 = 0;
        String line5;
        System.out.println("\nBuscando la cadena :" + stringSearch5 + ": en el archivo...");
        
        while (( line5 = bf5.readLine()) != null){
            // Increment the count and find the index of the word
            //linecount++;
            linecount5++;
            int indexfound5 = line5.indexOf(stringSearch5);

            // If greater than -1, means we found the word
            if (indexfound5 > -1) {
                System.out.println("La cadena :" +stringSearch5+ ": fue encontrada en la posición " + indexfound5 + " en la línea " + linecount5);
            }
        }
        bf5.close();

        //Se agregan los valores a un arraylist
        listavalores.add(stringSearch);
        listavalores.add(linecount+"");
        listavalores.add(stringSearch2);
        listavalores.add(linecount2+"");
        listavalores.add(stringSearch3+"");
        listavalores.add(line3+"");
        
       // TestPlan oValuesTestPlan = new TestPlan(stringSearch, linecount, stringSearch2);
    	}
        catch (IOException e) {
            System.out.println("IO Error Occurred: " + e.toString());
        }
     	
		return listavalores;
    }// fin método measuringStrings
    
    private void measuringImages(){
   // System.out.println("\n3. Measuring Images");
    }//fin método measuringImages
    
    private void measuringTestPlans(){
   // System.out.println("\n4. Measuring Test Plans");
    }// fin método measuringTestPlans
    
    public void measurements(){
        measuringContent("archivo");
        measuringStrings();
        measuringImages();
        measuringTestPlans();
    }
}
