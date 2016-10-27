
package primitiveutfchars;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author plago-bergonpazos
 */
public class Primitiveutfchars {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //String declarado
        String cadena = "Esta e unha cadea\n";
        
        //Creación del archivo "file"
        File texto = new File ("/home/local/DANIELCASTELAO/plago-bergonpazos/NetBeansProjects/primitiveutfchars/texto5.txt");
        
        //Input&Output
        DataOutputStream write = new DataOutputStream ( new FileOutputStream(texto));
        DataInputStream read = new DataInputStream ( new FileInputStream(texto));
        
        //Procesesemos a la programasión wey
        write.writeUTF(cadena);
        
         System.out.println("writeChars escribiu: "+cadena+
        "writeChars UTF escribiu: "+write.size()+" bytes\n");
        
        //Se escribe segunda linea
        write.writeChars(cadena);
        System.out.println("writeChars escribiu: "+cadena+
        "writeChars char escribiu: "+(write.size()-20)+" bytes\n\n");
        //Se escribe la tercera linea
        write.writeUTF(cadena);
        System.out.println( "wirteChars escribiu: "+cadena+
        "writeChars UTF escribiu: "+(write.size()-20-36)+" bytes\n");
        System.out.println("Bytes escritos en total: "+write.size()+" bytes\n\n");
      //  write.close();
        
      
        
        System.out.println("lemos a primeira cadea en UTF: "+read.readUTF()+
                "numero de bytes lidos: "+(write.size()-read.available()+" bytes")+"\n"+
                "numero de bytes por ler: "+(read.available()+" bytes")+"\n");
        
          String s = "";
        
         for(int i = 0;i<18;i++){
         char c = read.readChar();
         s+=c;
        }
        
        System.out.println("lemos a segunda cadea en Char: "+s+
                "numero de bytes lidos: "+(write.size()-read.available()-20+" bytes")+"\n"+
                "numero de bytes por ler: "+(read.available())+" bytes \n");
        
        System.out.println("lemos a terceira cadea en UTF: "+read.readUTF());
               
        
                  
                
    }
    
}
