package com.upc.excepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utilitario {
    public static void leerFile(String path) throws Exception {
        Scanner sc=null;
        FileInputStream fis=null;
        try {
            fis = new FileInputStream(path);//checked exception
            sc = new Scanner(fis);    //file to be scanned
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());      //returns the line that was skipped
            }
        }catch(FileNotFoundException e){
            //......grabar en el log la excepcion técnica e
            throw new Exception("Vuelva a intentarlo, no se pudo leer el archivo");//lanza la excepción o propaga
        }
        finally{
            if(sc!=null) {
                sc.close();
            }
            if(fis!=null){
              fis.close();
            }

        }
    }
}
