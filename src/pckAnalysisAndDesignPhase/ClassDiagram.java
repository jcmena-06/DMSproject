package pckAnalysisAndDesignPhase;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ClassDiagram extends DesignProduct
{
    public ClassDiagram(){
        
        System.out.println("\nMeasuring Class Diagram...");
    }
    
    public int measuringClass(String sNameFile){
    System.out.println("1. Measuring Number of classes");
    int iResultado=0;
    try {
		String filepath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sNameFile+".xml";
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(filepath);

		NodeList list = doc.getElementsByTagName("Stereotype");

		iResultado = list.getLength();
	} catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	} catch (IOException ioe) {
		ioe.printStackTrace();
	} catch (SAXException sae) {
		sae.printStackTrace();
	}
    	System.out.println("El resultado es: " +iResultado);
    	return iResultado;
    }//fin método
    
    public double measuringRelAggregation(String sNameFile2){
   // System.out.println("2. Measuring Aggregation Relations");
    	String testString = "value="+"\"Aggregation\"";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sNameFile2+".xml";
        String strLine;
        int numRead=0;
        int iTotalRelAggregation=0;

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
            iTotalRelAggregation = numRead;

        }catch (Exception e){
        }
        System.out.println("El total de relaciones tipo Agregación especificadas en el diagrama es: "+iTotalRelAggregation);
        return iTotalRelAggregation;
    }
    
    public double measurinRelDependency(String sNameFile3){
   // System.out.println("3. Measuring Dependency");
    	String testString = "value="+"\"Dependency\"";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sNameFile3+".xml";
        String strLine;
        int numRead=0;
        int iTotalRelDependency=0;

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
            iTotalRelDependency = numRead;

        }catch (Exception e){
        }
        System.out.println("El total de relaciones tipo Dependencia especificadas en el diagrama es: "+iTotalRelDependency);
        return iTotalRelDependency;
    }
    
    public double measuringRelAssociation(String sNameFile4){
    	String testString = "value="+"\"Association\"";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sNameFile4+".xml";
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
        System.out.println("El total de relaciones tipo Asociación especificadas en el diagrama es: "+iTotalRelAssociation);
        return iTotalRelAssociation;
    }
    
    public double measuringRelGeneralization(String sNameFile5){
    	String testString = "value="+"\"Generalization\"";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sNameFile5+".xml";
        String strLine;
        int numRead=0;
        int iTotalRelGeneralization=0;

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
            iTotalRelGeneralization = numRead;

        }catch (Exception e){
        }
        System.out.println("El total de relaciones tipo Generalizacón especificadas en el diagrama es: "+iTotalRelGeneralization);
        return iTotalRelGeneralization;
    }
    
    public double measuringRelComposition(String sNameFile6){
    	String testString = "value="+"\"Strong\"";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sNameFile6+".xml";
        String strLine;
        int numRead=0;
        int iTotalRelComposition=0;

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
            iTotalRelComposition = numRead;

        }catch (Exception e){
        }
        System.out.println("El total de relaciones tipo Composición especificadas en el diagrama es: "+iTotalRelComposition);
        return iTotalRelComposition;
    }
    
    public double measuringTotalPackage(String sNameFile7){
    	//String testString = "value="+"\"Package\"";
    	String testString = "UML:ClassifierRole";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sNameFile7+".xml";
        String strLine;
        int numRead=0;
        int iTotalPackage=0;

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
            iTotalPackage = numRead/2;

        }catch (Exception e){
        }
        System.out.println("El total de Paquetes especificados en el diagrama es: "+iTotalPackage);
        return iTotalPackage;
    }
    
    public double measuringTotalClasses(String sNameFile8){
    	String testString = "value="+"\"element\"";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sNameFile8+".xml";
        String strLine;
        int numRead=0;
        int iTotalClasses=0;

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
            iTotalClasses = numRead;

        }catch (Exception e){
        }
        System.out.println("El total de Clases especificadas en el diagrama es: "+iTotalClasses);
        return iTotalClasses;
    }
    
    public double measuringAbstractClass(String sFileName9){
    	String testString = "isAbstract="+"\"true\"";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sFileName9+".xml";
        String strLine;
        int numRead=0;
        int iTotalAbstractClasses=0;

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
            iTotalAbstractClasses = numRead;

        }catch (Exception e){
        }
        System.out.println("El total de Clases Abstractas especificadas en el diagrama es: "+iTotalAbstractClasses);
        return iTotalAbstractClasses;
    }//fin Total Abstracts Class
    
    public double measuringAttributes(String sFileName10){
    	String testString = "UML:StructuralFeature";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sFileName10+".xml";
        String strLine;
        int numRead=0;
        int iTotalAttributes=0;

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
            iTotalAttributes = numRead/2;

        }catch (Exception e){
        }
        System.out.println("El total de Atributos especificados en la clase es: "+iTotalAttributes);
        return iTotalAttributes;
    }//fin Total Attributes
    
    public double measuringMethods(String sFileName11){
    	String testString = "UML:Operation";
        String filePath = "c:/Users/ph4rr3l/workspace/DMSver6WSDL/"+sFileName11+".xml";
        String strLine;
        int numRead=0;
        int iTotalMethods=0;

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
            iTotalMethods = numRead/2;

        }catch (Exception e){
        }
        System.out.println("El total de Metodos especificados en la clase es: "+iTotalMethods);
        return iTotalMethods;
    }//fin Total Methods
    
    
    
    public void measurementsDesign(){
        measuringClass("namefile");
        measuringRelAggregation("namefile2");
        measurinRelDependency("namefile3");
        measuringRelAssociation("namefile4");
        measuringRelGeneralization("namefile5");
        measuringRelComposition("namefile6");
        measuringTotalPackage("namefile7");
        measuringTotalClasses("namefile8");
        measuringAbstractClass("namefile9");
        measuringAttributes("namefile10");
        measuringMethods("namefile11");
    }
   
}
