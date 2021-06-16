
package analizadorSintactico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Globales {
    static Listatablasimbolos LU = new Listatablasimbolos();
    static Listatablasimbolosreservada LS = new Listatablasimbolosreservada();
    static Listadelimitadores LL= new Listadelimitadores();
    static ListaNumeros LNU= new ListaNumeros();
   
   static void GrabarVariables(){
     
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(System.getProperty("user.dir")+"/datosVariablesTXT.txt");
            pw = new PrintWriter(fichero);
            Tablasimbolos u;
            for (int i = 0; i < LU.getN(); i++){
                u = LU.getElemento(i);
                String Linea = u.getId()+"#"+u.getNombre()+"#"+u.getTokens();
                pw.println(Linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
            if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }

        }
 }
    
 
   static void LeerVariables(){
        
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
 
      try {
     
         archivo = new File (System.getProperty("user.dir")+"/datosVariablesTXT.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
         // Lectura del fichero
         LU =new Listatablasimbolos();
         String linea;
         
         while((linea=br.readLine())!=null){
            
            String[] datos = linea.toString().split("#");
            Tablasimbolos u =new Tablasimbolos(Integer.parseInt(datos[0]),datos[1],datos[2]);
            LU.agregar(u);
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
       
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      
    } 
    
   static void Grabarreservada(){
     
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(System.getProperty("user.dir")+"/datosreservadoTXT.txt");
            pw = new PrintWriter(fichero);
            Tablasimbolosreservada p;
            for (int i = 0; i < LS.getN(); i++){
                p = LS.getElemento(i);
                String Linea = p.getId()+"#"+p.getNombre()+"#"+p.getTokens();
                pw.println(Linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
         
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }

        }
 }
    
 
   static void Leerreservada(){
        
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
 
      try {
         
         archivo = new File (System.getProperty("user.dir")+"/datosreservadoTXT.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
      
         LS =new Listatablasimbolosreservada();
         String linea;
         
         while((linea=br.readLine())!=null){
            
            String[] datos = linea.toString().split("#");
            Tablasimbolosreservada u =new Tablasimbolosreservada(Integer.parseInt(datos[0]),datos[1],datos[2]);
            LS.agregar(u);
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
        
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      
    } 
   
    static void GrabarIDVariables(){
     
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(System.getProperty("user.dir")+"/datosVariablesidTXT.txt");
            pw = new PrintWriter(fichero);
            Tablasimbolos u;
            for (int i = 0; i < LU.getN(); i++){
                u = LU.getElemento(i);
                String Linea =u.getId()+"";
                pw.println(Linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }

        }
 }
    
 static void LeerrID(){
        
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
 
      try {
      
         archivo = new File (System.getProperty("user.dir")+"/datosVariablesidTXT.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
         
         LU =new Listatablasimbolos();
         String linea;
         
         while((linea=br.readLine())!=null){
            
            String[] datos = linea.toString().split("#");
            Tablasimbolos u =new Tablasimbolos(datos[0]);
            LU.agregar(u);
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      
    }  
   
    static void Grabardelimitadores(){
     
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(System.getProperty("user.dir")+"/datosdemlimitadoresTXT.txt");
            pw = new PrintWriter(fichero);
            Tabladelimitadores u;
            for (int i = 0; i < LL.getN(); i++){
                u = LL.getElemento(i);
                String Linea = u.getId()+"#"+u.getNombre()+"#"+u.getTokens();
                pw.println(Linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
         
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }

        }
 }
    
 
   static void LeerDelimitadores(){
        
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
 
      try {
       
         archivo = new File (System.getProperty("user.dir")+"/datosdemlimitadoresTXT.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
         // Lectura del fichero
         LL =new Listadelimitadores();
         String linea;
         
         while((linea=br.readLine())!=null){
            
            String[] datos = linea.toString().split("#");
            Tabladelimitadores u =new Tabladelimitadores(Integer.parseInt(datos[0]),datos[1],datos[2]);
            LL.agregar(u);
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
     
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      
    } 
   
   
    static void Grabarnu(){
     
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(System.getProperty("user.dir")+"/datosnuTXT.txt");
            pw = new PrintWriter(fichero);
            Tablanumeros u;
            for (int i = 0; i < LNU.getN(); i++){
                u = LNU.getElemento(i);
                String Linea = u.getId()+"#"+u.getNombre()+"#"+u.getTokens();
                pw.println(Linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }

        }
 }
    
 
   static void Leernu(){
        
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
 
      try {
    
         archivo = new File (System.getProperty("user.dir")+"/datosnuTXT.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
    
         LNU =new ListaNumeros();
         String linea;
         
         while((linea=br.readLine())!=null){
            
            String[] datos = linea.toString().split("#");
            Tablanumeros u =new Tablanumeros(Integer.parseInt(datos[0]),datos[1],datos[2]);
            LNU.agregar(u);
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
       
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      
    } 
 
   
   static String respuesta(){
       return "  ";
       
   }
}
